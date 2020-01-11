package guru.aguilar.demo.controllers.rest;

import guru.aguilar.demo.domain.User;
import guru.aguilar.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * GET - curl http://localhost:8080/user
 * POST - curl http://localhost:8080/user/add -H "Content-Type:application/json" --data '{"firstName":"George","lastName":"Michael"}' -X POST
 */

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/db",produces = "application/json")
    public @ResponseBody Iterable<User> gettingAllData(){
        return userRepository.findAll();
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public @ResponseBody String postingData(@RequestBody User user){
        userRepository.save(user);
        return  "SAVED SUCCESSFULLY";
    }

    @GetMapping(path = "/{id}",produces = "application/json")
    public @ResponseBody User getPetbyId(@PathVariable Long id){
        Optional<User> p = userRepository.findById(id);
        return  p.get();
    }

}

