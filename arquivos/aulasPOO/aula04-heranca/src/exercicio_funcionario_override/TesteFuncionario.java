package exercicio_funcionario_override;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Pedro", 10000.00, "ABC");
		Assistente a1 = new Assistente("João", 5000.00, 500.00);
		
		System.out.println(g1.toString());
		System.out.println(a1.toString());
		System.out.println(g1.aumentarSalario());
		System.out.println(a1.aumentarSalario());
		
	}

}
