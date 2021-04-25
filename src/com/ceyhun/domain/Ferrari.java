package com.ceyhun.domain;

public class Ferrari extends Raceauto{

    private Integer trackmode;

    public Ferrari(String brand, String naam, Integer snelheid, String kleur) {
        super(brand, naam, snelheid, kleur);
    }

    public void setTrackmode(Integer mode) {
        this.trackmode = mode;
    }

    public Integer getTrackmode() {
        return trackmode;
    }

    @Override
    public String toString() {
        return "Ferrari " + naam + ", met een top snelheid van: " + snelheid + ", en een kleur van: " + kleur;
    }
}
