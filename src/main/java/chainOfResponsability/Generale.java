package chainOfResponsability;

public class Generale extends Ufficiale{
    @Override
    protected String getGrado() {
        return "Generale";
    }

    @Override
    protected String getFunzione() {
        return "In pensione";
    }

    @Override
    protected int getStipendio() {
        return 5000;
    }
}
