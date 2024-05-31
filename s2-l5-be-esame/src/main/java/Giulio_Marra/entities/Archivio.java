package Giulio_Marra.entities;

import java.util.ArrayList;
import java.util.List;

public class Archivio {
    private List<Object> prodotti;

    public Archivio() {
        prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Object prodotto) {
        prodotti.add(prodotto);
    }


    public void stampaProdotto() {
        for (Object prodotto : prodotti) {
            System.out.println(prodotto);
        }
    }

    public void eliminaEelementoISBN(int ISBN) {

    }

    public void ricercaISBN(int ISBN) {
        List<Object> risultato = prodotti.stream()
                .filter(prodotto -> Catalogo.getCodiceISBN() == ISBN)
                .toList();

        if (!risultato.isEmpty()) {
            System.out.println("ISBN " + ISBN + ": " + risultato);
        } else {
            System.out.println("Nessun elemento trovato per l' ISBN " + ISBN);
        }
    }

    public void ricercaPerAnno(int anno) {
        List<Object> risultato = prodotti.stream()
                .filter(prodotto -> prodotto instanceof Catalogo && ((Catalogo) prodotto).getAnnoPubblicazione() == anno)
                .toList();

        if (!risultato.isEmpty()) {
            System.out.println("ANNO " + anno + ": " + risultato);
        } else {
            System.out.println("Nessun elemento trovato per l'anno " + anno);
        }
    }

    public void ricercaPerAutore(String autore) {
        List<Object> risultato = prodotti.stream()
                .filter(prodotto -> prodotto instanceof Libri && ((Libri) prodotto).getAutore() == autore)
                .toList();

        if (!risultato.isEmpty()) {
            System.out.println("AUTORE " + autore + ": " + risultato);
        } else {
            System.out.println("Nessun elemento trovato per l'autore " + autore);
        }
    }

    public List<Object> getProdotti() {
        return prodotti;
    }

    public void setProdotti(List<Object> prodotti) {
        this.prodotti = prodotti;
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "prodotti=" + prodotti +
                '}';
    }
}

