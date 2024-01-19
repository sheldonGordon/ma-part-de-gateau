package fr.chatelain.mapartdegateau.mappers;

import fr.chatelain.mapartdegateau.dto.PreparationDto;
import fr.chatelain.mapartdegateau.entities.Preparation;

import java.util.ArrayList;
import java.util.List;


public class MapperPreparation implements IMapper<Preparation, PreparationDto> {
    private final MapperIngredientPreparation mapperIngredientPreparation;

    public MapperPreparation() {
        this.mapperIngredientPreparation = new MapperIngredientPreparation();
    }

    @Override
    public PreparationDto mapToDto(Preparation entity) {

        return PreparationDto.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .ListeIngredientsPreparation(mapperIngredientPreparation.mapToListDto(entity.getListeIngredientsPreparation()))
                .build();
    }

    @Override
    public Preparation mapToEntity(PreparationDto dto) {
        return Preparation.builder()
                .id(dto.getId())
                .nom(dto.getNom())
                .listeIngredientsPreparation(mapperIngredientPreparation.mapToListEntity(dto.getListeIngredientsPreparation()))
                .build();
    }

    @Override
    public List<PreparationDto> mapToListDto(List<Preparation> listeEntity) {
        List<PreparationDto> listePreparationsDto = new ArrayList<>(listeEntity.size());
        for (Preparation preparation : listeEntity){
            listePreparationsDto.add(mapToDto(preparation));
        }
        return listePreparationsDto;
    }

    @Override
    public List<Preparation> mapToListEntity(List<PreparationDto> listeDto) {
        List<Preparation> listePreparations = new ArrayList<>(listeDto.size());
        for (PreparationDto preparationDto : listeDto){
            listePreparations.add(mapToEntity(preparationDto));
        }
        return listePreparations;
    }
}
