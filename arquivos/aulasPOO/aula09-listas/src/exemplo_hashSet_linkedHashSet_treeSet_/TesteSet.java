package exemplo_hashSet_linkedHashSet_treeSet_;

import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String[] args) {
		//HashSet tem uma ordem pr�pria
		//Set<String> lista = new HashSet<>();
		//LinkedHashSet mant�m a ordem de inser��o
		//Set<String> lista = new LinkedHashSet<>();
		//TreeSet ordena naturalmente
		Set<String> lista = new TreeSet<>();
		lista.add("TV 43");
		lista.add("Celular");
		lista.add("Kindle");
		lista.add("Impressora");
		lista.add("Roteador");
		lista.add("Roteador");
		lista.add("Roteador");
		
		System.out.println(lista);
	}

}
