package chainOfResponsability;

public class Tenente extends Ufficiale{
    @Override
    protected String getGrado() {
        return "Tenente";
    }

    @Override
    protected String getFunzione() {
        return "Comando di plotone";
    }

    @Override
    protected int getStipendio() {
        return 1000;
    }
}
