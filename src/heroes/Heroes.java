package src.heroes;

import src.personaje.Personaje;


public class Heroes extends Personaje{

	
	protected int ataqueMaximo = 90;
	protected int cantidadDados = 2;
	



	public Bestia(String nombre, int vida, int ataqueMaximo, int armadura, boolean bestia, int cantidadDados){

		super(nombre, vida, ataqueMaximo, armadura, bestia);
		
		this.ataqueMaximo = 90;
		this.cantidadDados = cantidadDados;


	}

	




}