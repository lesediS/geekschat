package com.geekschat.chat.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender {

    private final JavaMailSender mailSender;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);


    @Override
    @Async
    public void sendMail(String to, String email) {
        try {
            MimeMessage mimeMsg = mailSender.createMimeMessage();
            MimeMessageHelper msgHelper = new MimeMessageHelper(mimeMsg, "utf-8");

            msgHelper.setText(email, true); // HTML email
            msgHelper.setTo(to); // the receiver
            msgHelper.setSubject("Confirm your account email address"); // email subject
            msgHelper.setFrom("geek@geekschat.com"); //the sender
            mailSender.send(mimeMsg);

        } catch (MessagingException e) {
            LOGGER.error("Email not sent", e);
            throw new IllegalStateException("Failed to send email");
        }
    }
}
