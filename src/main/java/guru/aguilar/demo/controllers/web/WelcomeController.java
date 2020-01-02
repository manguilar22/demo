package guru.aguilar.demo.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WelcomeController {


    @GetMapping("/hello")
    public String main(Model model) {
        model.addAttribute("message", "Simple MESSAGE");
        model.addAttribute("tasks", "SImple TASK");

        return "welcome"; //view
    }

    // /say?name=kotlin
    @GetMapping("/say")
    public String mainWithParam(
            @RequestParam(name = "name", required = false, defaultValue = "")
                    String name, Model model) {

        model.addAttribute("message", name);

        return "welcome"; //view
    }

}