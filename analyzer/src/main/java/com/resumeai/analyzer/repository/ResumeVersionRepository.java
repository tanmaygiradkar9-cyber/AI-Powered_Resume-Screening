package com.resumeai.analyzer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resumeai.analyzer.entity.ResumeVersion;

@Repository 
public interface ResumeVersionRepository extends JpaRepository<ResumeVersion, Long>{
    List<ResumeVersion> findByResumeIdOrderByVersionNumberDesc(Long resumeId);

}
