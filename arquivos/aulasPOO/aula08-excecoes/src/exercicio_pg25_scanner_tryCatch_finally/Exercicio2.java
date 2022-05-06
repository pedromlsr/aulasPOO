package exercicio_pg25_scanner_tryCatch_finally;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite um número decimal: ");
			double numero = sc.nextDouble();
			System.out.println("Você digitou: " + numero);
		} catch (Exception e) {
			System.out.println("Falha ao ler seu número.");
		} finally {
			sc.close();
		}
	}

}
