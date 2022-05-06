package exemplo_fornecedor_static;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("12.123.123/0001-12", "Serratec", "22334455");
		Fornecedor f2 = new Fornecedor("22.222.222/0001-12", "Senai", "22556677");
		Fornecedor f3 = new Fornecedor("22.222.333/0001-12", "Sesi", "22111122");
		
		System.out.println(f1.getCnpj());
		System.out.println(f2.getRazaoSocial());
		System.out.println(f3.getTelefone());
		
		System.out.println("O número total de fornecedores é: " + Fornecedor.getContador());
	}

}
