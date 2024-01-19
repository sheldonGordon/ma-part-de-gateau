package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ingredient extends AbstractEntity{
    @Builder
    public Ingredient(String id, String libelle, Prix prix) {
        super(id);
        this.libelle = libelle;
        this.prix = prix;
    }

    @Column(nullable = false)
    private String libelle;
    @ManyToOne(optional = false)
    private Prix prix;
}
