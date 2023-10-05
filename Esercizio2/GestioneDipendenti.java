package Esercizio2;

import Esercizio1.entities.Dipartimento;
import Esercizio1.entities.Dipendente;
import Esercizio1.entities.Livello;

public class GestioneDipendenti {
    public static void main(String[] args) {

        Dipendente[] d=new Dipendente[4];
        d[0] =new Dipendente(1,1000,20, Livello.OPERAIO, Dipartimento.PRODUZIONE,"mario","rossi",24);
        d[1] =new Dipendente(2,1100,25, Livello.OPERAIO, Dipartimento.PRODUZIONE,"pippo","verdi",62);
        d[2] =new Dipendente(3,2000,30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE,"pluto","gialli",42);
        d[3] =new Dipendente(4,3000,40, Livello.DIRIGENTE, Dipartimento.VENDITE,"topolino","blu",28);

        d[0].promuovi();
        d[2].promuovi();

        for(Dipendente x:d){
            x.print();
        }

        System.out.println("d1 stipendio tot: " +Dipendente.calcolaPaga(d[0],5));
        System.out.println("d2 stipendio tot: " +Dipendente.calcolaPaga(d[1],5));
        System.out.println("d3 stipendio tot: " +Dipendente.calcolaPaga(d[2],5));
        System.out.println("d4 stipendio tot: " +Dipendente.calcolaPaga(d[3],5));

        System.out.println("Stipendi totali con 5 ore di straordinario: "+calcolaTot(d,5));
    }

    public static double calcolaTot(Dipendente[] d,int n){
        double sum=0;
        for(Dipendente x:d){
            sum+=Dipendente.calcolaPaga(x,n);
        }
        return sum;
    }
}
