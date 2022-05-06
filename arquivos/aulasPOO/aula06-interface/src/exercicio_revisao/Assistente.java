package exercicio_revisao;

public class Assistente extends Funcionario {
	private String categoria;

	public Assistente(String nome, double salario, String categoria) {
		super(nome, salario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Assistente [categoria=" + categoria + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void calcularAumentoSalario() {
		salario = salario * 1.1 + 100;
	}

}
