package guru.aguilar.demo.controller;

import guru.aguilar.demo.domain.Country;
import guru.aguilar.demo.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryRepo countryRepo;

    @GetMapping
    public @ResponseBody String testConnectivityIfWorks(){
        return "Country WORKS";
    }

    @GetMapping("/db")
    public @ResponseBody Iterable<Country> getAllCountriesInDatabase(){
        return countryRepo.findAll();
    }


}
