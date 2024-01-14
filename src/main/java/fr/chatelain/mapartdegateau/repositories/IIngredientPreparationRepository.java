package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.IngredientPreparation;
import org.springframework.data.repository.CrudRepository;

public interface IIngredientPreparationRepository extends CrudRepository<IngredientPreparation,String> {

}