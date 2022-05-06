package exemplo6_arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo6Gravacao {

	public static void main(String[] args) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter("/Teste_aula11_POO/exercicio3.txt"));
			bw.append("Serratec-Java");
			bw.append("Ol� mundo");
			bw.write("Teste");
			bw.close();
			
		} catch (IOException e) {
			System.out.println("Arquivo n�o encontrado!!");
			e.printStackTrace();
		}
	
	}

}
