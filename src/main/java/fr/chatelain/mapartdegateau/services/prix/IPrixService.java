package fr.chatelain.mapartdegateau.services.prix;

import fr.chatelain.mapartdegateau.dto.PrixDto;

public interface IPrixService {

    PrixDto saveOrUpdatePrix(PrixDto prixDto);

    PrixDto findPrixById(String id);

    void deleteById(String id);
}
