package Giulio_Marra;

import Giulio_Marra.entities.Archivio;
import Giulio_Marra.entities.Libri;
import Giulio_Marra.entities.Riviste;
import Giulio_Marra.enums.Genere;
import Giulio_Marra.enums.Pariodicita;

public class Application {

    public static void main(String[] args) {

        //CREAZIONE LIBRI
        Libri fahrenheit = new Libri(368456, "Fahrenheit 451", 1966, 166, "Ray Bradbury", Genere.FANTASCIENZA);
        Libri leviathan = new Libri(542563, "Leviathan trilogia", 2009, 1048, "Scott Westerfeld", Genere.FANTASY);
        Libri darknebula = new Libri(514896, "Dark Nebula", 1972, 206, "Brian Stablefor", Genere.HORROR);
        Libri guidagalattica = new Libri(365414, "Guida galattica per autostoppisti", 1980, 229, "Douglas Adams", Genere.FANTASCIENZA);

        //CREAZIONE RIVISTE
        Riviste focus = new Riviste(845632, "Focus vol 1", 2002, 220, Pariodicita.MENSILE);
        Riviste settimanaenigmistica = new Riviste(5147896, "La settimana enigmistica", 2010, 90, Pariodicita.SETTIMANALE);
        Riviste minotauro = new Riviste(563248, "Il minotauro", 2010, 167, Pariodicita.SEMESTRALE);

        //METODO PER AGGIUNGERE UN ELEMENTO
        System.out.println("------------------METODO PER AGGIUNGERE UN ELEMENTO---------------------------------");
        Archivio archivio = new Archivio();
        archivio.aggiungiProdotto(fahrenheit);
        archivio.aggiungiProdotto(leviathan);
        archivio.aggiungiProdotto(focus);
        archivio.stampaProdotto();

        //METODO PER RICERCARE PER ANNO
        System.out.println("------------------METODO PER RICERCARE PER ANNO---------------------------------");
        archivio.ricercaPerAnno(2002);

        //METODO PER RICERCA TRAMITE AUTORE
        System.out.println("------------------METODO PER RICERCARE PER AUTORE---------------------------------");
        archivio.ricercaPerAutore("Ray Bradbury");

        //METODO PER RICERCA ISBN

        archivio.ricercaISBN(542563);


    }
}
