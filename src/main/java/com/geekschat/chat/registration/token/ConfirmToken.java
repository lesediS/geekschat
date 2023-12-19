package com.geekschat.chat.registration.token;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.geekschat.chat.appuser.AppUser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmToken {

    @Id
    @SequenceGenerator(name = "token_confirm_sequence", sequenceName = "token_confirm_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "token_confirm_sequence")
    private Long id;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private LocalDateTime timeCreated;

    @Column(nullable = false)
    private LocalDateTime timeExpire;

    private LocalDateTime timeConfirmed;

    @ManyToOne
    @JoinColumn(nullable = false, name = "app_user_id")
    private AppUser appUser;

    public ConfirmToken(String token, LocalDateTime timeCreated, LocalDateTime timeExpire, AppUser appUser) {
        this.token = token;
        this.timeCreated = timeCreated;
        this.timeExpire = timeExpire;
        this.appUser = appUser;
    }

}