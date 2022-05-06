package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.serratec.model.Aluno;

public class Exemplo1 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Pedro", "pedro@gmail.com", 28);
		Aluno a2 = new Aluno(2, "Pedro2", "pedro2@gmail.com", 29);
		Aluno a3 = new Aluno(3, "Pedro3", "pedro3@gmail.com", 30);
		Aluno a4 = new Aluno(4, "Pedro4", "pedro4@gmail.com", 31);
		Aluno a5 = new Aluno(5, "Pedro5", "pedro5@gmail.com", 32);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		//alunos.forEach(a -> System.out.println(a));
		
//		ExibirDados exibirDados = new ExibirDados();
//		alunos.forEach(exibirDados);
		
		//Classe an�nima
//		Consumer<Aluno> alunoConsumer = new Consumer<Aluno>() {
//
//			@Override
//			public void accept(Aluno t) {
//				System.out.println(t);
//			}
//			
//		};
//		
//		alunos.forEach(alunoConsumer);
		
		alunos.forEach(a -> {
			System.out.println(a.getNome());
			System.out.println(a.getIdade());
		});
		
		System.out.println("Imprimindo com Method Reference!");
		alunos.forEach(System.out::println);
		
	}

}
