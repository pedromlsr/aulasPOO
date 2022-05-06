package exercicio_oficina_getDayOfWeek_getMonthValue_enumComAtributo_heranca_interface_relac;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Pedro");
		Carro c1 = new Carro("A", 100.00, LocalDate.of(2022, 4, 16), p1, "SUV");

		System.out.println(c1.trocarOleo());
		System.out.println(c1.revisao());

	}

}
