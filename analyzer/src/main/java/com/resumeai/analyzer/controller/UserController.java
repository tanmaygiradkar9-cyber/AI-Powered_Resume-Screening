package com.resumeai.analyzer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resumeai.analyzer.dto.response.ApiResponse;
import com.resumeai.analyzer.dto.response.UserResponse;
import com.resumeai.analyzer.util.SecurityUtils;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "User", description = "Current authenticated user profile")
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor 
public class UserController {

     private final SecurityUtils securityUtils;

    @Operation(summary = "Get the currently authenticated user")
    @GetMapping("/me")
    public ResponseEntity<ApiResponse<UserResponse>> me() {
        return ResponseEntity.ok(ApiResponse.ok(
                UserResponse.from(securityUtils.getCurrentUser())));
    }
    
}
