package org.serratec;

public class ExemploTernario {

	public static void main(String[] args) {
		boolean f = (1 > 5);
		boolean a = !(1 < 2);
		System.out.println(a);

		int dia = 30;
		if (dia < 30) {
			System.out.println("M�s de Fevereiro");
		} else {
			System.out.println("Outro m�s");
		}

		System.out.println(dia < 30 ? "M�s de Fevereiro" : "Outro m�s");
	
	}

}
