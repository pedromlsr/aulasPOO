package exercicio_revisao;

public final class EnsionoMedio extends ColegioAplicacao {
	private int numeroAlunos;
	
	public EnsionoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
		super(nome, nomeCoordenador);
		this.numeroAlunos = numeroAlunos;
	}
	
	public int getNumeroAlunos() {
		return numeroAlunos;
	}

	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}

	@Override
	public void reuniaoDePais() {
	}

	@Override
	public void fazerMatricula() {
	}

}
