package chainOfResponsability;

public class Capitano extends Ufficiale{
    @Override
    protected String getGrado() {
        return "Capitano";
    }

    @Override
    protected String getFunzione() {
        return "Responsabile";
    }

    @Override
    protected int getStipendio() {
        return 2000;
    }
}
