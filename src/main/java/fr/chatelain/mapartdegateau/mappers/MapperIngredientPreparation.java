package fr.chatelain.mapartdegateau.mappers;

import fr.chatelain.mapartdegateau.dto.IngredientDto;
import fr.chatelain.mapartdegateau.dto.IngredientPreparationDto;
import fr.chatelain.mapartdegateau.entities.Ingredient;
import fr.chatelain.mapartdegateau.entities.IngredientPreparation;

import java.util.ArrayList;
import java.util.List;

public class MapperIngredientPreparation implements IMapper<IngredientPreparation, IngredientPreparationDto> {
    private final MapperIngredient mapperIngredient;

    public MapperIngredientPreparation() {
        this.mapperIngredient = new MapperIngredient();
    }

    @Override
    public IngredientPreparationDto mapToDto(IngredientPreparation entity) {
        IngredientDto ingredientDto = mapperIngredient.mapToDto(entity.getIngredient());
        return IngredientPreparationDto.builder()
                .id(entity.getId())
                .quantiteIngredient(entity.getQuantiteIngredient())
                .quantite(entity.getQuantite())
                .ingredient(ingredientDto)
                .build();
    }

    @Override
    public IngredientPreparation mapToEntity(IngredientPreparationDto dto) {
        Ingredient ingredient = mapperIngredient.mapToEntity(dto.getIngredient());
        return IngredientPreparation.builder()
                .id(dto.getId())
                .quantiteIngredient(dto.getQuantiteIngredient())
                .quantite(dto.getQuantite())
                .ingredient(ingredient)
                .build();
    }

    @Override
    public List<IngredientPreparationDto> mapToListDto(List<IngredientPreparation> listeEntity) {
        List<IngredientPreparationDto> listeIngredientsPreparationsDto = new ArrayList<>(listeEntity.size());
        for (IngredientPreparation ingredientPreparation : listeEntity){
            listeIngredientsPreparationsDto.add(mapToDto(ingredientPreparation));
        }
        return listeIngredientsPreparationsDto;
    }

    @Override
    public List<IngredientPreparation> mapToListEntity(List<IngredientPreparationDto> listeDto) {
        List<IngredientPreparation> listeIngredientsPreparations = new ArrayList<>(listeDto.size());
        for (IngredientPreparationDto ingredientPreparationDto : listeDto){
            listeIngredientsPreparations.add(mapToEntity(ingredientPreparationDto));
        }
        return listeIngredientsPreparations;
    }
}
