package exercicio_pedido_enumComAtributos_forEach;

import java.time.LocalDate;

public class TestePedido {

	public static void main(String[] args) {
		Pedido p1 = new Pedido(LocalDate.now(), Bebida.REFRIGERANTE, Sanduiche.HOTDOG);
		
		p1.imprimirCardapio();
		
		System.out.println(p1);
		System.out.println("Total do pedido: " + p1.calcularPedido());

	}

}
