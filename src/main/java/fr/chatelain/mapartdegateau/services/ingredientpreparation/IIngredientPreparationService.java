package fr.chatelain.mapartdegateau.services.ingredientpreparation;

import fr.chatelain.mapartdegateau.entities.IngredientPreparation;

import java.util.List;

public interface IIngredientPreparationService {

    IngredientPreparation saveOrUpdateIngredientPreparation(IngredientPreparation ingredientPreparation);

    List<IngredientPreparation> getAllById(List<String> listeIds);
}
