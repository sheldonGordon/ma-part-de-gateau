package fr.chatelain.mapartdegateau.services.gateau;

import fr.chatelain.mapartdegateau.entities.Gateau;
import fr.chatelain.mapartdegateau.repositories.IGateauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GateauService implements IGateauService{

    @Autowired
    private IGateauRepository gateauRepository;
    @Override
    public Gateau saveOrUpdateGateau(Gateau gateau) {
        return gateauRepository.save(gateau);
    }

    @Override
    public Gateau getGateauById(String id) {
        return gateauRepository.getGateauById(id);
    }
}
