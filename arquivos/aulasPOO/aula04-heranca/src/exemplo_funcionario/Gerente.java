package exemplo_funcionario;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionarios;
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public boolean autentica(int senha) {
		return false;
	}
	
}

