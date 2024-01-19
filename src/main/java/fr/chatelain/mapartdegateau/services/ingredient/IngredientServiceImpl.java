package fr.chatelain.mapartdegateau.services.ingredient;

import fr.chatelain.mapartdegateau.dto.IngredientDto;
import fr.chatelain.mapartdegateau.entities.Ingredient;
import fr.chatelain.mapartdegateau.mappers.MapperIngredient;
import fr.chatelain.mapartdegateau.repositories.IIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientServiceImpl implements IIngredientService{

    @Autowired
    private IIngredientRepository ingredientRepository;

    private MapperIngredient mapperIngredient;

    public IngredientServiceImpl() {
        this.mapperIngredient = new MapperIngredient();
    }

    @Override
    public IngredientDto saveOrUpdateIngredient(IngredientDto ingredientDto) {
        Ingredient ingredientToSave = mapperIngredient.mapToEntity(ingredientDto);
        Ingredient ingredientSave = ingredientRepository.save(ingredientToSave);
        return mapperIngredient.mapToDto(ingredientSave);
    }

    @Override
    public List<IngredientDto> findAllByLibelleLikeIgnoreCase(String libelle) {
        List<Ingredient> listeIngredientFind = ingredientRepository.findAllByLibelleLikeIgnoreCase(libelle);
        return mapperIngredient.mapToListDto(listeIngredientFind);
    }

    @Override
    public void deleteById(String id) {
        ingredientRepository.deleteById(id);
    }
}
