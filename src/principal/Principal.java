package src.principal;

import src.bestia.Bestia;
import src.heroes.Heroes;

public class Principal{

	public static void main(String[] args) {


		


		Bestia b1 = new Bestia("Bestia1", 200, 90, 10, true, 1);
		Bestia b2 = new Bestia("Bestia2", 200, 90, 10, true, 1);

		Heroes h1 = new Heroes("Heroe1", 181, 100,12, false,2);
		Heroes h2 = new Heroes("Heroe2", 181, 100,12, false,2);

		b1.presentarse();
		b2.presentarse();
		b1.atacar();
		h1.presentarse();
		h2.presentarse();
		h1.atacar();
	}




}