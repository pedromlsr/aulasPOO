package exercicio_luta_relac_equals;

public class TesteLuta {

	public static void main(String[] args) {
		CategoriaLuta cl1 = new CategoriaLuta(1, "Peso Médio");
		CategoriaLuta cl2 = new CategoriaLuta(2, "Peso Pesado");
		Lutador l1 = new Lutador("FabinhoAtleta", cl1, 27, 75.00);
		Lutador l2 = new Lutador("FrancarloSoproDeFogo", cl1, 52, 80.00);
		Lutador l3 = new Lutador("PedroEngasgaFacil", cl2, 28, 100.00);
		Luta luta = new Luta(l1, l3, 3, false);

		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

		luta.confirmarLuta();
		if (luta.isConfirmado() == true) {
			System.out.println("Luta confirmada!");
		} else {
			System.out.println("Luta cancelada...");
		}
	}

}
