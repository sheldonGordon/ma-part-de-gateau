package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Preparation extends AbstractEntity{

    @Column(nullable = false)
    private String nom;

    @OneToMany(cascade = CascadeType.ALL)
    private List<IngredientPreparation> ListeIngredientsPreparation;
}
