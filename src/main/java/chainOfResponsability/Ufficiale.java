package chainOfResponsability;

public abstract class Ufficiale {
    protected Ufficiale successore;

    public void setSuccessore(Ufficiale successore) {
        this.successore = successore;
    }

    public void gestisciRichiesta(int importo) {
        if (getStipendio() >= importo) {
            System.out.println(getGrado() + " (" + getFunzione() + ") può gestire la richiesta. Stipendio: " + getStipendio());
        } else if (successore != null) {
            successore.gestisciRichiesta(importo);
        } else {
            System.out.println("Nessun ufficiale ha uno stipendio adeguato per gestire l'importo: " + importo);
        }
    }

    protected abstract String getGrado();
    protected abstract String getFunzione();
    protected abstract int getStipendio();
}
