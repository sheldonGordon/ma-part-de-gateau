package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.IngredientPreparation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIngredientPreparationRepository extends CrudRepository<IngredientPreparation,String> {

    List<IngredientPreparation> getAllByIdIn(List<String> listeIds);
}