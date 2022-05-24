package com.bootcamp;

public class Alpinista extends Planinar{

    private int poeni;

    public Alpinista(int id, String ime, String prezime, int poeni) {
        super(id, ime, prezime);
        this.poeni = poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + getId() + '\n' + "Ime: " + getIme() + " " + getPrezime()+
                '\n' +"Broj poena: " + poeni);

    }

    @Override
    public double clanarina() {
        if ((1500-poeni*50)>0) {
            return 1500-(poeni*50);
        } else {
            return 0;
        }
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisina()<=4000) {
            return true;
        } else {
            return false;
        }
    }
}
