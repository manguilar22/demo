package guru.aguilar.demo.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import guru.aguilar.demo.domain.User;
import guru.aguilar.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserNameController {

    private List<User> repo = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public @ResponseBody
    String getHomePage() {
        return "WORKS";
    }

    @PostMapping
    public @ResponseBody String postSomethingOnPage(@RequestBody User user) {
        String resp = user.toString();
        return resp;
    }

    @GetMapping("/size")
    public @ResponseBody Integer sizeOfDataRepository(){
        return  repo.size();
    }


    @PostMapping("/add")
    public @ResponseBody String addSomethingToPage(@RequestBody User user){
        userRepository.save(user);
        return "SAVED";
    }

    @GetMapping("/db")
    public @ResponseBody Iterable<User> getAllTheUsersInDB(){
        return userRepository.findAll();
    }

}
