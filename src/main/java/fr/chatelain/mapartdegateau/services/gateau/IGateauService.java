package fr.chatelain.mapartdegateau.services.gateau;

import fr.chatelain.mapartdegateau.entities.Gateau;

public interface IGateauService {

    Gateau saveOrUpdateGateau(Gateau gateau);

    Gateau getGateauById(String id);
}
