package fr.chatelain.mapartdegateau.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class IngredientDto {

    private String id;
    private String libelle;
    private PrixDto prix;
}
