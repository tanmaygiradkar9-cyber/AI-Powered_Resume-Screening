package com.resumeai.analyzer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resumeai.analyzer.entity.FeedbackHistory;
@Repository 
public interface FeedbackHistoryRepository extends JpaRepository<FeedbackHistory,Long> {
    List<FeedbackHistory> findByUserIdOrderByCreatedAtDesc(Long userId);
}
