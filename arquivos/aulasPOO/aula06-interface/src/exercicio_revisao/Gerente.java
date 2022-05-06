package exercicio_revisao;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, double salario, String nivel) {
		super(nome, salario);
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Gerente [nivel=" + nivel + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public void calcularAumentoSalario() {
		salario *= 1.10;
	}

}
