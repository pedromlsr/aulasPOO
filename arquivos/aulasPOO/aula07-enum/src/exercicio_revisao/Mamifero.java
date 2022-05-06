package exercicio_revisao;

import java.time.LocalDate;

public abstract class Mamifero extends Animal {
	protected String raca;
	
	public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String emitirSom() {
		return null;
	}

	public abstract void amamentar();
}
