package exemplo_atleta_relac_static;

public class Pais {
	private String nome;

	public Pais(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pais [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
