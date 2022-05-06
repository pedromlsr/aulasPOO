package exemplo_imovel_polimorf_relac_heranca_abstract;

public abstract class Imovel {
	private String local;
	private double valor;

	public Imovel(String local, double valor) {
		this.local = local;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Local: " + local + " - Valor: " + valor;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double calcularITBI() {
		return valor * 0.035;
	}

}
