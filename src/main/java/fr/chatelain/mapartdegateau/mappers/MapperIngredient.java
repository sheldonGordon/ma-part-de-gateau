package fr.chatelain.mapartdegateau.mappers;

import fr.chatelain.mapartdegateau.dto.IngredientDto;
import fr.chatelain.mapartdegateau.dto.PrixDto;
import fr.chatelain.mapartdegateau.entities.Ingredient;
import fr.chatelain.mapartdegateau.entities.Prix;

import java.util.ArrayList;
import java.util.List;

public class MapperIngredient implements IMapper<Ingredient, IngredientDto> {
    private final MapperPrix mapperPrix;

    public MapperIngredient() {
        this.mapperPrix = new MapperPrix();
    }

    @Override
    public IngredientDto mapToDto(Ingredient entity) {
        PrixDto prixDto = mapperPrix.mapToDto(entity.getPrix());
        return IngredientDto.builder()
                .id(entity.getId())
                .libelle(entity.getLibelle())
                .prix(prixDto)
                .build();
    }

    @Override
    public Ingredient mapToEntity(IngredientDto dto) {
        Prix prix = mapperPrix.mapToEntity(dto.getPrix());
        return Ingredient.builder()
                .id(dto.getId())
                .libelle(dto.getLibelle())
                .prix(prix)
                .build();
    }

    @Override
    public List<IngredientDto> mapToListDto(List<Ingredient> listeEntity) {
        List<IngredientDto> listeIngredientsDto = new ArrayList<>(listeEntity.size());
        for (Ingredient ingredient : listeEntity){
            listeIngredientsDto.add(mapToDto(ingredient));
        }
        return listeIngredientsDto;
    }

    @Override
    public List<Ingredient> mapToListEntity(List<IngredientDto> listeDto) {
        List<Ingredient> listeIngredients = new ArrayList<>(listeDto.size());
        for (IngredientDto ingredientDto : listeDto){
            listeIngredients.add(mapToEntity(ingredientDto));
        }
        return listeIngredients;
    }
}
