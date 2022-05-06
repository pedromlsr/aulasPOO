package exercicio_pg24;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String responsavel;

	private List<Livro> listaLivros = new ArrayList<Livro>();
	
	public Biblioteca(String responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String toString() {
		return "Biblioteca [responsavel=" + responsavel + "]";
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	
	public void adicionar(Livro livro) {
		listaLivros.add(livro);
	}
	
	public void listar() {
		for (Livro livro : listaLivros) {
			System.out.println(livro);
		}
	}
	
	public int pesquisarFaixaDePreco(double valorInicial, double valorFinal) {
		int qtdLivros = 0;
		for (Livro livro : listaLivros) {
			if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
				qtdLivros++;
			}
		}
		return qtdLivros;
	}
	
	public double calcularTotalLivros() {
		double valorTotalLivros = 0;
		for (Livro livro : listaLivros) {
			valorTotalLivros += livro.getPreco();
		}
		return valorTotalLivros;
	}
}