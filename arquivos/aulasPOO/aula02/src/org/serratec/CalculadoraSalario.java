package org.serratec;

public class CalculadoraSalario {

	public static void main(String[] args) {
		String nome = "Pedro";
		double salario = 2000.00;
		
		if (salario >= 5839.45) {
			salario = salario * 0.89;
		}else if (salario >= 2919.73) {
			salario = salario * 0.9;
		}else if (salario >= 1751.82) {
			salario = salario * 0.91;
		} else {
			salario = salario * 0.92;
		}
		
		System.out.println("Sal�rio: " + salario);
	}

}
