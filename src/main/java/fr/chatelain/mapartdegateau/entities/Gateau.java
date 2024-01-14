package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Gateau extends AbstractEntity{
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private int nombrePart;
    @ManyToMany
    private List<Preparation> ListePreparations;
}
