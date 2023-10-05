package Esercizio2;

import Esercizio1.entities.Persona;
import Esercizio1.entities.Sportivi;

public class Cliente extends Persona implements Sportivi {

    String codiceCliente;
    int puntiFedeltà;

    String sport;


    public Cliente(String nome,String cognome,int age,String codiceCliente, int puntiFedeltà,String sport){
        super(nome,cognome,age);
        this.codiceCliente=codiceCliente;
        this.puntiFedeltà=puntiFedeltà;
        this.sport=sport;
    }
    @Override
    public void presentazione(){
        System.out.println("Ciao, io sono "+this.nome +" "+this.cognome+" e ho "+this.age+" anni"+" e sono un cliente");
    }

    @Override
    public void sportPraticato(){
        System.out.println("Io sono un cliente e pratico "+ this.sport);
    }
}
