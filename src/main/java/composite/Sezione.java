package composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro{

    private String titolo;
    private List<ElementoLibro> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public  void aggiungi(ElementoLibro elementoLibro){
        elementi.add(elementoLibro);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (ElementoLibro e : elementi) {
            e.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totale = 0;
        for (ElementoLibro e : elementi) {
            totale += e.getNumeroPagine();
        }
        return totale;
    }
}
