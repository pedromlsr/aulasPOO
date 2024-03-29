package exemplo_pessoa_heranca_totalPorClasse_abstract;

public class PessoaFisica extends Pessoa implements Tributos {
	private String cpf;

	public PessoaFisica(String nome, String endereco, double rendimentos, String cpf) {
		super(nome, endereco, rendimentos);
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", rendimentos=" + rendimentos
				+ "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calculaImpostoDeRenda() {
		return rendimentos * irendaPessoaFisica;
	}

	@Override
	public double calculaICMS() {
		return 0;
	}

}
