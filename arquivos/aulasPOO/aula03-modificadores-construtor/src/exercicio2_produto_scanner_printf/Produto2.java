package exercicio2_produto_scanner_printf;

public class Produto2 {
	private String descricao;
	private double valor;
	private int quantidade;
	
	public Produto2(String descricao, double valor, int quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double calcularIcms() {
		return valor * quantidade * 0.12;
	}
	
}
