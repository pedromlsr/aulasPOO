package exemplo_pessoa_polimorf;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new PessoaJuridica ("Amanda", 20, "555555555");
		Pessoa p2 = new PessoaFisica ("Bernardo", 25, "666666666");
		PessoaJuridica pj1 = new PessoaJuridica("Serratec", 6, "12345678");
		PessoaJuridica pj2 = new PessoaJuridica("Senai", 10, "987654321");
		PessoaFisica pf1 = new PessoaFisica("Pedro", 28, "22222222");
		PessoaFisica pf2 = new PessoaFisica("Thiago", 19, "1111111");

	}

}
