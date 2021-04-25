package com.ceyhun.domain;

public class Nissan extends Raceauto {

    private boolean boost;

    public Nissan(String brand, String naam, Integer snelheid, String kleur) {
        super(brand, naam, snelheid, kleur);
    }

    public void setBoost(boolean bool) {
        this.boost = bool;
    }

    public boolean getBoost() {
        return boost;
    }

    @Override
    public String toString() {
        return "Nissan " + naam + ", met een top snelheid van: " + snelheid + ", en een kleur van: " + kleur;
    }
}
