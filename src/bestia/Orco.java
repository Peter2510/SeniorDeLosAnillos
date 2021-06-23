package src.bestia;


public class Orco extends Bestia{



	public Orco(String nombre){

		super(nombre, 300);
		
		


	}

	public void atacar(){
		lanzarDado1(ataqueMaximo);
		System.out.println("El daño realizado fue de: " + getNumAleatorio1());

	}


}