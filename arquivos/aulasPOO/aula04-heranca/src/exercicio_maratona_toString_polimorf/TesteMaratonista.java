package exercicio_maratona_toString_polimorf;

public class TesteMaratonista {

	public static void main(String[] args) {
		Maratona m1 = new AtletaAmador("João", "M", 16, 1.70, true);
		Maratona m2 = new AtletaProfissional("Maria", "F", 17, 1.60, 60.00);
		Maratona m3 = new AtletaProfissional("Pedro", "M", 28, 1.80, 78.00);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m1.verificaSituacao());
		System.out.println(m2.verificaSituacao());
		System.out.println(m3.verificaSituacao());
	}

}
