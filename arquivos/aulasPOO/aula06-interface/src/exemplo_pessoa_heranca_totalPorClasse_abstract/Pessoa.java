package exemplo_pessoa_heranca_totalPorClasse_abstract;

public abstract class Pessoa {
	protected String nome;
	protected String endereco;
	protected double rendimentos;

	public Pessoa(String nome, String endereco, double rendimentos) {
		this.nome = nome;
		this.endereco = endereco;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", rendimentos=" + rendimentos + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

}
