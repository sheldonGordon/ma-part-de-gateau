package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.entities.Ingredient;
import fr.chatelain.mapartdegateau.services.ingredient.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private IIngredientService ingredientService;

    @PostMapping("/ingredient")
    public Ingredient saveIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.saveOrUpdateIngredient(ingredient);
    }

    @GetMapping("/ingredients/libelle/{libelle}")
    public List<Ingredient> getIngredientByLibelle(@PathVariable("libelle") String libelle){
        return ingredientService.findAllByLibelleLikeIgnoreCase(libelle);
    }

    @PutMapping("/ingredient")
    public Ingredient updateIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.saveOrUpdateIngredient(ingredient);
    }

    @DeleteMapping("/ingredients/{id}")
    public void deleteIngredient(@PathVariable("id") String id){
        ingredientService.deleteById(id);
    }
}
