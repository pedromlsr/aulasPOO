package exercicio_venda_static_interface_enum_relac;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "A", 50, Categoria.ELETRONICO);
		Produto p2 = new Produto(2, "B", 20, Categoria.FARMACEUTICO);
		Produto p3 = new Produto(3, "C", 80, Categoria.ALIMENTO);
		Venda v1 = new Venda(p1, LocalDate.now(), 3);
		Venda v2 = new Venda(p2, LocalDate.now(), 4);
		Venda v3 = new Venda(p3, LocalDate.now(), 1);

		System.out.println("Total por itens:");
		v1.calcularVenda();
		System.out.println(p1.getDescricao() + ": " + (p1.getValor() * v1.getQuantidade()));
		v2.calcularVenda();
		System.out.println(p2.getDescricao() + ": " + (p1.getValor() * v2.getQuantidade()));
		v3.calcularVenda();
		System.out.println(p3.getDescricao() + ": " + (p1.getValor() * v3.getQuantidade()));

		System.out.println("Total geral das vendas: " + Venda.getTotalVenda());
	}

}
