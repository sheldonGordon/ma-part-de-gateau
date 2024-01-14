package fr.chatelain.mapartdegateau.entities;

import lombok.ToString;

@ToString(of = {"nomLong"})
public enum Quantite {
    GRAMMES("Grammes", "g"),
    KILOS("Kilos", "kg"),
    MILLILITRES("Millilitres", "ml"),
    CENTILITRES("Centilitres", "cl"),
    LITRES("Litres", "l"),
    UNITAIRE("Unitaire", "");


    public final String nomLong;
    public final String nomCourt;

    Quantite(String nomLong, String nomCourt) {
        this.nomLong = nomLong;
        this.nomCourt = nomCourt;
    }
}
