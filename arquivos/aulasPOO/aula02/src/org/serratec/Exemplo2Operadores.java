package org.serratec;

public class Exemplo2Operadores {

	public static void main(String[] args) {
		int a = 2, b = 5, c = 10;
		
		if (a == 2 && c > b) {
			System.out.println("Verdadeiro");
		}
		
		if (b == 2 || c == 10) {
			System.out.println("Verdadeiro");
		}
		
		if (a == 2 | b == 5) {
			System.out.println("Avalia as duas condi��es");
		}
			
		}
}
