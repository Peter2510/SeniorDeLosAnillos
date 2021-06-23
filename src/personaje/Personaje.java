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

		System.out.println("El valor del dado 1 lanzado fue de: " + numAleatorio1);

	}

	public void lanzarDado2(int valorMaximo){

		numAleatorio2 = (int) (Math.random() * ataqueMaximo);	
		System.out.println("El valor del dado 2 lanzado fue de: " + numAleatorio2);

	}

	public int getNumAleatorio1(){
		return numAleatorio1;
	}

	public int getNumAleatorio2(){
		return numAleatorio2;
	}

	public String getNombre(){
		return nombre;
	}

	public int getVida(){
		return vida;
	}

	public void setVida(int vida){
		this.vida = vida;

	}

	public int getArmadura(){
		return armadura;
	}

	public int getAtaque(){
		return ataqueMaximo;
	}


	 public void recibirAtaque(Personaje atacante){
        System.out.println(atacante.getNombre() + " atacará a "+ this.getNombre());

        int danyoRecibido = this.obtenerArmadura(atacante) - atacante.obtenerAtaque(this);
        if (danyoRecibido <= 0){
            this.vida += danyoRecibido;
        }
        else{
            danyoRecibido = 0;
        }
        System.out.println(atacante.getNombre()+  " ataco a  " + this.getNombre() +" vida restante: "+this.getVida());
    }

    public int obtenerArmadura(Personaje atacante){
        return this.getArmadura();
    }

    public int obtenerAtaque(Personaje defensor){
        return this.getAtaque();
    }



}