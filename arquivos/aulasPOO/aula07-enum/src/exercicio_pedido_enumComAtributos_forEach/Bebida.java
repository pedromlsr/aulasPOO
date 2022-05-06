package exercicio_pedido_enumComAtributos_forEach;

public enum Bebida {
	REFRIGERANTE("refrigerante", 3.00), SUCO("Suco", 6.50), AGUA("Agua Mineral", 3.00);

	private String tipoBebida;
	private double valor;

	private Bebida(String tipoBebida, double valor) {
		this.tipoBebida = tipoBebida;
		this.valor = valor;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
