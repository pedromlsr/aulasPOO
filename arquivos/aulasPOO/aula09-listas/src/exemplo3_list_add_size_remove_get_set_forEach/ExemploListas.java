package exemplo3_list_add_size_remove_get_set_forEach;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {
		List lista = new ArrayList<>();
		lista.add("Celular");
		lista.add("TV 42");
		lista.add("Kindle");

		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(lista.remove(0));
		System.out.println(lista);
		System.out.println(lista.get(1));
		lista.set(0, "TV 55");

		System.out.println("-----");

		for (Object object : lista) {
			System.out.println(object);
		}
	}

}
