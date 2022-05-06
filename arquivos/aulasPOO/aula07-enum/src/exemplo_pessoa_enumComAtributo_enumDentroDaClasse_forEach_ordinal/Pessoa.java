package exemplo_pessoa_enumComAtributo_enumDentroDaClasse_forEach_ordinal;

public class Pessoa {
	private String nome;
	private String email;
	private Setor setor;
	private EstadoCivil estadoCivil;
	private Escolaridade escolaridade;

	enum Escolaridade {
		GRADUACAO('G'), MEDIO('M'), FUNDAMENTAL('F');

		private char escolaridade;

		Escolaridade(char escolaridade) {
			this.escolaridade = escolaridade;
		}
	}

	public Pessoa(String nome, String email, Setor setor, EstadoCivil estadoCivil, Escolaridade escolaridade) {
		this.nome = nome;
		this.email = email;
		this.setor = setor;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", setor=" + setor + ", estadoCivil=" + estadoCivil
				+ ", escolaridade=" + escolaridade + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

}
