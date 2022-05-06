package exemplo7_arquivo;

import java.util.Objects;

public class Empregado {
	private String nome;
	private String profissao;

	public Empregado(String nome, String profissao) {
		this.nome = nome;
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", profissao=" + profissao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		return Objects.equals(nome, other.nome);
	}

	
	
}
