package exemplo4_throws_tryCatch_finally_file;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo4Excecao {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\pedro\\aulasOO\\teste.txt");
			System.out.println("Arquivo encontrado!");
			
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado!");
			//e.printStackTrace();
		} finally {
			System.out.println("Sempre entra aqui!");
		}
	
	}
}
