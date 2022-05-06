package org.serratec.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactorySingleton {
	private static String urlConexao = "jdbc:postgresql://localhost:5432/testebd";
	private static String usuario = "postgres";
	private static String senha = "vp25a8ck";
	private static Connection connection;
	
	//Padrão Singleton - Tenho uma única conexão
	
	public static Connection newConnection() {
		try {
			connection = DriverManager.getConnection(urlConexao, usuario, senha);
			System.out.println("Conectado com sucesso.");
		} catch (SQLException e) {
			System.out.println("Não foi possível conectar.");
		}
		return connection;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
		}
		return connection;
	}
	
}
