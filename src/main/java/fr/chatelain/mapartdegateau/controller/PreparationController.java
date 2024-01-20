package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.dto.PreparationDto;
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
    public PreparationDto savePreparation(@RequestBody PreparationDto preparationDto){
        return preparationService.saveOrUpdatePreparation(preparationDto);
    }

    @GetMapping("/preparations/{id}}")
    public PreparationDto getPreparation(@PathVariable("id") String id){
        return preparationService.getPreparationById(id);
    }

    @PutMapping("/preparation")
    public PreparationDto updatePreparation(@RequestBody PreparationDto preparationDto){
        return preparationService.saveOrUpdatePreparation(preparationDto);
    }

    @DeleteMapping("/preparations/{id}")
    public void deletePreparation(@PathVariable("id") String id){
        preparationService.deleteById(id);
    }
}
