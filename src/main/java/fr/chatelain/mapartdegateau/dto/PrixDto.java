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
public class PrixDto {

    private String id;
    private float prix;
    private Quantite quantite;
}
