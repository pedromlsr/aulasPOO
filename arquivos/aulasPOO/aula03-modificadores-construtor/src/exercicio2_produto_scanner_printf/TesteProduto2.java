package exercicio2_produto_scanner_printf;

import java.util.Scanner;

public class TesteProduto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resposta = 's';
		
		do {
			Produto2 p = new Produto2("Carne", 100.00, 3);
			
			System.out.println("Digite o nome do produto: ");
			p.setDescricao(sc.next());
			System.out.println("Digite a quantidade do produto: ");
			p.setQuantidade(sc.nextInt());
			System.out.println("Digite o valor do produto: ");
			p.setValor(sc.nextDouble());
			
			System.out.printf("Produto: %s", p.getDescricao());
			System.out.printf("\nValor: %.1f", p.getValor());
			System.out.printf("\nQuantidade: %d", p.getQuantidade());
			System.out.printf("\nICMS: %.1f", p.calcularIcms());
			System.out.println("\nDeseja encerrar o programa? (S/N): ");
			resposta = sc.next().charAt(0);
		}
		while (resposta == 'S' || resposta == 's');
		sc.close();
	}

}
