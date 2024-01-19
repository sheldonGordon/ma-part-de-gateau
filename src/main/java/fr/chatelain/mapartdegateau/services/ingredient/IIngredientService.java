package fr.chatelain.mapartdegateau.services.ingredient;

import fr.chatelain.mapartdegateau.dto.IngredientDto;

import java.util.List;

public interface IIngredientService {

    IngredientDto saveOrUpdateIngredient(IngredientDto ingredientDto);

    List<IngredientDto> findAllByLibelleLikeIgnoreCase(String libelle);

    void deleteById(String id);
}
