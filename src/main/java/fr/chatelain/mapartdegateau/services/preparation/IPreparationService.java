package fr.chatelain.mapartdegateau.services.preparation;

import fr.chatelain.mapartdegateau.entities.Preparation;

import java.util.List;

public interface IPreparationService {

    Preparation saveOrUpdatePreparation(Preparation preparation);

    Preparation getPreparationById(String id);

    List<Preparation> getAllById(List<String> listeIds);

    void deleteById(String id);
}
