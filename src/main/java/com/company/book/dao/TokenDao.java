package com.company.book.dao;

import com.company.book.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenDao extends JpaRepository<Token, Long> {

    Optional<Token> findByToken(String token);
}
