package persistence;

import model.Cliente;

public class TestarDao {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		//Cliente cliente = new Cliente(null, "Marta", "234433", "marta@gmail.com");
		//dao.inserir(cliente);
		
		//Cliente cliente = new Cliente(1, "João da Silva", "222222", "joaosilva@gmail.com");
		//dao.atualizar(cliente);
		
		//dao.deletar(1);
		
		//System.out.println(dao.listar());
		
//		for (Cliente cliente : dao.listar()) {
//			System.out.println(cliente);
//		}
		
		System.out.println(dao.buscar(2));
		
	}

}
