package com.geekschat.chat.registration;

import java.util.function.Predicate;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String email) {
        if(email == null || email.isEmpty() ){
            return false;
        }
        
        /*https://youtu.be/J7eaL2lRaHE?si=2EVcRP-KrrZ01s6S
            Regex to make sure email format is valid
        */
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(email).matches()) {
            return true;
        } else {
            System.out.println("Invalid email address");
            return false;
        }
    }

}
