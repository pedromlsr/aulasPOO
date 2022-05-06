package org.serratec.persistence;

import java.sql.Connection;

public class TestarConexao {

	// BLoco de inicializa��o est�tico - Roda durante a cria��o da classe, antes de
	// qualquer coisa. As vezes colocam a conex�o aqui.

	static {
		System.out.println("Bloco de inicializa��o est�tico");
	}

	public static void main(String[] args) {
		Connection connection = ConnectionFactorySingleton.getConnection();
		System.out.println(connection);
	}

}
