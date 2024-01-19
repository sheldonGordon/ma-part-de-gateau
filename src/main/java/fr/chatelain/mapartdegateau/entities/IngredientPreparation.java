package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class IngredientPreparation extends AbstractEntity{
    @Builder
    public IngredientPreparation(String id, Ingredient ingredient, Double quantiteIngredient, Quantite quantite) {
        super(id);
        this.ingredient = ingredient;
        this.quantiteIngredient = quantiteIngredient;
        this.quantite = quantite;
    }

    @ManyToOne(optional = false)
    private Ingredient ingredient;
    @Column(nullable = false)
    private Double quantiteIngredient;
    @Enumerated(EnumType.STRING)
    private Quantite quantite;
}
