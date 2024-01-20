package fr.chatelain.mapartdegateau.services.gateau;

import fr.chatelain.mapartdegateau.dto.GateauDto;
import fr.chatelain.mapartdegateau.entities.Gateau;

public interface IGateauService {

    GateauDto saveOrUpdateGateau(GateauDto gateauDto);

    GateauDto getGateauById(String id);

    void deleteById(String id);
}
