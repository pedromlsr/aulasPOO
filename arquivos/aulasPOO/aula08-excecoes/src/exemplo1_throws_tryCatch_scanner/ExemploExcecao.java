package exemplo1_throws_tryCatch_scanner;

import java.util.Scanner;

public class ExemploExcecao {

	//throws - Passar o erro adiante
	public static int divisao(int i, int j) throws ArithmeticException {
		return i/j;
		//throw new ArithmeticException("Erro divis�o por zero!");
	}
	
	public static void main(String[] args) {
		int a, b;
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o primeiro n�mero: ");
			a = sc.nextInt();
			
			System.out.println("Digite o segundo n�mero: ");
			b = sc.nextInt();

			System.out.println("O resultado �: " + divisao(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Erro de divis�o por zero!");
			System.out.println(e.getMessage());
		}
		
	}

}
