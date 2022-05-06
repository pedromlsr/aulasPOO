package exemplo1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exemplo1Map {

	public static void main(String[] args) {
		HashMap<String, String> mapaEstados = new HashMap<>();
		mapaEstados.put("RJ", "Rio de Janeiro");
		mapaEstados.put("SP", "São Paulo");
		mapaEstados.put("MG", "Minas Gerais");
		mapaEstados.put("ES", "Espírito Santo");
		mapaEstados.put("RS", "Rio Grande do Sul");
		mapaEstados.put("RS", "Rio Grande do Sul");
		mapaEstados.put("RS2", "Rio Grande do Sul");
		
		for (String sigla : mapaEstados.keySet()) {
			System.out.println(sigla);
		}
		
		System.out.println();
		
		for (String nome : mapaEstados.values()) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		for (Map.Entry<String, String> dados : mapaEstados.entrySet()) {
			//System.out.println(dados);
			System.out.println(dados.getKey() + " - " + dados.getValue());
		}
		
		TreeMap<String, String> mapasOrdenados = new TreeMap<>(mapaEstados);
		System.out.println("\n*********************\n");
		System.out.println(mapasOrdenados);
		System.out.println(mapasOrdenados.descendingMap());
		
	}

}
