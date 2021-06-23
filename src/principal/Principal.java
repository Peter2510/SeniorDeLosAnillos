package src.principal;

import src.bestia.Bestia;

public class Principal{

	public static void main(String[] args) {


		


		Bestia b1 = new Bestia("Bestia1", 200, 90, 10, true, 1);

		Bestia b2 = new Bestia("Bestia2", 200, 90, 10, true, 1);

		b1.presentarse();
		b2.presentarse();
		b1.atacar();
	}




}