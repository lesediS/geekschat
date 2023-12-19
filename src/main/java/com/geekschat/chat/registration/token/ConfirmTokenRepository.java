package com.geekschat.chat.registration.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.time.LocalDateTime;

@Repository
@Transactional
public interface ConfirmTokenRepository extends JpaRepository<ConfirmToken, Long>{

    Optional<ConfirmToken> findByToken(String token);

    @Transactional
    @Modifying
    @Query("UPDATE ConfirmToken c SET c.timeConfirmed = :confirmedAt WHERE c.token = :token")
    int updateTimeConfirmed(String token, LocalDateTime confirmedAt);
}
