package com.resumeai.analyzer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resumeai.analyzer.dto.response.ApiResponse;
import com.resumeai.analyzer.dto.response.DashBoardStatsResponse;
import com.resumeai.analyzer.service.DashboardService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "Dashboard", description = "Aggregated analytics for the current user")
@RestController 
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor 
public class DashboardController {
     private final DashboardService dashboardService;

    @Operation(summary = "Get dashboard statistics and chart data")
    @GetMapping
    public ResponseEntity<ApiResponse<DashBoardStatsResponse>> dashboard() {
        return ResponseEntity.ok(ApiResponse.ok(dashboardService.getDashboard()));
    }
}
