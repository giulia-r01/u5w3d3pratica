package composite;

import java.util.ArrayList;
import java.util.List;

public class Libro implements ElementoLibro {
    private String titolo;
    private List<String> autori = new ArrayList<>();
    private List<ElementoLibro> contenuto = new ArrayList<>();
    private double prezzo;

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungi(ElementoLibro elemento) {
        contenuto.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: €" + prezzo);
        for (ElementoLibro e : contenuto) {
            e.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totale = 0;
        for (ElementoLibro e : contenuto) {
            totale += e.getNumeroPagine();
        }
        return totale;
    }
}
