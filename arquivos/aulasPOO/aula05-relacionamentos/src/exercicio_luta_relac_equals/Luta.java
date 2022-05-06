package exercicio_luta_relac_equals;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean confirmado;
	
	public Luta(Lutador desafiante, Lutador desafiado, int rounds, boolean confirmado) {
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.rounds = rounds;
		this.confirmado = confirmado;
	}
	
	@Override
	public String toString() {
		return "Luta [desafiante=" + desafiante + ", desafiado=" + desafiado + ", rounds=" + rounds + ", confirmado="
				+ confirmado + "]";
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
	
	public boolean confirmarLuta() {
		if ((desafiante != desafiado) && (desafiante.getCategoriaLuta().equals(desafiado.getCategoriaLuta()))) {
			confirmado = true;
			return confirmado;
		}
		return confirmado;
	}
	
}
