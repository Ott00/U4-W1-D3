import it.epicode.be.operatoreTelefonico.CartaSim;

public class Main {
    public static void main(String[] args) {
        //Creo un utente
        CartaSim utente = new CartaSim("3334445599");

        //Chiamate dell'utente
        utente.chiamaX("3331110303", 2);
        utente.chiamaX("3331110356", 3);
        utente.chiamaX("3331110322", 5);
        utente.chiamaX("3331110323", 3);
        utente.chiamaX("3331110324", 4);
        utente.chiamaX("3331110325", 2);
        utente.chiamaX("3331110326", 1);
        utente.chiamaX("3331110327", 8);
        utente.chiamaX("3331110332", 2);

        //Output dei dati utente
        utente.datiSim();

        //Ricarica conto telefonico
        utente.ricaricaSim(25);
        utente.trovaCredito();
    }
}