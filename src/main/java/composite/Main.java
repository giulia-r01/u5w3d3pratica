package composite;

public class Main {
    public static void main(String[] args) {
        Pagina p1 = new Pagina("Introduzione");
        Pagina p2 = new Pagina("Contenuto Capitolo 1");
        Pagina p3 = new Pagina("Contenuto Capitolo 2");

        Sezione cap1 = new Sezione("Capitolo 1");
        cap1.aggiungi(p1);
        cap1.aggiungi(p2);

        Sezione cap2 = new Sezione("Capitolo 2");
        cap2.aggiungi(p3);

        Libro libro = new Libro("Design Patterns", 39.90);
        libro.aggiungiAutore("Gamma");
        libro.aggiungiAutore("Helm");
        libro.aggiungi(cap1);
        libro.aggiungi(cap2);

        libro.stampa();
        System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
    }
}

