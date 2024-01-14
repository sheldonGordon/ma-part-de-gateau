package fr.chatelain.mapartdegateau.services.prix;

import fr.chatelain.mapartdegateau.entities.Prix;

public interface IPrixService {

    Prix saveOrUpdatePrix(Prix prix);

    Prix findPrixById(String id);
}
