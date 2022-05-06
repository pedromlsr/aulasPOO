package exemplo1_list_arraysAsList_set_get_sort_ternario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArrays {

	public static void main(String[] args) {
		List lista = Arrays.asList("TV 43", "Celular", "Kindle");
		//lista.add("Aparelho de Som");
		//Tamanho fixo, n�o aceita adds ou removes. Por�m, aceita sets. 
		
		if(lista.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			lista.set(1, "Iphone");
			System.out.println(lista.get(1));
			System.out.println("O elemento Kindle est� na lista? " + (lista.contains("Kindle")?"Sim":"N�o"));
		}
		
		Collections.sort(lista);
		System.out.println(lista);
	}

}
