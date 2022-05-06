package exemplo_pessoa_enumComAtributo_enumDentroDaClasse_forEach_ordinal;

import exemplo_pessoa_enumComAtributo_enumDentroDaClasse_forEach_ordinal.Pessoa.Escolaridade;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", "pedro@gmail.com", Setor.COMPRAS, EstadoCivil.SOLTEIRO, Escolaridade.GRADUACAO);
		System.out.println(p1);
		System.out.println(p1.getSetor().ordinal());
		// System.out.println(p1.getSetor().valueOf("CONTABILIDADE"));

		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil.getValor() + " - " + estadoCivil.ordinal());
		}

	}

}
