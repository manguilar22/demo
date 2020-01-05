package guru.aguilar.demo.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String mySampleView(Model model){
        model.addAttribute("test","Hello, world");
        return "sample";
    }

}
