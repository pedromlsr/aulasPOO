package exemplo_marca_forEach;

public class TesteMarca {

	public static void main(String[] args) {
		MarcaCelular mc1 = new MarcaCelular(10, "SN9089", Marca.SAMSUNG);

		System.out.println(mc1);

		// Marca[] marcas = Marca.values();

		// for (int i = 0; i < marcas.length; i++) {
		// System.out.println(marcas[i]);
		// }

		for (Marca marca : Marca.values()) {
			System.out.println(marca);
		}
	}

}
