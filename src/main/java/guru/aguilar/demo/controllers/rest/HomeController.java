package guru.aguilar.demo.controllers.rest;

import guru.aguilar.demo.domain.Home;
import guru.aguilar.demo.repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * GET -
 * POST -
 */

@RestController
@RequestMapping(path = "/home")
public class HomeController {

    @Autowired
    private HomeRepository homeRepository;

    @GetMapping(path = "/",consumes = "application/json", produces = "application/json")
    public @ResponseBody Iterable<Home> getAll(){
        return homeRepository.findAll();
    }

    @GetMapping(path="/{id}",produces = "application/json")
    public @ResponseBody Home getSomeHome(@PathVariable Long id){
        Optional<Home> op = homeRepository.findById(id);
        return op.get();
    }

    @PostMapping(path="/",consumes = "application/json",produces = "application/json")
    public @ResponseBody String postSomething(@RequestBody Home home){
        if (home.getStreetAddress() == null){
            return "FAILED";
        }
        homeRepository.save(home);
        return "SAVED";
    }




}

