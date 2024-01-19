package fr.chatelain.mapartdegateau.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PreparationDto {

    private String id;
    private String nom;
    private List<IngredientPreparationDto> ListeIngredientsPreparation;
}
