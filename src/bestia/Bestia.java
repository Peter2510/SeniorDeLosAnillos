package src.bestia;

import src.personaje.Personaje;


public class Bestia extends Personaje{

	
	protected int ataqueMaximo = 90;
	protected int cantidadDados = 1;
	



	public Bestia(String nombre, int vida, int ataqueMaximo, int armadura, boolean bestia, int cantidadDados){

		super(nombre, vida, ataqueMaximo, armadura, bestia);
		
		this.ataqueMaximo = 90;
		this.cantidadDados = cantidadDados;


	}

	




}