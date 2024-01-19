package fr.chatelain.mapartdegateau.controller;

import fr.chatelain.mapartdegateau.dto.IngredientDto;
import fr.chatelain.mapartdegateau.entities.Ingredient;
import fr.chatelain.mapartdegateau.mappers.MapperIngredient;
import fr.chatelain.mapartdegateau.services.ingredient.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private IIngredientService ingredientService;

    @PostMapping("/ingredient")
    public IngredientDto saveIngredient(@RequestBody IngredientDto ingredientDto){
        return ingredientService.saveOrUpdateIngredient(ingredientDto);
    }

    @GetMapping("/ingredients/libelle/{libelle}")
    public List<IngredientDto> getIngredientByLibelle(@PathVariable("libelle") String libelle){
        return ingredientService.findAllByLibelleLikeIgnoreCase(libelle);
    }

    @PutMapping("/ingredient")
    public IngredientDto updateIngredient(@RequestBody IngredientDto ingredientDto){
        return ingredientService.saveOrUpdateIngredient(ingredientDto);
    }

    @DeleteMapping("/ingredients/{id}")
    public void deleteIngredient(@PathVariable("id") String id){
        ingredientService.deleteById(id);
    }
}
