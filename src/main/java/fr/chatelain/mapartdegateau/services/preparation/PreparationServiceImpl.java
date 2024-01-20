package fr.chatelain.mapartdegateau.services.preparation;

import fr.chatelain.mapartdegateau.dto.PreparationDto;
import fr.chatelain.mapartdegateau.entities.Preparation;
import fr.chatelain.mapartdegateau.mappers.MapperPreparation;
import fr.chatelain.mapartdegateau.repositories.IPreparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreparationServiceImpl implements IPreparationService{

    @Autowired
    private IPreparationRepository preparationRepository;

    private final MapperPreparation mapperPreparation;

    public PreparationServiceImpl() {
        this.mapperPreparation = new MapperPreparation();
    }

    @Override
    public PreparationDto saveOrUpdatePreparation(PreparationDto preparationDto) {
        Preparation preparationToSave = mapperPreparation.mapToEntity(preparationDto);
        Preparation preparationSave = preparationRepository.save(preparationToSave);
        return mapperPreparation.mapToDto(preparationSave);
    }

    @Override
    public PreparationDto getPreparationById(String id) {
        Preparation preparationFind = preparationRepository.getPreparationById(id);
        return mapperPreparation.mapToDto(preparationFind);
    }

    @Override
    public List<PreparationDto> getAllById(List<String> listeIds) {
        List<Preparation> listePreparation = preparationRepository.getAllByIdIn(listeIds);
        return mapperPreparation.mapToListDto(listePreparation);
    }

    @Override
    public void deleteById(String id) {
        preparationRepository.deleteById(id);
    }
}
