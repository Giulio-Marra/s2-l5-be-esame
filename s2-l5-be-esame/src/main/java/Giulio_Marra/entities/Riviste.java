package Giulio_Marra.entities;

import Giulio_Marra.enums.Pariodicita;

public class Riviste extends Catalogo {

    private Pariodicita periodicita;

    public Riviste(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, Pariodicita periodicita) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Pariodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Pariodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicita=" + periodicita +
                '}';
    }
}
