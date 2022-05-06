package exercicio_ir_printf;

public class TesteIR {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("Pedro", 10000.00, "11122233344", "223334445");
		PessoaJuridica pj1 = new PessoaJuridica("Serratec", 100000.00, "112223344556677", "12345678");
		
		System.out.printf("Nome: %s - Rendimentos: %.2f - CPF: %s - RG: %s - IR: %.2f", pf1.nome, pf1.rendimentos, pf1.getCpf(), pf1.getRg(), pf1.calculoIR());
		
		System.out.printf("\nNome: %s - Rendimentos: %.2f - CNPJ: %s - Inscrição Estadual: %s - IR: %.2f", pj1.nome, pj1.rendimentos, pj1.getCnpj(), pj1.getInscEstadual(), pj1.calculoIR());
		
	}

}
