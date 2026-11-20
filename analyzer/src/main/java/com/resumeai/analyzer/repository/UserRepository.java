package com.resumeai.analyzer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resumeai.analyzer.entity.User;

@Repository 
public interface  UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    Optional<User>findByResetToken(String resetToken);
    boolean existsByEmail(String email);
    long countByEnabledTrue();
    
}
