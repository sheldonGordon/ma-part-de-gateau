package fr.chatelain.mapartdegateau.mappers;

import fr.chatelain.mapartdegateau.dto.GateauDto;
import fr.chatelain.mapartdegateau.dto.PreparationDto;
import fr.chatelain.mapartdegateau.entities.Gateau;
import fr.chatelain.mapartdegateau.entities.Preparation;

import java.util.ArrayList;
import java.util.List;

public class MapperGateau implements IMapper<Gateau, GateauDto> {
    private final MapperPreparation mapperPreparation;

    public MapperGateau() {
        this.mapperPreparation = new MapperPreparation();
    }

    @Override
    public GateauDto mapToDto(Gateau entity) {
        List<Preparation> listePreparations = entity.getListePreparations();
        List<PreparationDto> listePreparationsDto = new ArrayList<>(listePreparations.size());
        for (Preparation preparation : listePreparations){
            listePreparationsDto.add(mapperPreparation.mapToDto(preparation));
        }
        return GateauDto.builder()
                .id(entity.getId())
                .nom(entity.getNom())
                .nombrePart(entity.getNombrePart())
                .ListePreparations(listePreparationsDto)
                .build();
    }

    @Override
    public Gateau mapToEntity(GateauDto dto) {
        List<PreparationDto> listePreparationsDto = dto.getListePreparations();
        List<Preparation> listePreparations = new ArrayList<>(listePreparationsDto.size());
        for (PreparationDto preparationDto : listePreparationsDto){
            listePreparations.add(mapperPreparation.mapToEntity(preparationDto));
        }
        return Gateau.builder()
                .id(dto.getId())
                .nom(dto.getNom())
                .nombrePart(dto.getNombrePart())
                .listePreparations(listePreparations).build();
    }

    @Override
    public List<GateauDto> mapToListDto(List<Gateau> listeEntity) {
        List<GateauDto> listeGateauxDto = new ArrayList<>(listeEntity.size());
        for (Gateau gateau : listeEntity){
            listeGateauxDto.add(mapToDto(gateau));
        }
        return listeGateauxDto;
    }

    @Override
    public List<Gateau> mapToListEntity(List<GateauDto> listeDto) {
        List<Gateau> listeGateaux = new ArrayList<>(listeDto.size());
        for (GateauDto gateauDto : listeDto){
            listeGateaux.add(mapToEntity(gateauDto));
        }
        return listeGateaux;
    }
}
