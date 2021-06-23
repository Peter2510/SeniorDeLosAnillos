package src.principal;

import src.bestia.*;
import src.heroes.*;


public class Principal{

	private Bestia ejercitoBestia [];
	private Heroes ejercitoHeroes[];


	public Principal(){



		ejercitoBestia = new Bestia[5];
		inicializarBestias();

		for (int i= 0; i < ejercitoBestia.length ;i++ ) {

			ejercitoBestia[i].presentarse();
			
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

		



}