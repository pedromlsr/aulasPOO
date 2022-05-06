package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.serratec.model.Aluno;

public class ExemploStream {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Pedro", "pedro@gmail.com", 28);
		Aluno a2 = new Aluno(2, "Pedro2", "pedro2@gmail.com", 29);
		Aluno a3 = new Aluno(3, "Pedro3", "pedro3@gmail.com", 30);
		Aluno a4 = new Aluno(4, "Pedro4", "pedro4@gmail.com", 31);
		Aluno a5 = new Aluno(5, "Pedro5", "pedro5@gmail.com", 32);
		
		List<String> cores = Arrays.asList("Preto", "Amarelo", "Verde");
		
		Stream<String> streamCores = cores.stream();
		streamCores.forEach(c -> System.out.println(c));
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		Stream<Aluno> streamAlunos = alunos.stream();
//		List<String> nomes = streamAlunos.map(a -> a.getNome().substring(0, 3)).collect(Collectors.toList());
//		System.out.println(nomes);
		
		Set<String> nomes2 = streamAlunos.map(a -> a.getNome().substring(0, 3)).collect(Collectors.toSet());
		System.out.println(nomes2);
		
		
	}

}