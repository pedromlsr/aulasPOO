package exemplo3_arquivo;

import java.io.File;
import java.util.Scanner;

public class Exemplo3ListarArquivosPastas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o arquivo ou diret�rio: ");
		System.out.println();
		String nome = sc.next();
		File file = new File(nome);
		if (file.exists()) {
			if(file.isFile()) {
				System.out.printf("O arquivo (%s) existe - e o tamanho � de %d bytes", file.getName(), file.length());
			}
			else {
				System.out.println("O conte�do da pasta �: ");
				//String[] diretorio = file.list();
				for (String item : file.list()) {
					System.out.println(item);
				}
			}
		}
		else {
			System.out.println("Arquivo ou diret�rio n�o encontrado!");
		}
		
	}

}
