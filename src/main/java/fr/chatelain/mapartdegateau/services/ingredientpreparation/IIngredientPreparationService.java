package fr.chatelain.mapartdegateau.services.ingredientpreparation;

import fr.chatelain.mapartdegateau.dto.IngredientPreparationDto;

import java.util.List;

public interface IIngredientPreparationService {

    IngredientPreparationDto saveOrUpdateIngredientPreparation(IngredientPreparationDto ingredientPreparation);

    List<IngredientPreparationDto> getAllById(List<String> listeIds);

    void deleteById(String id);
}
