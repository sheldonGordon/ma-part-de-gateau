package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.entities.Preparation;
import fr.chatelain.mapartdegateau.services.preparation.IPreparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PreparationController {

    @Autowired
    private IPreparationService preparationService;

    @PostMapping("/preparation")
    public Preparation savePreparation(@RequestBody Preparation preparation){
        return preparationService.saveOrUpdatePreparation(preparation);
    }

    @GetMapping("/preparations/{id}}")
    public Preparation getPreparation(@PathVariable("id") String id){
        return preparationService.getPreparationById(id);
    }

    @PutMapping("/preparation")
    public Preparation updatePreparation(@RequestBody Preparation preparation){
        return preparationService.saveOrUpdatePreparation(preparation);
    }

    @GetMapping("/preparations/{id}")
    public void deletePreparation(@PathVariable("id") String id){
        preparationService.deleteById(id);
    }
}
