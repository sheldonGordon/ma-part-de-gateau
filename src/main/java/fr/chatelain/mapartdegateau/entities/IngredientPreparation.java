package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.*;

@Entity
public class IngredientPreparation extends AbstractEntity{
    @ManyToOne(optional = false)
    private Ingredient ingredient;
    @Column(nullable = false)
    private int quantiteIngredient;
    @Enumerated(EnumType.STRING)
    private Quantite quantite;
}
