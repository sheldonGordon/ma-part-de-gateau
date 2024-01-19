package fr.chatelain.mapartdegateau.mappers;

import fr.chatelain.mapartdegateau.dto.PrixDto;
import fr.chatelain.mapartdegateau.entities.Prix;

import java.util.ArrayList;
import java.util.List;

public class MapperPrix implements IMapper<Prix, PrixDto> {
    @Override
    public PrixDto mapToDto(Prix entity) {
        return PrixDto.builder()
                .id(entity.getId())
                .prix(entity.getPrix())
                .quantite(entity.getQuantite())
                .build();
    }

    @Override
    public Prix mapToEntity(PrixDto dto) {
        return Prix.builder()
                .id(dto.getId())
                .prix(dto.getPrix())
                .quantite(dto.getQuantite())
                .build();
    }

    @Override
    public List<PrixDto> mapToListDto(List<Prix> listeEntity) {
        List<PrixDto> listePrixDto = new ArrayList<>(listeEntity.size());
        for (Prix prix : listeEntity){
            listePrixDto.add(mapToDto(prix));
        }
        return listePrixDto;
    }

    @Override
    public List<Prix> mapToListEntity(List<PrixDto> listeDto) {
        List<Prix> listePrix = new ArrayList<>(listeDto.size());
        for (PrixDto prixDto : listeDto){
            listePrix.add(mapToEntity(prixDto));
        }
        return listePrix;
    }
}
