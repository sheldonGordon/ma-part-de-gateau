package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Gateau extends AbstractEntity{
    @Builder
    public Gateau(String id, String nom, int nombrePart, List<Preparation> listePreparations) {
        super(id);
        this.nom = nom;
        this.nombrePart = nombrePart;
        ListePreparations = listePreparations;
    }

    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private int nombrePart;
    @ManyToMany
    private List<Preparation> ListePreparations;
}
