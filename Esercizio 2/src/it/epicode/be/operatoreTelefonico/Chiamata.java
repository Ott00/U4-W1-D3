package it.epicode.be.operatoreTelefonico;

public class Chiamata {
    private final String numeroChiamato;
    private final int durata;

    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String trovaNumeroChiamato(){
        return numeroChiamato;
    }

    public int trovaDurata(){
        return this.durata;
    }
}
