package org.example.msformation.apis;

import org.example.msformation.entities.Formation;
import org.example.msformation.repositories.FormationRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    FormationRep formationRep;
    @GetMapping("/formation/all")
    public List<Formation> getAllFormations() {
        return formationRep.findAll();
    }
    @GetMapping("/formation/{id}")
    public Formation getFormationById( @PathVariable("id") Long id){
        return formationRep.findById(id).get();

    }

}
