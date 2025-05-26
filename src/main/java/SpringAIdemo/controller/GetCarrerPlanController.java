package SpringAIdemo.controller;

import SpringAIdemo.service.GetCarrerPlanService;
import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "https://career-planner-app-8305041adb2a.herokuapp.com/")
@RestController
public class GetCarrerPlanController {

     @Autowired
     private GetCarrerPlanService getCarrerPlanService;

     @RequestMapping(method = RequestMethod.GET, value = "/plan")
     public String getCareerPlan(@RequestParam String career) {
         String careerPlan = getCarrerPlanService.getCareerPlan(career);
         return careerPlan;
     }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String hello() {
        return "Hello, World!";
    }


}
