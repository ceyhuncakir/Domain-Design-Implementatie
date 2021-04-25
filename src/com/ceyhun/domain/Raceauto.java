package com.ceyhun.domain;

public class Raceauto implements Auto {

    protected final String brand;
    protected final String naam;
    protected final String kleur;
    protected int snelheid;
    protected int gasgeven;

    public Raceauto(String brand, String naam, Integer snelheid, String kleur) {
        this.brand = brand;
        this.naam = naam;
        this.snelheid = snelheid;
        this.kleur = kleur;
    }

    public String getBrand() {
        return brand;
    }

    public String getNaam() {
        return naam;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public String getKleur() {
        return kleur;
    }

    public int getGasgeven() {
        return gasgeven;
    }

    @Override
    public void gasGeven(int gas) {
        this.gasgeven = gas;
    }
}
