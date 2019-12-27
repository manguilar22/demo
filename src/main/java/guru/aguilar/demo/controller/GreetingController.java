package guru.aguilar.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {

    //private String template = "Hello, %s";

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required=false,defaultValue="Stranger")String name, Model model){
        model.addAttribute("name",name);
        //return String.format(template,name);
        return "greeting";
    }


}
