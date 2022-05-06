package exemplo1_compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", "12345678", 28);
		Pessoa p2 = new Pessoa("Fábio", "11112222", 27);
		Pessoa p3 = new Pessoa("Francarlo", "33334444", 59);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);
		System.out.println(pessoas);
		
		List<String>cores = new ArrayList<String>();
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Roxo");
		Collections.sort(cores);
		System.out.println(cores);
		
	}

}
