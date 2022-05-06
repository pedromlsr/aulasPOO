package exemplo_pessoa_generic_forEach;

import java.util.ArrayList;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Amarildo", "amarildo@gmail.com", 55);
		Pessoa p2 = new Pessoa("Carlos", "carlos@yahoo.com.br", 39);
		Pessoa p3 = new Pessoa("Carla", "carla@yahoo.com.br", 18);
		Cliente c1 = new Cliente("Marcio");
		
		
		List<Pessoa> pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		//pessoas.add(c1);
		
		//pessoas.addAll();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
