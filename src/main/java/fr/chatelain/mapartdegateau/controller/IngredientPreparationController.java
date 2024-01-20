package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.dto.IngredientPreparationDto;
import fr.chatelain.mapartdegateau.services.ingredientpreparation.IIngredientPreparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientPreparationController {

    @Autowired
    private IIngredientPreparationService ingredientPreparationService;

    @PostMapping("/ingredient-preparation")
    public IngredientPreparationDto saveIngredientPreparation(@RequestBody IngredientPreparationDto ingredientPreparationDto){
        return ingredientPreparationService.saveOrUpdateIngredientPreparation(ingredientPreparationDto);
    }

    @DeleteMapping("/ingredients-preparations/ids")
    public List<IngredientPreparationDto> getAllById(@RequestBody List<String> listeIds){
        return ingredientPreparationService.getAllById(listeIds);
    }

    @PutMapping("/ingredient-preparation")
    public IngredientPreparationDto updateIngredientPreparation(@RequestBody IngredientPreparationDto ingredientPreparationDto){
        return ingredientPreparationService.saveOrUpdateIngredientPreparation(ingredientPreparationDto);
    }

    @GetMapping("/ingredients-preparations/{id}")
    public void deleteIngredientPreparation(@PathVariable("id") String id){
        ingredientPreparationService.deleteById(id);
    }
}
