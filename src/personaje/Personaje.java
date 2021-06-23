package src.personaje;

public class Personaje{

	protected int vida;
	protected int ataqueMaximo;
	protected String nombre;
	protected int armadura;
	protected boolean bestia;
	protected int numAleatorio1;
	protected int numAleatorio2;



	public Personaje(String nombre, int vida, int ataqueMaximo, int armadura, boolean bestia){

		this.nombre = nombre;
		this.vida = vida;
		this.ataqueMaximo = ataqueMaximo;
		this.armadura = armadura;
		this.bestia = bestia;

	}

	public void presentarse(){

		System.out.println("Mi nombre es: " + nombre + " tengo " + vida + " de vida y " + armadura + " de armadura");


	}

	public void lanzarDado1(int valorMaximo){


		
		numAleatorio1 = (int) (Math.random() * ataqueMaximo);	

	}

	public void lanzarDado2(int valorMaximo){
		numAleatorio2 = (int) (Math.random() * ataqueMaximo);	

	}

	public int getNumAleatorio1(){
		return numAleatorio1;
	}

	public int getNumAleatorio2(){
		return numAleatorio2;
	}




}