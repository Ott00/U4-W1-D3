package it.epicode.be.classi;

public class Rettangolo {
    public int altezza;
    public int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int calcolaPerimetro() {
        return (altezza + larghezza) * 2;
    }

    public int calcolaArea() {
        return altezza * larghezza;
    }

}
