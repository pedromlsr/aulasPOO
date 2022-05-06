package exemplo_pessoa_enumComAtributo_enumDentroDaClasse_forEach_ordinal;

public enum Setor {
	RH(10), COMPRAS(20), FATURAMENTO(30), CPD(40), DP(50);

	private int sala;

	private Setor(int sala) {
		this.sala = sala;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

}
