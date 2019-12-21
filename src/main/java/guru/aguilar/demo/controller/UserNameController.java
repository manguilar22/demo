package guru.aguilar.demo.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import guru.aguilar.demo.domain.User;
import guru.aguilar.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 *   curl http://localhost:8080/user/add -H "Content-type:application/json" -d ' { "name" : "kjdsjds","email":"fdsjfdsjk"} ' -X POST
 */
@RestController
@RequestMapping("/user")
public class UserNameController {

    private List<User> repo = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public @ResponseBody String getHomePage() {
        return "WORKS";
    }

    @PostMapping
    public @ResponseBody String postSomethingOnPage(@RequestBody User user) {
        String resp = user.toString();
        return resp;
    }

    @GetMapping("/{id}")
    public @ResponseBody User findById(@PathVariable Long id){
         Optional<User> op = userRepository.findById(id);
         return !op.isPresent() ? null : op.get();
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
