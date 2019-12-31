package guru.aguilar.demo.controller;

import com.google.gson.Gson;
import guru.aguilar.demo.domain.Pet;
import guru.aguilar.demo.repo.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * curl http://localhost:8080/pet/add -H "Content-type:application/json" -d ' { "name" : "kjdsjds","type":"fdsjfdsjk"} ' -X POST
 */
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping
    public @ResponseBody String getBackRootSayHello(){
        return "WORKS, From the PET CONTROLLER";
    }

    @PostMapping
    public @ResponseBody Pet submitPet(@RequestBody Pet pet){
        return pet;
    }

    @PostMapping("/add")
    public @ResponseBody String savePetToDatabase(@RequestBody Pet pet){
        Gson gson = new Gson();
        System.out.println("-> POST:\t"+gson.toJson(pet));
        petRepository.save(pet);
        return "SAVED";
    }

    @GetMapping("/db")
    public @ResponseBody Iterable<Pet> getAllPets(){
        return petRepository.findAll();
    }

    @GetMapping("/db/{id}")
    public @ResponseBody Pet getOnePetBasedOnId(@PathVariable Long id){
        Optional<Pet> op = petRepository.findById(id);
        return op.isPresent() ? op.get() : null;
    }


}
