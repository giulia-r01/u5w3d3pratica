package chainOfResponsability;

public class Maggiore extends Ufficiale{
    @Override
    protected String getGrado() {
        return "Maggiore";
    }

    @Override
    protected String getFunzione() {
        return "Comando di Plotone";
    }

    @Override
    protected int getStipendio() {
        return 3000;
    }
}
