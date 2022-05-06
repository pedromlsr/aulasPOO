package exercicio_funcionario_override;

public class Funcionario {
	protected String nome, cpf, turno;
	protected double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " - Salário: " + salario;
	}

	public double aumentarSalario() {
		return salario + salario * 0.02;
	}

}
