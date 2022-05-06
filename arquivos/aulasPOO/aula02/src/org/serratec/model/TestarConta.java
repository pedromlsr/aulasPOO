package org.serratec.model;

public class TestarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 123;
		conta1.titular = "Fulano";
		conta1.saldo = 1000.00;

		conta1.depositar(100);

		Conta conta2 = new Conta();
		conta2.numero = 234;
		conta2.titular = "Pedro";
		conta2.saldo = 2000.00;

		if (conta2.saque(200)) {
			System.out.println("Saque efetuado com sucesso!");
			System.out.println("Seu saldo é: " + conta2.saldo);
		} else {
			System.out.println("Saldo insuficiente!");
		}

	}

}
