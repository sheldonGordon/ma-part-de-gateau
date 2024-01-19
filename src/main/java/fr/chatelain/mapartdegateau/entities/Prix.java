package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Prix extends AbstractEntity{

    @Builder
    public Prix(String id, float prix, Quantite quantite, Date dateDerniereModification) {
        super(id);
        this.prix = prix;
        this.quantite = quantite;
        this.dateDerniereModification = dateDerniereModification;
    }

    @Column(nullable = false)
    private float prix;
    @Enumerated(EnumType.STRING)
    private Quantite quantite;
    @Column
    private Date dateDerniereModification;
}
