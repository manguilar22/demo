package guru.aguilar.demo.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;


@Controller
public class WelcomeController {





    @GetMapping("/hello")
    public String main(Model model) {
        model.addAttribute("message", "Simple MESSAGE");
        model.addAttribute("title", "SImple TASK");

        return "welcome"; //view
    }

    // /say?name=kotlin
    @GetMapping("/say")
    public String mainWithParam(Model model ,@RequestParam(name = "name", required = false, defaultValue = "stranger") String name) {
        model.addAttribute("messages",name);
        return "welcome"; //view
    }


    @GetMapping("/saying")
    public String logMessagesWithParam(Model model){

        List<String> data = Arrays.asList(new String[]{"lfsaddl","lkdaf","lkds"});
        model.addAttribute("logs",data);
        return "welcome";
    }

    //@ModelAttribute("logs")
    public List<String> logMessages(){
        List<String> data = Arrays.asList(new String[]{"lfsaddl","lkdaf","lkds"});
        return data;
    }

}