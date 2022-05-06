package org.serratec.persistence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.serratec.model.Autor;

public class TesteAutor {

	public static void main(String[] args) {
		Autor a1 = new Autor("Sandro", "22222222");
		Autor a2 = new Autor("Carla", "22111111");
		
		
		List<Autor> autores = Arrays.asList(a1, a2);
		
		Consumer<Autor> exemploLambda = a -> a.imprimir();
		autores.forEach(exemploLambda);
		
		System.out.println("------------- Method Reference --------------");
		
		Consumer<Autor> exemploMethodReference = Autor::imprimir;
		autores.forEach(exemploMethodReference);
		
		System.out.println("------------- Method Reference em uma linha -------------");
		
		autores.forEach(Autor::imprimir);
		
	}

}
