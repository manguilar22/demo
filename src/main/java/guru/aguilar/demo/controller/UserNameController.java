package guru.aguilar.demo.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import guru.aguilar.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserNameController {

    private List<User> repo = new ArrayList<>();

    @GetMapping
    public @ResponseBody
    String getHomePage() {
        return "WORKS";
    }


    @PostMapping
    public @ResponseBody
    String postSomethingOnPage(@RequestBody User user) {
        String resp = user.toString();
        return resp;

    }


    @GetMapping("/size")
    public @ResponseBody Integer sizeOfDataRepository(){
        return  repo.size();
    }


    @PostMapping("/add")
    public @ResponseBody String addSomethingToPage(@RequestBody User user){
        return "SAVED";
    }


}
