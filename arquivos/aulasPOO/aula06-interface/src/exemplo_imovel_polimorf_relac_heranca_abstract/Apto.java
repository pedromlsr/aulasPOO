package exemplo_imovel_polimorf_relac_heranca_abstract;

public class Apto extends Imovel {
	private int andar;
	private int numero;

	public Apto(String local, double valor, int andar, int numero) {
		super(local, valor);
		this.andar = andar;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + " - Andar: " + andar + " - Número: " + numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
