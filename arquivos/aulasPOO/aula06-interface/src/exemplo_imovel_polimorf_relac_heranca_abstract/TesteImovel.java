package exemplo_imovel_polimorf_relac_heranca_abstract;

public class TesteImovel {

	public static void main(String[] args) {
		Imovel c1 = new Casa("Centro", 500000.00, true);
		Imovel a1 = new Apto("Bingen", 250000.00, 5, 503);
		Proprietario p1 = new Proprietario("Pedro", c1);

		System.out.println("Proprietário: " + p1.getNome());
		System.out.println(p1.getImovel());

	}

}
