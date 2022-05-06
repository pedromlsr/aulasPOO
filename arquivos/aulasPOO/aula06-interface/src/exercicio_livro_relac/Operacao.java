package exercicio_livro_relac;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;

	public Operacao(String tipo, double valorOperacao, Livro livro) {
		this.tipo = tipo;
		this.valorOperacao = valorOperacao;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Operacao [tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 0.02 + taxaEmprestimo;
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() + livro.getValor() * 0.09;
	}

}
