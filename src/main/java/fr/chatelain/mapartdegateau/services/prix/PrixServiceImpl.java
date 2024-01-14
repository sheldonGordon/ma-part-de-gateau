package fr.chatelain.mapartdegateau.services.prix;

import fr.chatelain.mapartdegateau.entities.Prix;
import fr.chatelain.mapartdegateau.repositories.IPrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrixServiceImpl implements IPrixService{

    @Autowired
    private IPrixRepository prixRepository;

    @Override
    public Prix saveOrUpdatePrix(Prix prix) {
        return prixRepository.save(prix);
    }

    @Override
    public Prix findPrixById(String id) {
        return prixRepository.findPrixById(id);
    }
}
