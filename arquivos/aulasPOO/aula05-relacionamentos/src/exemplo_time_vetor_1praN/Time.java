package exemplo_time_vetor_1praN;

import java.util.Arrays;

public class Time {
	private String nomeTime;
	private String tecnico;
	private Atleta[] atletas;
	
	public Time(String nomeTime, String tecnico, Atleta[] atletas) {
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.atletas = atletas;
	}

	@Override
	public String toString() {
		return "Time [nomeTime=" + nomeTime + ", tecnico=" + tecnico + ", atletas=" + Arrays.toString(atletas) + "]";
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}
	
	public void inserirAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}
	
	public void listaTime() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println("Nome do Atleta: " + atletas[i].getNome());
		}
	}
	
}
