package src.principal;

import src.bestia.*;
import src.heroes.*;


public class Principal{

	private Bestia ejercitoBestia [];
	private Heroes ejercitoHeroes [];


	public Principal(){



		ejercitoBestia = new Bestia[5];
		inicializarBestias();

		for (int i= 0; i < ejercitoBestia.length ;i++ ) {

			ejercitoBestia[i].presentarse();

			
		}

		ejercitoHeroes = new Heroes[5];
		inicializarHeroes();

		for (int i= 0; i < ejercitoHeroes.length ;i++ ) {

			ejercitoHeroes[i].presentarse();

			
		}





	}

	public void inicializarBestias(){
		int random;
		for (int i = 0; i < ejercitoBestia.length ; i++ ) {

			int numero = (int)(Math.random()*2);

			switch(numero){

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

	public void inicializarHeroes(){

		int random;

		for (int i = 0; i < ejercitoHeroes.length ; i++ ) {

			int numero = (int)(Math.random()*4);

			switch(numero){

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
		



}