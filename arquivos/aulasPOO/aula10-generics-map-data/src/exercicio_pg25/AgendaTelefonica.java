package exercicio_pg25;

import java.util.Map;

public class AgendaTelefonica {
	private Map colecao;

	public AgendaTelefonica(Map colecao) {
		super();
		this.colecao = colecao;
	}

	@Override
	public String toString() {
		return "AgendaTelefonica [colecao=" + colecao + "]";
	}

	public Map getColecao() {
		return colecao;
	}

	public void setColecao(Map colecao) {
		this.colecao = colecao;
	}

	public void inserir(String nome, String numero) {
		
	}
	
}