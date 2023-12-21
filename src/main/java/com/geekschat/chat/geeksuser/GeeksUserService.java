package com.geekschat.chat.geeksuser;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.geekschat.chat.registration.token.ConfirmToken;
import com.geekschat.chat.registration.token.ConfirmTokenService;

import java.util.UUID;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GeeksUserService implements UserDetailsService{

    private final GeeksUserRepository geeksUserRepository;
    private final String USER_NOT_FOUND_MSG = "No such user %s found";
    private final ConfirmTokenService confirmTokenService;
    private final BCryptPasswordEncoder passEncodeBcrypt;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return geeksUserRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String userSignUp(GeeksUser geeksUser){

        boolean userEmailExists = geeksUserRepository.findByEmail(geeksUser.getEmail()).isPresent();
        if(userEmailExists){
            throw new IllegalStateException("Email taken, try again");
        }

        String encodedPass = passEncodeBcrypt.encode(geeksUser.getPassword());
        geeksUser.setPassword(encodedPass);
        geeksUserRepository.save(geeksUser);

        String uuidToken = UUID.randomUUID().toString();
        ConfirmToken token = new ConfirmToken(uuidToken, LocalDateTime.now(), LocalDateTime.now().plusMinutes(15), geeksUser);

        confirmTokenService.saveConfirmToken(token);

        return uuidToken;
    }
    

    public int enableUser(String email) {
        return geeksUserRepository.enableAppUser(email);
    }
    
}
