package exemplo2_generics;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Pedro", "Dev Junior", "TI");
		Funcionario f2 = new Funcionario("Fábio", "Engenheiro", "Infraestrutura");
		Funcionario f3 = new Funcionario("Francarlo", "Técnico", "Reparos");
		Funcionario f4 = new Funcionario("Roni", "Analista de Sistemas", "CPD");
		
		Sorteio<Funcionario> sorteio = new Sorteio<Funcionario>();
		sorteio.adicionar(f1);
		sorteio.adicionar(f2);
		sorteio.adicionar(f3);
		sorteio.adicionar(f4);

		Funcionario funcionario = sorteio.sortear();
		System.out.println(funcionario);
		
		Sorteio<Integer> sortearNumeros = new Sorteio<Integer>();
		sortearNumeros.adicionar(1);
		sortearNumeros.adicionar(2);
		sortearNumeros.adicionar(3);
		Integer i = sortearNumeros.sortear();
		System.out.println(i);
	}

}
