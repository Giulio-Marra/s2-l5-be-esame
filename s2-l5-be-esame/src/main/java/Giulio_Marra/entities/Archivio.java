package Giulio_Marra.entities;

import java.util.ArrayList;
import java.util.List;

public class Archivio {
    private List<Object> prodotti;

    public Archivio() {
        prodotti = new ArrayList<>();
    }

    public void aggiungiElemento(Object elemento) {
        prodotti.add(elemento);
    }

    public List<Object> getElementi() {
        return prodotti;
    }

    public void stampaElementi() {
        for (Object elemento : prodotti) {
            System.out.println(elemento);
        }
    }

    public void eliminaEelementoISBN(int ISBN) {
        
    }


    @Override
    public String toString() {
        return "Archivio{" +
                "prodotti=" + prodotti +
                '}';
    }
}

