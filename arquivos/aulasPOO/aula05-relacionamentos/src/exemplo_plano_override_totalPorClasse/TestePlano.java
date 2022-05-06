package exemplo_plano_override_totalPorClasse;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c1 = new Clinica("Sul América", "Checkup", "11111111");
		Medico m1 = new Medico("Golden Cross", "2222222", "Ana Luiza");
		Anestesista a1 = new Anestesista ("Unimed", "333333", "Carlos", "Geral");
		
		ControlePagamento cp = new ControlePagamento();
		
		c1.calcularPagamento();
		m1.calcularPagamento();
		a1.calcularPagamento();
		
		cp.calcularTotalPago(c1);
		cp.calcularTotalPago(m1);
		cp.calcularTotalPago(a1);
		
		System.out.println(c1);
		System.out.println(m1);
		System.out.println(a1);
		
		System.out.println("O valor total é: " + String.format("%.2f", cp.getTotalPago()));
		
	}

}
