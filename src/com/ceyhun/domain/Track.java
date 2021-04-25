package com.ceyhun.domain;

public class Track {

    public static void main(String[] args) {
        Lamborghini lamborghini = new Lamborghini("Lamborghini", "Aventador", 350, "blauw");
        Nissan nissan = new Nissan("Nissan","GTR", 350, "groen");
        Ferrari ferrari = new Ferrari("Ferrari", "488", 320, "rood");

        System.out.println("de auto's die racen vandaag: \n" + "\n" + lamborghini + "\n" + nissan + "\n" + ferrari + "\n");

        lamborghini.gasGeven(100);
        nissan.gasGeven(100);
        ferrari.gasGeven(100);

        lamborghini.setSpoiler(60);
        nissan.setBoost(true);
        ferrari.setTrackmode(3);

        Race.racen(ferrari, lamborghini, nissan);
    }
}
