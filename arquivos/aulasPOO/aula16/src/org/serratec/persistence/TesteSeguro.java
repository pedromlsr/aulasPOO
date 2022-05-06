package org.serratec.persistence;

import java.util.Optional;

import org.serratec.model.Carro;
import org.serratec.model.Seguro;

public class TesteSeguro {

	public static void main(String[] args) {
		Seguro seguro1 = new Seguro("Parcial", 1200.00);
		Seguro seguro2 = new Seguro("Total", 2500.00);
		Carro carro1 = new Carro("VW", "Golf", 55000.00, Optional.of(seguro1));
		Carro carro2 = new Carro("Hyundai", "HB20", 60000.00, Optional.ofNullable(null));

		String cobertura = carro2.getSeguro().map(Seguro::getCobertura).orElse("N�o tem cobertura");
		Optional<Double> valorSeguro = carro1.getSeguro().map(Seguro::getValorSeguro);
		
		System.out.println(valorSeguro.get());
		System.out.println(cobertura);
		
		System.out.println(carro1);
		System.out.println(carro2);
	}

}
