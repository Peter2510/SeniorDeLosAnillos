package src.heroes;

import src.personaje.Personaje;


public class Heroes extends Personaje{

	
	protected int ataqueMaximo = 100;
	protected int cantidadDados = 2;
	



	public Heroes(String nombre, int vida, int ataqueMaximo, int armadura, boolean bestia, int cantidadDados){

		super(nombre, vida, ataqueMaximo, armadura, bestia);
		
		this.ataqueMaximo = 90;
		this.cantidadDados = cantidadDados;


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