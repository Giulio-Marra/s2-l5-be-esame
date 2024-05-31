package Giulio_Marra;

import Giulio_Marra.entities.Archivio;
import Giulio_Marra.entities.Libri;
import Giulio_Marra.entities.Riviste;
import Giulio_Marra.enums.Genere;
import Giulio_Marra.enums.Pariodicita;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        //CREAZIONE LIBRI
        Libri fahrenheit = new Libri(123456, "Fahrenheit 451", 1966, 166, "Ray Bradbury", Genere.FANTASCIENZA);
        Libri leviathan = new Libri(123456, "Leviathan trilogia", 2009, 1048, "Scott Westerfeld", Genere.FANTASY);
        Libri darknebula = new Libri(123456, "Dark Nebula", 1972, 206, "Brian Stablefor", Genere.HORROR);
        Libri guidagalattica = new Libri(123456, "Guida galattica per autostoppisti", 1980, 229, "Douglas Adams", Genere.FANTASCIENZA);

        //CREAZIONE RIVISTE
        Riviste focus = new Riviste(456789, "Focus vol 1", 2002, 220, Pariodicita.MENSILE);
        Riviste settimanaenigmistica = new Riviste(456789, "La settimana enigmistica", 2010, 90, Pariodicita.SETTIMANALE);
        Riviste minotauro = new Riviste(456789, "Il minotauro", 2010, 167, Pariodicita.SEMESTRALE);

        //METODO PER AGGIUNGERE UN ELEMENTO
        Archivio archivio = new Archivio();
        List<Archivio> archivioCatalogo = new ArrayList<>();

        archivio.aggiungiProdotto(archivioCatalogo, minotauro);


    }
}
