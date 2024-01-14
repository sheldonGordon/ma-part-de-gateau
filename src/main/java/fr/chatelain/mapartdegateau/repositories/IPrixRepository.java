package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.Prix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrixRepository extends CrudRepository<Prix, String> {

    Prix findPrixById(String id);
}
