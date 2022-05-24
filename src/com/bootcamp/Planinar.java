package com.bootcamp;

public abstract class Planinar {
    private int id;
    private String ime;
    private String prezime;

    public Planinar(int id, String ime, String prezime) {

        if (id>0) {this.id = id;}
        else {
            System.out.println("Pogresan unos!");
        }

        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract void stampaj ();

    public abstract double clanarina();

    public abstract boolean uspesanUspon (Planina planina);


}
