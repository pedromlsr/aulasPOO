package exemplo_policial_finalAttribute_static_heranca;

public class TestePolicial {

	public static void main(String[] args) {
		PolicialFederal pf1 = new PolicialFederal("11111111", "Pedro", 10000.00, "22222222", "Petr�polis");
		PolicialFederal pf2 = new PolicialFederal("33333333", "F�bio", 15000.00, "44444444", "Rio de Janeiro");
		Policial p1 = new Policial("55555555", "Francarlo", 8000.00, "S�o Paulo");
		Policial p2 = new Policial("66666666", "Larissa", 12000.00, "Belo Horizonte");

		System.out.println("Total de policiais: " + Policial.getTotalPoliciais());

	}

}
