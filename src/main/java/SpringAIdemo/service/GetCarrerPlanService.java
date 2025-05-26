package SpringAIdemo.service;


import SpringAIdemo.AIservice.AIService;
import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetCarrerPlanService {

    @Autowired
    private AIService aiService;

    public String getCareerPlan(String colour) {
        // Call the AI service to get the career plan
        String careerPlan = aiService.getCareerPlan(colour);

        // Return the career plan
        return careerPlan;

    }



}

