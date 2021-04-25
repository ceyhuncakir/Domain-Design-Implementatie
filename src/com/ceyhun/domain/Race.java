package com.ceyhun.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Race {

    public static void racen(Raceauto auto, Raceauto auto_1, Raceauto auto_2) {

        // list met auto object er in
        List<Raceauto> autos = Arrays.asList(auto, auto_1, auto_2);

        if(auto.getClass() == Ferrari.class && auto_1.getClass() == Lamborghini.class && auto_2.getClass() == Nissan.class){
            for(Raceauto a : autos) {

                // hier vergelijken we voor elke auto de hoeveelheid gas er gegeven word. na dat vergelijking word er vergeleken wat de snelheid is voor elke auto.
                // De grootse getal van die vergelijken word als winnaar beschouwen
                Optional<Raceauto> snelsteauto = autos.stream().max(Comparator.comparingInt(Raceauto::getGasgeven).thenComparingInt(Raceauto::getSnelheid));;

                if(a.getGasgeven() > 0 && ((Nissan) auto_2).getBoost() && auto_2.getGasgeven() >= 90) {
                    System.out.println("De race is gewonnen door:\n" + auto_2.toString());
                    break;
                } else if(a.getGasgeven() > 0 && ((Ferrari) auto).getTrackmode().equals(3) && auto.getGasgeven() >= 90) {
                    System.out.println("De race is gewonnen door:\n" + auto.toString());
                    break;
                } else if(a.getGasgeven() > 0 && ((Lamborghini) auto_1).getSpoiler() >= 60 && auto_1.getGasgeven() >= 90) {
                    System.out.println("De race is gewonnen door:\n" + auto_1.toString());
                    break;
                } else if(a.getGasgeven() > 0) {
                    System.out.println("De race is gewonnen door:\n" + snelsteauto.get());
                    break;
                }
                System.out.println("de race is niet gestart!");
                break;
            }
        }
    }
}
