package exemplo_plano_override_totalPorClasse;

public class Clinica extends Plano {
	private String nomeClinica;
	private String cnpj;

	public Clinica(String nome, String nomeClinica, String cnpj) {
		super(nome);
		this.nomeClinica = nomeClinica;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return super.toString() + " - Nome: " + nomeClinica + " - CNPJ: " + cnpj;
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
