package br.com.senai.exemplos;

import br.com.senai.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
//		Conta conta = new Conta() {
//
//			@Override
//			public void transacao() {
//				System.out.println("Transa��o efetuada com sucesso!");
//			}
//			
//		};
		
		Conta conta = () -> System.out.println("Transa��o efetuada com sucesso!");
		
		Conta conta2 = () -> System.out.println("Transa��o efetuada!");
		
		conta.transacao();
		conta2.transacao();
		conta.investimento();
		
	}

}
