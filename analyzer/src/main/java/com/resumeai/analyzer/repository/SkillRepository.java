package com.resumeai.analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resumeai.analyzer.entity.Skill;

@Repository 
public interface SkillRepository extends JpaRepository<Skill, Long> {
    
}
