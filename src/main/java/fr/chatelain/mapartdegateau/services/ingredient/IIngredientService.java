package fr.chatelain.mapartdegateau.services.ingredient;

import fr.chatelain.mapartdegateau.entities.Ingredient;

import java.util.List;

public interface IIngredientService {

    Ingredient saveOrUpdateIngredient(Ingredient ingredient);

    List<Ingredient> findAllByLibelleLikeIgnoreCase(String libelle);

    void deleteById(String id);
}
