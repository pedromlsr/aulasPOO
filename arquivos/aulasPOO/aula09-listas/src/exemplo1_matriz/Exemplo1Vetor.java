package exemplo1_matriz;

public class Exemplo1Vetor {

	public static void main(String[] args) {
		// String[] vetor = {"Celular", "TV", "Blu-Ray"};
		// vetor[2] = "Aparelho de Som";

		String[][] funcionario = { { "Ana Maria", "anam@gmail.com" }, { "João", "joao@hotmail.com" },
				{ "Carla", "carla@uol.com.br" } };

		for (int linha = 0; linha < funcionario.length; linha++) {
			for (int coluna = 0; coluna < funcionario[linha].length; coluna++) {
				System.out.printf("|" + funcionario[linha][coluna]);
			}
			System.out.printf("|\n");
		}

	}
}
