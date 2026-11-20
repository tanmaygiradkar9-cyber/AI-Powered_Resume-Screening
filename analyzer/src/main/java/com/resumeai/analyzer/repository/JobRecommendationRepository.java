package com.resumeai.analyzer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.resumeai.analyzer.entity.JobRecommendation;
@Repository 
public interface JobRecommendationRepository extends JpaRepository<JobRecommendation, Long> {
    List<JobRecommendation> findByAnalysisId(Long analysisId);
    
}
