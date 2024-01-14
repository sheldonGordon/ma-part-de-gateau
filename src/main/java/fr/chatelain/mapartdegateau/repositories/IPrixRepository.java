package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.Prix;
import org.springframework.data.repository.CrudRepository;

public interface IPrixRepository extends CrudRepository<Prix, String> {

    Prix findPrixById(String id);
}
