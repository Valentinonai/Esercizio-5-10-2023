package Esercizio1;

import Esercizio1.entities.Dipendente;
import Esercizio1.entities.Livello;

import static Esercizio1.entities.Dipartimento.AMMINISTRAZIONE;
import static Esercizio1.entities.Dipartimento.PRODUZIONE;

public class Main {

    public static void main(String[] args) {

        Dipendente d1=new Dipendente(1,AMMINISTRAZIONE);
        d1.print();

        Dipendente d2=new Dipendente(2,2000,40, Livello.IMPIEGATO,PRODUZIONE);
        d2.print();

       d1.promuovi();
       d2.promuovi();
       d1.print();
       d2.print();

        System.out.println("-------------------");
        System.out.println(Dipendente.calcolaPaga((d2)));

        System.out.println(Dipendente.calcolaPaga(d2,5));
    }



}
