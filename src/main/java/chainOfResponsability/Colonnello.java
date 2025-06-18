package chainOfResponsability;

public class Colonnello extends Ufficiale{
    @Override
    protected String getGrado() {
        return "Colonnello";
    }

    @Override
    protected String getFunzione() {
        return "Altro plotone";
    }

    @Override
    protected int getStipendio() {
        return 4000;
    }
}
