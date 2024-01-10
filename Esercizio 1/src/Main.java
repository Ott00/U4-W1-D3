import it.epicode.be.classi.Rettangolo;

public class Main {
    public static void main(String[] args) {
        int altezza = 4;
        int altezza2 = 5;
        int larghezza = 3;
        int larghezza2 = 6;
        stampaRettangolo(altezza, larghezza);
        stampaDueRettangoli(altezza, larghezza, altezza2, larghezza2);
    }

    public static void stampaRettangolo(int altezza, int larghezza) {
        Rettangolo rettangolo = new Rettangolo(altezza, larghezza);
        int area = rettangolo.calcolaArea();
        int perimetro = rettangolo.calcolaPerimetro();
        System.out.println("L'area del rettangolo è: " + area + " e il suo perimetro è: " + perimetro);
    }

    public static void stampaDueRettangoli(int altezza, int larghezza, int altezza2, int larghezza2) {
        Rettangolo rettangolo = new Rettangolo(altezza, larghezza);
        Rettangolo rettangolo2 = new Rettangolo(altezza2, larghezza2);

        int area = rettangolo.calcolaArea();
        int perimetro = rettangolo.calcolaPerimetro();
        int area2 = rettangolo2.calcolaArea();
        int perimetro2 = rettangolo2.calcolaPerimetro();

        int sommaPerimetri = perimetro + perimetro2;
        int sommaAree = area + area2;

        System.out.println("L'area del rettangolo è: " + area + " e il suo perimetro è: " + perimetro);
        System.out.println("L'area del secondo rettangolo è: " + area2 + " e il suo perimetro è: " + perimetro2);
        System.out.println("La somma delle aree dei rettangoli è: " + sommaAree + " e la somma dei perimetri è: " + sommaPerimetri);

    }
}