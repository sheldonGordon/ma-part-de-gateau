package fr.chatelain.mapartdegateau.services.preparation;

import fr.chatelain.mapartdegateau.entities.Preparation;
import fr.chatelain.mapartdegateau.repositories.IPreparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreparationServiceImpl implements IPreparationService{

    @Autowired
    private IPreparationRepository preparationRepository;

    @Override
    public Preparation saveOrUpdatePreparation(Preparation preparation) {
        return preparationRepository.save(preparation);
    }

    @Override
    public Preparation getPreparationById(String id) {
        return preparationRepository.getPreparationById(id);
    }

    @Override
    public List<Preparation> getAllById(List<String> listeIds) {
        return preparationRepository.getAllById(listeIds);
    }
}
