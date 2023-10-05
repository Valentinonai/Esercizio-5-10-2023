package Esercizio1.entities;

import static Esercizio1.entities.Livello.*;

public class Dipendente {
   public static double stipendioBase=1000;
   private int matricola;
   private double stipendio;
   private double importoOrarioStraordinario;
   private Livello livello;
   private Dipartimento dipartimento;

    //COSTRUTTORI
    public Dipendente(int matricola,Dipartimento dipartimento){
        this.matricola=matricola;
        this.dipartimento=dipartimento;
        this.stipendio= stipendioBase;
        this.importoOrarioStraordinario=30;
        this.livello= OPERAIO;

    }
    public Dipendente(int matricola,double stipendio,double importoOrarioStraordinario,Livello livello,Dipartimento dipartimento){
      this.matricola=matricola;
      this.livello=livello;
      this.dipartimento=dipartimento;
      this.importoOrarioStraordinario=importoOrarioStraordinario;
      this.stipendio=stipendio;
    }

    //METODI

    public void print(){
        System.out.println("Matricola: "+this.matricola);
        System.out.println("Dipartimento: "+this.dipartimento);
        System.out.println("Livello: "+this.livello);
        System.out.println("Stipendio: "+this.stipendio);
        System.out.println("Importo Orario Straordinario: "+this.importoOrarioStraordinario);
    }

    public Livello promuovi(){
        switch(this.livello){
            case OPERAIO -> {
                this.livello = IMPIEGATO;
                this.stipendio = this.stipendio * 1.2;
            }
            case IMPIEGATO -> {
                this.livello = QUADRO;
                this.stipendio = this.stipendio * 1.5;
            }
            case QUADRO -> {
                this.livello = DIRIGENTE;
                this.stipendio = this.stipendio * 2;
            }
            default -> System.out.println("Il dipendente non può essere promosso perchè è già dirigente");
        }
        return this.livello;
    }

   //GETTERS AND SETTERS
    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    //METODI STATICI

    public static double calcolaPaga(Dipendente d){
        return d.stipendio;
    }

    public static double calcolaPaga(Dipendente d,int oreStraordinario){
        return d.stipendio+(d.importoOrarioStraordinario*oreStraordinario);
    }
}
