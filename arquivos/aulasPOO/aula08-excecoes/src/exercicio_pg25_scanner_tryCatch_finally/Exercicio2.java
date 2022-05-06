package exercicio_pg25_scanner_tryCatch_finally;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite um n�mero decimal: ");
			double numero = sc.nextDouble();
			System.out.println("Voc� digitou: " + numero);
		} catch (Exception e) {
			System.out.println("Falha ao ler seu n�mero.");
		} finally {
			sc.close();
		}
	}

}
