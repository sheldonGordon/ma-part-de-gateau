package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.Preparation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPreparationRepository extends CrudRepository<Preparation, String> {
    Preparation getPreparationById(String id);

    List<Preparation> getAllById(List<String> listeIds);
}
