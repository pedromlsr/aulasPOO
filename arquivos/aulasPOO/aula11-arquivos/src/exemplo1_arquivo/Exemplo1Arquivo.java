package exemplo1_arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo1Arquivo {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Teste_aula11_POO\\exercicio.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			e.printStackTrace();
		}

	}

}
