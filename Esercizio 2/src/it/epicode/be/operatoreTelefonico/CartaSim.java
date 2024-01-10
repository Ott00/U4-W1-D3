package it.epicode.be.operatoreTelefonico;

public class CartaSim {
    private final String numeroTelefono;
    private double credito = 0.0;
    private final Chiamata[] chiamateArray = new Chiamata[5];

    public CartaSim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void datiSim() {
        System.out.println("Numero telefono: " + this.numeroTelefono);
        System.out.println("Credito residuo: " + this.credito + "€");
        System.out.println("Ultime 5 chiamate");

        for (int i = 0; i < chiamateArray.length; i++) {
            if (chiamateArray[i] != null) {
                System.out.println("Numero chiamato: " + chiamateArray[i].trovaNumeroChiamato() + " con una durata di: " + chiamateArray[i].trovaDurata() + " minut" + (chiamateArray[i].trovaDurata() > 1 ? "i" : "o"));
            }
        }
    }

    public void chiamaX(String numero, int durata) {
        Chiamata chiamata = new Chiamata(numero, durata);

        for (int i = chiamateArray.length - 1; i > 0; i--) {
            chiamateArray[i] = chiamateArray[i - 1];
        }

        chiamateArray[0] = chiamata;
    }

    public void ricaricaSim(double ricarica){
        System.out.println("Ricarica di " + ricarica + "€ in corso...");
        this.credito += ricarica;
        System.out.println("Ricarica avvenuta");
    }

    public void trovaCredito(){
        System.out.println("Credito residuo: " + this.credito + "€");
    }

}
