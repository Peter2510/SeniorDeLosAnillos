package src.heroes;

import src.personaje.Personaje;


public class Heroes extends Personaje{



	public Heroes(String nombre, int vida){

		super(nombre, vida, 100, 105, false);
	



	}

	public void atacar(){
		lanzarDado1(ataqueMaximo);
		lanzarDado2(ataqueMaximo);

		if (getNumAleatorio1() > getNumAleatorio2()) {

			System.out.println("El daño realizado fue de: " + getNumAleatorio1());
			
		}

		
		if (getNumAleatorio2() > getNumAleatorio1()) {

			System.out.println("El daño realizado fue de: " + getNumAleatorio2());
			
		}		

		

	}

	




}