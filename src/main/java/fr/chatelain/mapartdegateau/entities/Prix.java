package fr.chatelain.mapartdegateau.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Date;

@Entity
public class Prix extends AbstractEntity{

    @Column(nullable = false)
    private float prix;
    @Enumerated(EnumType.STRING)
    private Quantite quantite;
    @Column
    private Date dateDerniereModification;
}
