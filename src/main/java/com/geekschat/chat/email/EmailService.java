package com.geekschat.chat.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender{

    private final JavaMailSender mailSender;
    private final static Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    @Override
    @Async
    public void sendMail(String to, String email) {
        try{
            MimeMessage mimeMsg = mailSender.createMimeMessage();
            MimeMessageHelper msgHelper = new MimeMessageHelper(mimeMsg, "utf-8");

            msgHelper.setText(email, true);
            msgHelper.setTo(to); //the receiver
            msgHelper.setSubject("Confirm your account email address"); //email subject
            msgHelper.setFrom("test@gmail.com"); //the sender
        } catch (MessagingException e){
            LOGGER.error("Failed to send email", e);
            throw new IllegalStateException("Failed to send email");
        }
    }

}
