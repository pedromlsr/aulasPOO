package exercicio_revisao;

import java.time.LocalDate;

public abstract class Ave extends Animal {
	protected String cor;
	
	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String emitirSom() {
		return null;
	}

	public abstract String voar();
	
}
