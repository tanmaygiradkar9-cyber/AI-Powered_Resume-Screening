package com.resumeai.analyzer.dto.response;

import java.time.Instant;

import com.resumeai.analyzer.entity.User;

public record UserResponse(
    Long id,
        String fullName,
        String email,
        String role,
        boolean enabled,
        Instant createdAt
) {
     public static UserResponse from(User u) {
        return new UserResponse(
                u.getId(), u.getFullName(), u.getEmail(),
                u.getRole().name(), u.isEnabled(), u.getCreatedAt());
    }
    
}
