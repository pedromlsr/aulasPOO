package exemplo_medico_polimorf;

public class Medico {
	protected String crm;
	protected String nome;
	protected double valorConsulta;
	
	public Medico(String crm, String nome, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.valorConsulta = valorConsulta;
	}
	
	@Override
	public String toString() {
		return "crm: " + crm + " - " + "nome: " + nome + " - " + "Valor Consulta: " + valorConsulta;
	}

	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}
	
	
}
