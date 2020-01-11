package guru.aguilar.demo.controllers.web;

import guru.aguilar.demo.domain.User;
import guru.aguilar.demo.repositories.flux.UserFlux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;


@Controller
/**
 * Index Route - Flux
 */
public class Index {

    @Autowired
    private UserFlux userFlux;

    @GetMapping("/")
    public String doSomething(Model model){
        System.out.println(userFlux.getAllUsers());
        model.addAttribute("test","If this shows, this works");
        return "index";
    }

    @ModelAttribute("userList")
    public List<User> getAllMyUserList(){
        return  userFlux.getList();
    }

    @ModelAttribute("fluxExample")
    public Flux<User> getAllMyUser(){
        return userFlux.getAllUsers();
    }

    @ModelAttribute("fluxMap")
    public Map<Integer,User> getAllData(){
        return  userFlux.getMap();
    }


}
