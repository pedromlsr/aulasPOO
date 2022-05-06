package exemplo_pessoa_heranca_totalPorClasse_abstract;

public class PessoaJuridica extends Pessoa implements Tributos {
	private String cnpj;
	private String razaoSocial;

	public PessoaJuridica(String nome, String endereco, double rendimentos, String cnpj, String razaoSocial) {
		super(nome, endereco, rendimentos);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nome=" + nome + ", endereco="
				+ endereco + ", rendimentos=" + rendimentos + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public double calculaImpostoDeRenda() {
		return rendimentos * irendaPessoaJuridica;
	}

	@Override
	public double calculaICMS() {
		return rendimentos * icms;
	}

}
