package org.serratec.model;

public class TestarAluno {

	public static void main(String[] args) {
		//Criação de uma instância de um objeto
		Aluno a1 = new Aluno();
		a1.codigoAluno = 10;
		a1.nome = "Roni";
		a1.telefone = "2232-9089";
		//a1.email = "roni@gmail.com";
		
		Aluno a2 = new Aluno();
		a2.codigoAluno = 11;
		a2.nome = "Maria";
		
		System.out.println(a1.nome);
		System.out.println(a1.email);
		System.out.println(a2.nome);
		
		Aluno a3 = a1;
		System.out.println(a3.nome);
	}

}
