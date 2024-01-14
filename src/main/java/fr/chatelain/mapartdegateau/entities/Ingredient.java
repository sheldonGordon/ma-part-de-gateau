package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.*;

@Entity
public class Ingredient extends AbstractEntity{

    @Column(nullable = false)
    private String libelle;
    @ManyToOne(optional = false)
    private Prix prix;
}
