package Giulio_Marra.entities;

import java.util.ArrayList;
import java.util.List;

public class Archivio {
    private List<Catalogo> prodotti;

    public Archivio() {
        prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Catalogo prodotto) {
        prodotti.add(prodotto);
    }

    public void stampaProdotto() {
        for (Catalogo prodotto : prodotti) {
            System.out.println(prodotto);
        }
    }

    public List<Libri> ricercaAutore(String autore) {
        return prodotti.stream()
                .filter(prodotto -> prodotto instanceof Libri && ((Libri) prodotto).getAutore().equalsIgnoreCase(autore))
                .map(prodotto -> (Libri) prodotto)
                .toList();
    }

    public void eliminaProdottoISBN(int ISBN) {
        prodotti.removeIf(prodotto -> prodotto.getCodiceISBN() == ISBN);
    }

    public List<Catalogo> ricercaISBN(int ISBN) {
        return prodotti.stream()
                .filter(prodotto -> prodotto.getCodiceISBN() == ISBN)
                .toList();
    }

    public List<Catalogo> ricercaPerAnno(int anno) {
        List<Catalogo> risultato = prodotti.stream()
                .filter(prodotto -> prodotto.getAnnoPubblicazione() == anno)
                .toList();

        if (!risultato.isEmpty()) {
            System.out.println("ANNO " + anno + ": " + risultato);
        } else {
            System.out.println("Nessun elemento trovato per l'anno " + anno);
        }
        return risultato;
    }


    public List<Catalogo> getProdotti() {
        return prodotti;
    }

    public void setProdotti(List<Catalogo> prodotti) {
        this.prodotti = prodotti;
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "prodotti=" + prodotti +
                '}';
    }
}
