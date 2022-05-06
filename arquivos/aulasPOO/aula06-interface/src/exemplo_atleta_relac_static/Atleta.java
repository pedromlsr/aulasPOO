package exemplo_atleta_relac_static;

public class Atleta implements Olimpiadas {
	private String nomeAtleta;
	private double peso;
	private String modalidade;
	public static int totalParticipantes = 0;
	private Pais pais;

	public Atleta(String nomeAtleta, double peso, String modalidade, Pais pais) {
		this.nomeAtleta = nomeAtleta;
		this.peso = peso;
		this.modalidade = modalidade;
		this.pais = pais;
		totalParticipantes++;
	}

	@Override
	public String toString() {
		return "Atleta [nomeAtleta=" + nomeAtleta + ", peso=" + peso + ", modalidade=" + modalidade
				+ ", totalParticipantes=" + totalParticipantes + ", pais=" + pais + "]";
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String verificaSituacao() {
		if (peso > 90) {
			modalidade = "Peso Pesado";
			return "Participará";
		} else if (peso > 60) {
			modalidade = "Peso Médio";
			return "Participará";
		} else {
			return "Não participará";
		}
	}

}
