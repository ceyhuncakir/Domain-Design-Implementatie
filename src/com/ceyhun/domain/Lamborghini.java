package com.ceyhun.domain;

public class Lamborghini extends Raceauto{

    private Integer Spoiler;

    public Lamborghini(String brand, String naam, Integer snelheid, String kleur) {
        super(brand, naam, snelheid, kleur);
    }

    public void setSpoiler(Integer spoiler) {
        this.Spoiler = spoiler;
    }

    public Integer getSpoiler() {
        return Spoiler;
    }

    @Override
    public String toString() {
        return "Lamborghini " + naam + ", met een top snelheid van: " + snelheid + ", en een kleur van: " + kleur;
    }
}
