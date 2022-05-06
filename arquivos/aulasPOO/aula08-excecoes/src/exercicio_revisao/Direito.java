package exercicio_revisao;

public final class Direito extends Faculdade implements Oab, Eventos {
	private int tempoDuracao;
	
	public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nome, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String toString() {
		return "Direito [tempoDuracao=" + tempoDuracao + "]";
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public boolean realizarProva() {
		return false;
	}

	@Override
	public void conteudoEventos() {
	}
	
	@Override
	public String matrizCurricular() {
		return null;
	}

	@Override
	public void fazerMatricula() {
	}
	
	public String programacao() {
		return null;
	}
	
}
