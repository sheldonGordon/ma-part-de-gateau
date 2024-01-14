package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.IngredientPreparation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IIngredientPreparationRepository extends CrudRepository<IngredientPreparation,String> {

    List<IngredientPreparation> getAllById(List<String> listeIds);
}