package exercicio_oficina_getDayOfWeek_getMonthValue_enumComAtributo_heranca_interface_relac;

public enum TipoServico {
	OLEO(100), LAVAGEM(50), REVISAO(200);

	private double valorPorServico;

	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}

	public void setValorPorServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

}
