package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.entities.Prix;
import fr.chatelain.mapartdegateau.services.prix.IPrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrixController {

    @Autowired
    private IPrixService prixService;

    @PostMapping("/prix")
    public Prix savePrix(@RequestBody Prix prix){
        return prixService.saveOrUpdatePrix(prix);
    }

    @GetMapping("/prix/{id}")
    public Prix getPrix(@PathVariable("id") String id){
        return prixService.findPrixById(id);
    }

    @PutMapping("/prix")
    public Prix updatePrix(@RequestBody Prix prix){
        return prixService.saveOrUpdatePrix(prix);
    }

    @DeleteMapping("/prix/{id}")
    public void deletePrix(@PathVariable("id") String id){
        prixService.deleteById(id);
    }
}
