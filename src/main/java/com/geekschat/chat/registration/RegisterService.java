package com.geekschat.chat.registration;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekschat.chat.email.EmailSender;
import com.geekschat.chat.geeksuser.GeeksUser;
import com.geekschat.chat.geeksuser.GeeksUserRole;
import com.geekschat.chat.geeksuser.GeeksUserService;
import com.geekschat.chat.registration.confirmpages.ConfirmedPages;
import com.geekschat.chat.registration.token.ConfirmToken;
import com.geekschat.chat.registration.token.ConfirmTokenService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegisterService {

    private GeeksUserService geeksUserService;
    private ConfirmTokenService confirmTokenService;
    private EmailValidator emailValid;
    private EmailSender emailSender;
    private ConfirmedPages pages;

    public String register(RegistrationRequest request) {

        boolean emailIsValid = emailValid.test(request.getEmail());

        if (!emailIsValid) {
            throw new IllegalStateException("Invalid email");
        }

        String token = geeksUserService.userSignUp(new GeeksUser(request.getFirstName(), request.getLastName(),
                request.getUsername(), request.getEmail(), request.getPassword(), GeeksUserRole.USER));

        String link = "http://localhost:8080/api/v1/registration/confirm?token=" + token;

        emailSender.sendMail(request.getEmail(), pages.buildEmail(request.getFirstName(), link));

        return token;
    }

    @Transactional
    public String tokenConfirmation(String token) {
        ConfirmToken confirmToken = confirmTokenService.getToken(token)
                .orElseThrow(() -> new IllegalStateException("Token not found"));

        if (confirmToken.getTimeConfirmed() != null) {
            return pages.mailExists();
            //throw new IllegalStateException("Email already confirmed");
        }

        LocalDateTime tokenExpired = confirmToken.getTimeExpire();

        if (tokenExpired.isBefore(LocalDateTime.now())) {
            return pages.tokenExprired();
            //throw new IllegalStateException("Token has expired");
        }

        confirmTokenService.setConfirmedAt(token);
        geeksUserService.enableUser(confirmToken.getGeeksUser().getEmail());

        return pages.buildEmailConfirm();
        //return "Email confirmed";
    }

    

    

}
