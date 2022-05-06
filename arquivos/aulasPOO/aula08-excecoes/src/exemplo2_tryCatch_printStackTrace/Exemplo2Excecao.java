package exemplo2_tryCatch_printStackTrace;

import org.w3c.dom.html.HTMLFrameSetElement;

public class Exemplo2Excecao {

	public static void main(String[] args) {
		String fraseInicial = null;
		String fraseFinal = null;
		
		try {
			fraseFinal = fraseInicial.toUpperCase();
			System.out.println("Resultado: " + fraseFinal);
		} catch (Exception e) {
			System.out.println("Falha ao converter!");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
