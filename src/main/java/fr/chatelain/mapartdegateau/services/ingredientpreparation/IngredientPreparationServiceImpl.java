package fr.chatelain.mapartdegateau.services.ingredientpreparation;

import fr.chatelain.mapartdegateau.entities.IngredientPreparation;
import fr.chatelain.mapartdegateau.repositories.IIngredientPreparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientPreparationServiceImpl implements IIngredientPreparationService{

    @Autowired
    private IIngredientPreparationRepository ingredientPreparationRepository;

    @Override
    public IngredientPreparation saveOrUpdateIngredientPreparation(IngredientPreparation ingredientPreparation) {
        return ingredientPreparationRepository.save(ingredientPreparation);
    }

    @Override
    public List<IngredientPreparation> getAllById(List<String> listeIds) {
        return ingredientPreparationRepository.getAllByIdIn(listeIds);
    }

    @Override
    public void deleteById(String id) {
        ingredientPreparationRepository.deleteById(id);
    }
}
