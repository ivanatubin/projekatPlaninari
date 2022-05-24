package com.bootcamp;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int maxUsponBezOpreme;

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String okrug, int maxUsponBezOpreme) {
        super(id, ime, prezime);

        if (tezinaOpreme>0){this.tezinaOpreme = tezinaOpreme;}

        this.okrug = okrug;
        if (maxUsponBezOpreme>0){this.maxUsponBezOpreme = maxUsponBezOpreme;}
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getId() + '\n' + "Ime: " + getIme() + " " + getPrezime() +
                " Okrug: " + okrug);

    }


    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon (Planina planina) {

        return ((maxUsponBezOpreme - tezinaOpreme * 50) >= planina.getVisina());

    }
}
