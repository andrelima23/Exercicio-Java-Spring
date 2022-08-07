package one.digitalinnovation.andrelima23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import one.digitalinnovation.andrelima23.service.PokerService;

@RestController
@RequestMapping("/api")

public class Controller {
    
    @Autowired
    PokerService API;

    @GetMapping("/pokemon")
    public String main() {
        return API.getPokemonByID(140);
    
    }
    
}
