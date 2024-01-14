package fr.chatelain.mapartdegateau.repositories;

import fr.chatelain.mapartdegateau.entities.Gateau;
import org.springframework.data.repository.CrudRepository;

public interface IGateauRepository extends CrudRepository<Gateau, String> {
    Gateau getGateauById(String id);
}
