package org.serratec;
public class ExemploOperadores {
	public static void main(String[] args) {
		int idade = 19;
		double altura = 1.8;

		if (idade >= 18 || altura >= 1.70) {
			System.out.println("Participará da Competição");
		}else {
			System.out.println("Não Participará");
		}
	}
}
