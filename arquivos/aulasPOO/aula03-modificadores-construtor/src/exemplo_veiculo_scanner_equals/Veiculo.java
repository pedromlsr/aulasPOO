package exemplo_veiculo_scanner_equals;

public class Veiculo {
	String placa;
	String tipoCombustivel;
	double valor;

	public double calcularIPVA() {
		if (tipoCombustivel.equals("Flex") || tipoCombustivel.equals("Gasolina")) {
			return valor * 0.04;
		} else {
			return valor * 0.015;
		}
	}

}
