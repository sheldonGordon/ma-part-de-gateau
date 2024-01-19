package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Preparation extends AbstractEntity{

    @Builder
    public Preparation(String id, String nom, List<IngredientPreparation> listeIngredientsPreparation) {
        super(id);
        this.nom = nom;
        ListeIngredientsPreparation = listeIngredientsPreparation;
    }

    @Column(nullable = false)
    private String nom;

    @OneToMany(cascade = CascadeType.ALL)
    private List<IngredientPreparation> ListeIngredientsPreparation;
}
