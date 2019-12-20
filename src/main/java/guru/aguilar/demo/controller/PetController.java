package guru.aguilar.demo.controller;

import guru.aguilar.demo.domain.Pet;
import guru.aguilar.demo.repo.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * curl http://localhost:8080/pet/add -H "Content-type:application/json" -d ' { "name" : "kjdsjds","type":"fdsjfdsjk"} ' -X POST
 */
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping("/")
    public @ResponseBody String getBackRootSayHello(){
        return "WORKS, From the PET CONTROLLER";
    }


    @PostMapping("/")
    public @ResponseBody Pet submitPet(@RequestBody Pet pet){
        return pet;
    }

    @PostMapping("/add")
    public @ResponseBody String savePetToDatabase(@RequestBody Pet pet){
        petRepository.save(pet);
        return "SAVED";
    }


    @GetMapping("/db")
    public @ResponseBody Iterable<Pet> getAllPets(){
        return petRepository.findAll();
    }


}
