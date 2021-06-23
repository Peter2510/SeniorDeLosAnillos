public class Bestia{

	protected int vida;
	protected int ataqueMaximo;
	protected String nombre;
	protected int armadura;
	protected boolean bestia;



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




}