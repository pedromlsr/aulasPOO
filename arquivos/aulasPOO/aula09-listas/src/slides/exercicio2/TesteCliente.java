package slides.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		List<Cliente> listaClientes = new ArrayList<>();
		
		do {
			System.out.println("Digite o id do cliente: ");
			id = sc.nextInt();
			System.out.println("Digite o nome do cliente: ");
			String nome = sc.next();
			System.out.println("Digite a idade do cliente: ");
			int idade = sc.nextInt();
			System.out.println("Digite o telefone do cliente: ");
			String telefone = sc.next();
			listaClientes.add(new Cliente(id, nome, idade, telefone));
		} while (id >= 0);

		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
		
	}

}
