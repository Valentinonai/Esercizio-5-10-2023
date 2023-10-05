package Esercizio1.entities;

import Esercizio2.Cliente;

import java.util.SortedMap;

public abstract class Persona {
    protected String nome;
    protected String cognome;
    protected int age;

    public Persona(String nome,String congnome, int age){
        this.nome=nome;
        this.cognome=congnome;
        this.age=age;
    }

    public abstract void presentazione();

    public static void mansione(Persona p){
        if(p instanceof Dipendente)
            System.out.println("Io sono un dipendente e sono: "+(((Dipendente)p).getLivello()));
            else if(p instanceof Cliente)
            System.out.println("Io sono un cliente e non ho nessuna mansione");
    }
}
