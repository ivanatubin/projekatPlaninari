package com.bootcamp;

public class Planina {
    private String ime;
    private String drzava;
    private double visina;

    public Planina () {

    }

    public Planina(String ime, String drzava, double visina) {
        this.ime = ime;
        this.drzava = drzava;
        setVisina(visina);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if (visina>0){this.visina = visina;}
    }
}
