package com.geekschat.chat.appuser;

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
public class AppUserService implements UserDetailsService{

    private final UserRepository userRepository;
    private final String USER_NOT_FOUND_MSG = "No such user %s found";
    private final ConfirmTokenService confirmTokenService;
    private final BCryptPasswordEncoder passEncodeBcrypt;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String userSignUp(AppUser user){

        boolean userEmailExists = userRepository.findByEmail(user.getEmail()).isPresent();
        if(userEmailExists){
            throw new IllegalStateException("Email taken, try again");
        }

        String encodedPass = passEncodeBcrypt.encode(user.getPassword());
        user.setPassword(encodedPass);
        userRepository.save(user);

        String uuidToken = UUID.randomUUID().toString();
        ConfirmToken token = new ConfirmToken(uuidToken, LocalDateTime.now(), LocalDateTime.now().plusMinutes(15), user);

        confirmTokenService.saveConfirmToken(token);

        return uuidToken;
    }
    

    public int enableUser(String email) {
        return userRepository.enableAppUser(email);
    }
    
}
