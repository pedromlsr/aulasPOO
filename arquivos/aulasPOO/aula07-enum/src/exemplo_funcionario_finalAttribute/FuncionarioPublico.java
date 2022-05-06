package exemplo_funcionario_finalAttribute;

public class FuncionarioPublico {
	private String nome;
	private String cargo;
	private final int ANO_CONCURSO;
	
	public FuncionarioPublico(String nome, String cargo, int aNO_CONCURSO) {
		this.nome = nome;
		this.cargo = cargo;
		ANO_CONCURSO = aNO_CONCURSO;
	}
	
	@Override
	public String toString() {
		return "FuncionarioPublico [nome=" + nome + ", cargo=" + cargo + ", ANO_CONCURSO=" + ANO_CONCURSO + "]";
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getANO_CONCURSO() {
		return ANO_CONCURSO;
	}
	
}
