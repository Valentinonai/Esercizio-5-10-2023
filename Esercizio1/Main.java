package Esercizio1;

import Esercizio1.entities.Dipendente;
import Esercizio1.entities.Livello;
import Esercizio1.entities.Persona;
import Esercizio2.Cliente;

import static Esercizio1.entities.Dipartimento.AMMINISTRAZIONE;
import static Esercizio1.entities.Dipartimento.PRODUZIONE;

public class Main {

    public static void main(String[] args) {

        Dipendente d1=new Dipendente(1,AMMINISTRAZIONE,"mario","rossi",34);
        d1.print();

        Dipendente d2=new Dipendente(2,2000,40, Livello.IMPIEGATO,PRODUZIONE,"pietro","verdi",53);
        d2.print();

       d1.promuovi();
       d2.promuovi();
       d1.print();
       d2.print();

        System.out.println("-------------------");
        System.out.println(Dipendente.calcolaPaga((d2)));

        System.out.println(Dipendente.calcolaPaga(d2,5));


        System.out.println("-------------------");
        d1.presentazione();


        Cliente c1=new Cliente("paperino","azzurro",48,"#00001",58,"calcio");
        c1.presentazione();
        c1.sportPraticato();
        d1.sportPraticato();

        System.out.println("------------------");
        Persona[] persone={d1,c1,d2};

        for(Persona p:persone){
            Persona.mansione(p);
        }

    }



}
