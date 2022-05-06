package org.serratec.exemplos;

import org.serratec.interfaces.Calculo;

public class ExemploSoma {

	public static void main(String[] args) {
//		Calculo calculo = new Calculo() {
//			
//			@Override
//			public int operacao(int a, int b) {
//				return a + b;
//			}
//		};
		
		Calculo calculo = (a, b) -> a + b;
		
		System.out.println("O resultado da soma �: " + calculo.operacao(10, 30));
		
	}

}
