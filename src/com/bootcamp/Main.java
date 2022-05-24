package com.bootcamp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Planina planina1 = new Planina("Kopaonik", "Srbija", 2000);

        ArrayList<Planinar> listaPlaninara = new ArrayList<>();
        listaPlaninara.add(new Alpinista(13, "Marko", "Markovic", 0));
        listaPlaninara.add(new Alpinista(135, "Janko", "Marinkovic", 10));
        listaPlaninara.add(new Alpinista(138, "Darko", "Jankovic", 20));
        listaPlaninara.add(new RekreativniPlaninar(1, "Ana", "Katic", 2, "Juzno backi", 1700));
        listaPlaninara.add(new RekreativniPlaninar(45, "Petar", "Petrovic", 10, "Juzno backi", 3000));
        listaPlaninara.add(new RekreativniPlaninar(27, "Marija", "Jovanovci", 2, "Juzno backi", 1999));

        for (Planinar p : listaPlaninara) {
            p.stampaj();
            if (p.uspesanUspon(planina1)) {
                System.out.println("Planinar ce se uspesno popeti!");
            } else {
                System.out.println("Planinar se nece popeti uspesno!");
            }
            System.out.println();

        }

        int sumaClanarina = 0;

        for (Planinar p : listaPlaninara) {
            sumaClanarina += p.clanarina();
        }

        System.out.println("Suma clanarina je: " + sumaClanarina);


    }

}
