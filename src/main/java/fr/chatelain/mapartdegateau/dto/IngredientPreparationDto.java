package fr.chatelain.mapartdegateau.dto;

import fr.chatelain.mapartdegateau.entities.Quantite;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class IngredientPreparationDto {

    private String id;
    private IngredientDto ingredient;
    private Double quantiteIngredient;
    private Quantite quantite;
}
