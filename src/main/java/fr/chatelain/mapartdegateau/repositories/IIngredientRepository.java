package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IIngredientRepository extends CrudRepository<Ingredient, String> {

    List<Ingredient> findAllByLibelleLikeIgnoreCase(String libelle);
}
