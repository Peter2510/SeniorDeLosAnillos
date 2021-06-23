package src.bestia;

import src.personaje.Personaje;


public class Bestia extends Personaje{

	
	
	public Bestia(String nombre, int vida){

		super(nombre, vida, 90, 125, true);
		
	

	}

	public void atacar(){
		lanzarDado1(ataqueMaximo);
		System.out.println("El daño realizado sera de: " + getNumAleatorio1());

	}


}