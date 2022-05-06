package exemplo_varArgs_forEach;

public class ExemploVarArgs {

	public static void main(String[] args) {
		int total = calculaSoma(3, 100, 200);
		System.out.println("Total: " + total);
	}

	private static int calculaSoma(int numero, int...numeros) {
		int soma = 0;
		
		for (int valor : numeros) {
			soma += valor;
		}
		
		return soma * numero;
	}
	
}
