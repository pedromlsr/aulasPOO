package exemplo_funcionario_vetor_forEachxFor;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Funcionario("Pedro", "Dev Júnior", 4000.00);
		funcionarios[1] = new Funcionario("Fábio", "Dev Pleno", 7000.00);
		funcionarios[2] = new Funcionario("Francarlo", "Dev Sênior", 10000.00);
		
		for (int i = 0; i < funcionarios.length; i++) {
			System.out.println(funcionarios[i] + " - Salário com abono: " + funcionarios[i].abonoSalario(100));
		}
		
		System.out.println("----------------------");
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

	}

}