package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.Preparation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPreparationRepository extends CrudRepository<Preparation, String> {
    Preparation getPreparationById(String id);

    List<Preparation> getAllByIdIn(List<String> listeIds);
}
