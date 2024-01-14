package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.entities.IngredientPreparation;
import fr.chatelain.mapartdegateau.services.ingredientpreparation.IIngredientPreparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientPreparationController {

    @Autowired
    private IIngredientPreparationService ingredientPreparationService;

    @PostMapping("/ingredient-preparation")
    public IngredientPreparation saveIngredientPreparation(@RequestBody IngredientPreparation ingredientPreparation){
        return ingredientPreparationService.saveOrUpdateIngredientPreparation(ingredientPreparation);
    }

    @GetMapping("/ingredients-preparations/ids")
    public List<IngredientPreparation> getAllById(@RequestBody List<String> listeIds){
        return ingredientPreparationService.getAllById(listeIds);
    }

    @PutMapping("/ingredient-preparation")
    public IngredientPreparation updateIngredientPreparation(@RequestBody IngredientPreparation ingredientPreparation){
        return ingredientPreparationService.saveOrUpdateIngredientPreparation(ingredientPreparation);
    }

    @GetMapping("/ingredients-preparations/{id}")
    public void deleteIngredientPreparation(@PathVariable("id") String id){
        ingredientPreparationService.deleteById(id);
    }
}
