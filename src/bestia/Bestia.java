package src.bestia;

import src.personaje.Personaje;


public class Bestia extends Personaje{

	
	protected int ataqueMaximo = 90;
	protected int cantidadDados = 1;
	//protected int NumAleatorio1;
	



	public Bestia(String nombre, int vida, int ataqueMaximo, int armadura, boolean bestia, int cantidadDados){

		super(nombre, vida, ataqueMaximo, armadura, bestia);
		
		this.ataqueMaximo = 90;
		this.cantidadDados = cantidadDados;


	}

	public void atacar(){
		lanzarDado1(ataqueMaximo);
		System.out.println("El daño realizado fue de: " + getNumAleatorio1());

	}

	




}