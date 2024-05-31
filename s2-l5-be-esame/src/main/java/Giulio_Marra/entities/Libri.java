package Giulio_Marra.entities;

import Giulio_Marra.enums.Genere;

public class Libri extends Catalogo {

    private String autore;
    private Genere genere;


    public Libri(int codiceISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, Genere genere) {
        super(codiceISBN, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                '}';
    }
}
