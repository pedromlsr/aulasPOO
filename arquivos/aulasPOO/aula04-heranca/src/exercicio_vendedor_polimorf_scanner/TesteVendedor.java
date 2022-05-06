package exercicio_vendedor_polimorf_scanner;

import java.util.Scanner;

public class TesteVendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resposta;
		double valorVenda;

		Vendedor v1 = new Fixo("Pedro", "123", 5000.00, 100.00, 5000.00);
		Vendedor v2 = new Fixo("Fabiano", "456", 7000.00, 100.00, 7000.00);

		do {
			System.out.println("\nVendedores:\n1) Pedro\n2) Fabiano");
			System.out.println("Escolha um vendedor: ");
			resposta = sc.next().charAt(0);

			if (resposta == 1) {

			}

			System.out.println("Deseja encerrar o programa? (S/N): ");
			resposta = sc.next().charAt(0);
		} while (resposta == 'N' || resposta == 'n');

	}

}
