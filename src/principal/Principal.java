package src.principal;

import src.bestia.*;
import src.heroes.*;

public class Principal {

    private Bestia ejercitoBestia[];
    private Heroes ejercitoHeroes[];
    private int cantBestias = 3;
    private int cantHeroes = 3;
    

    public Principal() {

        ejercitoBestia = new Bestia[3];
        inicializarBestias();

        System.out.println("\nEjercito de Bestias:");

        for (int i = 0; i < ejercitoBestia.length; i++) {

            ejercitoBestia[i].presentarse();

        }

        ejercitoHeroes = new Heroes[3];
        inicializarHeroes();

        System.out.println("\nEjercito de Heroes:");

        for (int i = 0; i < ejercitoHeroes.length; i++) {

            ejercitoHeroes[i].presentarse();

        }
        System.out.println("\n");
        this.pelea();
        System.out.println("\n");

    }

    public void inicializarBestias() {

        ejercitoBestia[0] = new Orco("Orco 1");
        ejercitoBestia[1] = new Trasgos("Trasgo 1");
        ejercitoBestia[2] = new Orco("Orco 2");
    }

    public void inicializarHeroes() {

        ejercitoHeroes[0] = new Humanos("Humano 1");
        ejercitoHeroes[1] = new Elfos("Elfo 1");
        ejercitoHeroes[2] = new Hobbits("Hobbit 1");

    }

    public void pelea() {

        
        int orco =1;
        int humano = 1;
        int trasgo= 1;
        int elfo= 1;
        int orco2 =1;
        int hobbit= 1;


        while (orco==1 && humano==1) {

            System.out.println("\n          PELEA NO. 1          "); 

            System.out.println("\n");
            System.out.println(" ********Ataque de Heroe a Bestia ********\n");
            ejercitoBestia[0].atacar();
            ejercitoBestia[0].setVida(ejercitoBestia[0].getVida() - ejercitoBestia[0].getNumAleatorio1());
            ejercitoBestia[0].recibirAtaque(ejercitoHeroes[0]);

            System.out.println("\n");
            System.out.println(" ********Ataque de Bestia a Heroe ********\n");
            ejercitoHeroes[0].atacar();
            ejercitoHeroes[0].setVida(ejercitoHeroes[0].getVida() - ejercitoHeroes[0].getNumeroMayor());
            ejercitoHeroes[0].recibirAtaque(ejercitoBestia[0]);

            if (ejercitoBestia[0].getVida()<=0) {
                orco=0;
                cantBestias--;
                System.out.println("------- GANA EL HUMANO -------");
                
            }
            if (ejercitoHeroes[0].getVida()<=0) {
                humano=0;
                cantHeroes--;
                System.out.println("------- GANA EL ORCO 1 -------");
                
            }



        }

          while (trasgo==1 && elfo==1) {

            System.out.println("\n          PELEA NO. 2          ");            
            System.out.println("\n");
            System.out.println(" ******** Ataque de Heroe a Bestia ********\n");
            ejercitoBestia[1].atacar();
            ejercitoBestia[1].setVida(ejercitoBestia[1].getVida() - ejercitoBestia[1].getNumAleatorio1());
            ejercitoBestia[1].recibirAtaque(ejercitoHeroes[1]);

            System.out.println("\n");
            System.out.println(" ********Ataque de Bestia a Heroe ********\n");
            ejercitoHeroes[1].atacar();
            ejercitoHeroes[1].setVida(ejercitoHeroes[1].getVida() - ejercitoHeroes[1].getNumeroMayor());
            ejercitoHeroes[1].recibirAtaque(ejercitoBestia[1]);

            if (ejercitoBestia[1].getVida()<=0) {
                trasgo=0;
                cantBestias--;
                System.out.println("------- GANA EL ELFO -------");
                
            }
            if (ejercitoHeroes[1].getVida()<=0) {
                elfo=0;
                cantHeroes--;
                System.out.println("------- GANA EL TRASGO -------");
                
            }

        }

          while (orco2==1 && hobbit==1) {

            System.out.println("\n          PELEA NO. 3          "); 

            System.out.println("\n");
            System.out.println(" ********Ataque de Heroe a Bestia ********\n");
            ejercitoBestia[2].atacar();
            ejercitoBestia[2].setVida(ejercitoBestia[2].getVida() - ejercitoBestia[2].getNumAleatorio1());
            ejercitoBestia[2].recibirAtaque(ejercitoHeroes[2]);

            System.out.println("\n");
            System.out.println(" ********Ataque de Bestia a Heroe ********\n");
            ejercitoHeroes[2].atacar();
            ejercitoHeroes[2].setVida(ejercitoHeroes[2].getVida() - ejercitoHeroes[2].getNumeroMayor());
            ejercitoHeroes[2].recibirAtaque(ejercitoBestia[2]);

              if (ejercitoBestia[2].getVida()<=0) {
                orco2=0;
                cantBestias--;
                System.out.println("------- GANA EL HOBBIT -------");
                
            }
            if (ejercitoHeroes[2].getVida()<=0) {
                hobbit=0;
                cantHeroes--;
                System.out.println("------- GANA EL ORCO 2 -------");
                
            }

        }

          if (cantBestias > cantHeroes) {

            System.out.println("\n\nGANA EL EJERCITO DE BESTIAS");
              
          }

          else{
           System.out.println("\n\nGANA EL EJERCITO DE HEROES");
             
          }

    }

}