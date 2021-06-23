package src.heroes;

import src.personaje.Personaje;


public class Heroes extends Personaje{
	int numeroMaximo;



	public Heroes(String nombre, int vida){

		super(nombre, vida, 100, 105, false);
	



	}

	public void atacar(){
		lanzarDado1(ataqueMaximo);
		lanzarDado2(ataqueMaximo);

		if (getNumAleatorio1() > getNumAleatorio2()) {

			System.out.println("El daño realizado sera de: " + getNumAleatorio1());
			numeroMaximo = getNumAleatorio1();
			
		}

		
		if (getNumAleatorio2() > getNumAleatorio1()) {

			System.out.println("El daño realizado sera de: " + getNumAleatorio2());
		 numeroMaximo = getNumAleatorio2();
			
		}		

		

	}

	
	public int getNumeroMayor(){
		return numeroMaximo;
	}



}