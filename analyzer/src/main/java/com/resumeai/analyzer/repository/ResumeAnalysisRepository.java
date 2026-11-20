package com.resumeai.analyzer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.resumeai.analyzer.entity.ResumeAnalysis;
@Repository 
public interface ResumeAnalysisRepository extends  JpaRepository<ResumeAnalysis, Long>{
    Optional<ResumeAnalysis> findByResumeId(Long resumeId);

    @Query("SELECT AVG(a.resumeScore) FROM ResumeAnalysis a WHERE a.resumeScore IS NOT NULL")
    Double averageResumeScore();

    @Query("SELECT AVG(a.atsScore) FROM ResumeAnalysis a WHERE a.atsScore IS NOT NULL")
    Double averageAtsScore();
}
