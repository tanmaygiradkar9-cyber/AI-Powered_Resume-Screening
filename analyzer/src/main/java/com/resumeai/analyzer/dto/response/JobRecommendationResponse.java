package com.resumeai.analyzer.dto.response;

import com.resumeai.analyzer.entity.JobRecommendation;

public record JobRecommendationResponse(
    Long id,
        String jobTitle,
        Integer matchPercentage,
        String salaryEstimate,
        String requiredSkillGaps,
        String careerRoadmap
) {
    public static JobRecommendationResponse from(JobRecommendation j) {
        return new JobRecommendationResponse(
                j.getId(), j.getJobTitle(), j.getMatchPercentage(),
                j.getSalaryEstimate(), j.getRequiredSkillGaps(), j.getCareerRoadmap());
    }
    
}
