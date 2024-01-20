package fr.chatelain.mapartdegateau.services.preparation;

import fr.chatelain.mapartdegateau.dto.PreparationDto;

import java.util.List;

public interface IPreparationService {

    PreparationDto saveOrUpdatePreparation(PreparationDto preparationDto);

    PreparationDto getPreparationById(String id);

    List<PreparationDto> getAllById(List<String> listeIds);

    void deleteById(String id);
}
