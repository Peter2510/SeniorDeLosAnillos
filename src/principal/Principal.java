package src.principal;

import src.bestia.*;
import src.heroes.*;

public class Principal {

  private Bestia ejercitoBestia[];
  private Heroes ejercitoHeroes[];
  private int cantBestias = 0;
  private int cantHeroes = 0;
 
  public Principal() {

    ejercitoBestia = new Bestia[5];
    inicializarBestias();

    System.out.println("\nEjercito de Bestias:");

    for (int i = 0; i < ejercitoBestia.length; i++) {

      ejercitoBestia[i].presentarse();

    }

    ejercitoHeroes = new Heroes[5];
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
    int random;
    for (int i = 0; i < ejercitoBestia.length; i++) {

      int numero = (int)(Math.random() * 2);

      switch (numero) {

      case 0:

        ejercitoBestia[i] = new Orco("Orco1");
        break;

      case 1:

        ejercitoBestia[i] = new Trasgos("Trasgo1");
        break;

      default:
        ejercitoBestia[i] = new Orco("sepa");
        break;
      }

    }
  }

  public void inicializarHeroes() {

    

    for (int i = 0; i < ejercitoHeroes.length; i++) {

      int numero = (int)(Math.random() * 3);
      

      switch (numero) {

      case 0:

        ejercitoHeroes[i] = new Elfos("Elfo1");
        break;

      case 1:

        ejercitoHeroes[i] = new Humanos("Humano1");
        break;

      case 2:
        ejercitoHeroes[i] = new Hobbits("Hobbit 1");
        break;

      }

    }
  }

   public void pelea(){

    while(cantBestias==5 || cantHeroes==5){

        for (int i = 0; i <ejercitoBestia.length ;i++ ) {
          
          System.out.println("\n");
        System.out.println("Ataque de Heroe a Bestia\n");
        ejercitoBestia[i].atacar();
        ejercitoBestia[i].setVida(ejercitoBestia[i].getVida()-ejercitoBestia[i].getNumAleatorio1());
        ejercitoBestia[i].recibirAtaque(ejercitoHeroes[i]);
        if (ejercitoBestia[i].getVida()==0) {

          cantBestias++;
          
        }
        
        System.out.println("\n");
        System.out.println("Ataque de Bestia a Heroe\n");
        ejercitoHeroes[i].atacar();
        ejercitoHeroes[i].setVida(ejercitoHeroes[i].getVida()-ejercitoHeroes[i].getNumeroMayor());
        ejercitoHeroes[i].recibirAtaque(ejercitoBestia[i]);  

        if (ejercitoHeroes[i].getVida()==0) {

          cantHeroes++;
          
        }
        }
        

    }

      
        
    }

}