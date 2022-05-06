package exercicio_venda_static_interface_enum_relac;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private static double totalVenda = 0;

	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", dataCompra=" + dataCompra + ", quantidade=" + quantidade + "]";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		totalVenda += produto.getValor() * quantidade;
	}

	public void mostrarVenda() {
		System.out.println("Total da venda: " + totalVenda);
	}

}
