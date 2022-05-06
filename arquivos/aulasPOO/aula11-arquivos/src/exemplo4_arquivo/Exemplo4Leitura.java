package exemplo4_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo4Leitura {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Teste_aula11_POO/exercicio.txt"));
			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
