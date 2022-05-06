package exemplo_funcionario_printf;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Pedro", 10000.00);
		
		System.out.printf("Nome: %s", f1.getNome());
		System.out.printf("\nSalário: %.1f", f1.getSalario());
		System.out.printf("\nINSS: %.1f", f1.calcularInss());
		System.out.printf("\nVale Transporte: %.1f", f1.calcularValeTransporte());
		System.out.printf("\nSalário Líquido: %.1f", f1.calcularSalarioLiquido());
	}

}
