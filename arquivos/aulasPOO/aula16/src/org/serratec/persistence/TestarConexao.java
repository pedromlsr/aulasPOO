package org.serratec.persistence;

import java.sql.Connection;

public class TestarConexao {

	// BLoco de inicialização estático - Roda durante a criação da classe, antes de
	// qualquer coisa. As vezes colocam a conexão aqui.

	static {
		System.out.println("Bloco de inicialização estático");
	}

	public static void main(String[] args) {
		Connection connection = ConnectionFactorySingleton.getConnection();
		System.out.println(connection);
	}

}
