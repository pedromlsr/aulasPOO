package org.serratec.persistence;

import java.sql.Connection;
import java.util.Optional;

import org.serratec.model.Funcionario;

public class FuncionarioDao {
	
	
//	Funcionario f = new Funcionario(1, "Carlos", "CPD", 2800.00);
	
	public FuncionarioDao() {
		Connection connection = ConnectionFactorySingleton.getConnection();
	}

	public Optional<Funcionario> buscar(String nome) {
		return Optional.ofNullable(null);
	}
	
}
