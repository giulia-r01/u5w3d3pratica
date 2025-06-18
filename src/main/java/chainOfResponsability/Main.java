package chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setSuccessore(capitano);
        capitano.setSuccessore(maggiore);
        maggiore.setSuccessore(colonnello);
        colonnello.setSuccessore(generale);

        int richiesta1 = 2500;
        System.out.println("Richiesta: almeno " + richiesta1 + "€");
        tenente.gestisciRichiesta(richiesta1);

        int richiesta2 = 5000;
        System.out.println("\nRichiesta: almeno " + richiesta2 + "€");
        tenente.gestisciRichiesta(richiesta2);

        int richiesta3 = 6000;
        System.out.println("\nRichiesta: almeno " + richiesta3 + "€");
        tenente.gestisciRichiesta(richiesta3);
    }
}
