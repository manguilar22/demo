package guru.aguilar.demo.controllers.web;

import guru.aguilar.demo.domain.User;
import guru.aguilar.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/sample")
    public String myDatabaseView(Model model){
        model.addAttribute("test","Hello, world");
        return "sample";
    }

    @ModelAttribute("userDatabase")
    public Iterable<User> getAllDatabase(){
        return userRepository.findAll();
    }


}
