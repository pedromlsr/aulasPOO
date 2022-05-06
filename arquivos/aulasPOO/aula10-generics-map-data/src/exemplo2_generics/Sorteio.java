package exemplo2_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio <T> {
	private List<T> lista;
	private Random random;
	public Sorteio(List<T> lista, Random random) {
		super();
		this.lista = lista;
		this.random = random;
	}
	@Override
	public String toString() {
		return "Sorteio [lista=" + lista + ", random=" + random + "]";
	}
	public List<T> getLista() {
		return lista;
	}
	public void setLista(List<T> lista) {
		this.lista = lista;
	}
	public Random getRandom() {
		return random;
	}
	public void setRandom(Random random) {
		this.random = random;
	}
	
	public Sorteio() {
		lista = new ArrayList<>();
		random = new Random();
	}
	
	public void adicionar(T elemento) {
		lista.add(elemento);
	}
	
	public void remover(T elemento) {
		lista.remove(elemento);
	}
	
	public T sortear() {
		int pos = random.nextInt(lista.size());
		return lista.get(pos);
	}
}
