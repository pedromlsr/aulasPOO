package org.serratec.persistence;

import java.util.Optional;

import org.serratec.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		FuncionarioDao dao = new FuncionarioDao();
		
		Optional<Funcionario> funcionario = dao.buscar("Roni");
		
		/*if(funcionario.isPresent()) {
			System.out.println("Resultado:" + funcionario.get().getNome());
		}*/
		
		funcionario.ifPresent(f -> f.getNome());
		
//		funcionario.orElse(new Funcionario(1, "Ana", "RH", 1500.00));
	}
}
