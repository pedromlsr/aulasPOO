package org.serratec.exemplos;

import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Celular");
		lista.add("TV");
		lista.add("Computador");

		
		//Por forEach normal
		lista.forEach(a -> System.out.println(a));
		
		System.out.println("-----------------------");
		
		//Por forEach com Method Reference
		lista.forEach(System.out::println);
	}

}
