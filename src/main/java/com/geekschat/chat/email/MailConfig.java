package com.geekschat.chat.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("localhost"); //host is Gmail, according to the application.yml file
        mailSender.setPort(1025);
        mailSender.setUsername("hello");
        mailSender.setPassword("hello");
        return mailSender;
    }
}
