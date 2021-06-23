package src.bestia;


public class Trasgos extends Bestia{



	public Trasgos(String nombre){

		super(nombre, 325);
		


	}

	public void atacar(){
		lanzarDado1(ataqueMaximo);
		System.out.println("El daño realizado fue de: " + getNumAleatorio1());

	}


}