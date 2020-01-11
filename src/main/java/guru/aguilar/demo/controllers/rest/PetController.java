package guru.aguilar.demo.controllers.rest;


import guru.aguilar.demo.domain.Pet;
import guru.aguilar.demo.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/*
POST - curl http://localhost:8080/pet/add --header "Content-type:application/json" --data ' {"name":"Pepsi","type":"cat"}' -X POST
GET - curl http://localhost:8080/pet/1
*/


@RestController
@RequestMapping(path = "/pet")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping(path = "/db",produces = "application/json")
    public @ResponseBody Iterable<Pet> gettingAllData(){
        return petRepository.findAll();
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public @ResponseBody String postingData(@RequestBody Pet pet){
        if (pet.getName() == null) {
            return  "EMPTY VALUE";
        }
        petRepository.save(pet);
        return  "SAVED SUCCESSFULLY";
    }

    @GetMapping(path = "/{id}",produces = "application/json")
    public @ResponseBody Pet getPetbyId(@PathVariable Long id){
        Optional<Pet> p = petRepository.findById(id);
        return  p.get();
    }


}
