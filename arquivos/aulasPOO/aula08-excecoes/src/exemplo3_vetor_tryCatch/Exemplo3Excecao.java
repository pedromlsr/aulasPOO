package exemplo3_vetor_tryCatch;

public class Exemplo3Excecao {

	public static void main(String[] args) {
		int vetor[] = { 10, 30, 60 };
		int a = 30, b = 0, c = 0;
		String nome = null;

		try {
			System.out.println(nome.equals("Fulano"));
			System.out.println("Vetor posi��o 3: " + vetor[3]);
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Erro divis�o por zero!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor fora de faixa!");
		} catch (NullPointerException e) {
			System.out.println("Esqueceu da inst�ncia do objeto!");
		}
//		} catch (Exception e) {
//			System.out.println("Erro no sistema!");
//			e.printStackTrace();
//		}
	}
}