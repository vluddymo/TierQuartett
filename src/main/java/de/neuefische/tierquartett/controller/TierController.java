package de.neuefische.tierquartett.controller;


import de.neuefische.tierquartett.TierService.TierService;
import de.neuefische.tierquartett.model.Tier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("animals")
public class TierController {

    private final TierService tierservice;

    @Autowired
    public TierController(TierService tierservice) {
        this.tierservice = tierservice;
    }

   @GetMapping
    public List<Tier> getAllAnimals(){
        return tierservice.listAllAnimals();
    }

/*    @GetMapping
    public List<Tier> getAnimals(@RequestParam(required = false) String query) {
        return tierservice.getAnimals(query);
    }*/

}
