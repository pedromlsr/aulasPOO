package br.com.senai.interfaces;

@FunctionalInterface
public interface Conta {
	public void transacao();
	//public void pagamento();
	
	default void investimento() {
		System.out.println("Investimento realizado com sucesso!");
	}
}
