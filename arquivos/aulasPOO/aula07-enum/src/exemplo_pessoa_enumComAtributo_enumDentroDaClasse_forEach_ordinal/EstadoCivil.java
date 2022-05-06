package exemplo_pessoa_enumComAtributo_enumDentroDaClasse_forEach_ordinal;

public enum EstadoCivil {
	CASADO('C'), SOLTEIRO('S'), VIUVO('V'), DIVORCIADO('D');

	private char valor;

	private EstadoCivil(char valor) {
		this.valor = valor;
	}

	public char getValor() {
		return valor;
	}

	public void setValor(char valor) {
		this.valor = valor;
	}

}
