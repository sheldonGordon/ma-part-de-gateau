package fr.chatelain.mapartdegateau.services.ingredient;

import fr.chatelain.mapartdegateau.entities.Ingredient;
import fr.chatelain.mapartdegateau.repositories.IIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IIngredientService{

    @Autowired
    private IIngredientRepository ingredientRepository;

    @Override
    public Ingredient saveOrUpdateIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public List<Ingredient> findAllByLibelleLikeIgnoreCase(String libelle) {
        return ingredientRepository.findAllByLibelleLikeIgnoreCase(libelle);
    }

    @Override
    public void deleteById(String id) {
        ingredientRepository.deleteById(id);
    }
}
