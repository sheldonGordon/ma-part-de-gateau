package fr.chatelain.mapartdegateau.services.ingredientpreparation;

import fr.chatelain.mapartdegateau.dto.IngredientPreparationDto;
import fr.chatelain.mapartdegateau.entities.IngredientPreparation;
import fr.chatelain.mapartdegateau.mappers.MapperIngredientPreparation;
import fr.chatelain.mapartdegateau.repositories.IIngredientPreparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientPreparationServiceImpl implements IIngredientPreparationService{

    @Autowired
    private IIngredientPreparationRepository ingredientPreparationRepository;

    private final MapperIngredientPreparation mapperIngredientPreparation;

    public IngredientPreparationServiceImpl() {
        this.mapperIngredientPreparation = new MapperIngredientPreparation();
    }

    @Override
    public IngredientPreparationDto saveOrUpdateIngredientPreparation(IngredientPreparationDto ingredientPreparationDto) {
        IngredientPreparation ingredientPreparationToSave = mapperIngredientPreparation.mapToEntity(ingredientPreparationDto);
        IngredientPreparation ingredientPreparationSave = ingredientPreparationRepository.save(ingredientPreparationToSave);
        return mapperIngredientPreparation.mapToDto(ingredientPreparationSave);
    }

    @Override
    public List<IngredientPreparationDto> getAllById(List<String> listeIds) {
        List<IngredientPreparation> listeIngredientPreparationToFind = ingredientPreparationRepository.getAllByIdIn(listeIds);
        return mapperIngredientPreparation.mapToListDto(listeIngredientPreparationToFind);
    }

    @Override
    public void deleteById(String id) {
        ingredientPreparationRepository.deleteById(id);
    }
}
