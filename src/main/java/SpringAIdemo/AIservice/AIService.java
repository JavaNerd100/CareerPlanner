package SpringAIdemo.AIservice;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageModel;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.stereotype.Service;

@Service
public class AIService {


    private final ChatClient chatClient;

    private final OpenAiImageModel openaiImageModel;

    public AIService(ChatClient.Builder builder, OpenAiImageModel openaiImageModel) {
        this.chatClient = builder.build();
        this.openaiImageModel = openaiImageModel;
    }

    public String getCareerPlan(String careerName) {
        String prompt = "Create a detailed career plan for someone who wants to become a " + careerName +
                ". Include steps, skills, and timeline.";
        return chatClient.prompt(prompt).call().content();

    }

//    public ImageResponse getCareerPlan(String colour) {
////        String prompt = "Create a detailed career plan for someone who wants to become a " + careerName +
////                ". Include steps, skills, and timeline.";
////        return chatClient.prompt(prompt).call().content();
//
//        ImageResponse response = openaiImageModel.call(
//                new ImagePrompt("A light house colored with "+ colour+ " and a sunset in the background",
//                        OpenAiImageOptions.builder()
//                                .quality("hd")
//                                .N(1)
//                                .height(1024)
//                                .width(1024).build())
//
//        );
//        return response;
//    }

}
