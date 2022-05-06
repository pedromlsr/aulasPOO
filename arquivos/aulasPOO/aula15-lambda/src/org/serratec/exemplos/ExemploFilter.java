package org.serratec.exemplos;

import java.util.Arrays;
import java.util.List;

import org.serratec.model.Aluno;

public class ExemploFilter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Pedro", "pedro@gmail.com", 28);
		Aluno a2 = new Aluno(2, "Pedro2", "pedro2@gmail.com", 29);
		Aluno a3 = new Aluno(3, "Pedro3", "pedro3@gmail.com", 30);
		Aluno a4 = new Aluno(4, "Pedro4", "pedro4@gmail.com", 31);
		Aluno a5 = new Aluno(5, "Pedro5", "pedro5@gmail.com", 32);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		
		System.out.println("---- Filtro por idade ----");
		alunos.stream().filter(a -> a.getIdade() > 30).forEach(a -> System.out.println(a));
		
		System.out.println("---- Filtro por nome ----");
		System.out.println("---- Come�a com algum caracter ----");
		alunos.stream().filter(a -> a.getNome().startsWith("P")).forEach(a -> System.out.println(a));
		System.out.println("---- Termina com algum caracter ----");
		alunos.stream().filter(a -> a.getNome().endsWith("o")).forEach(a -> System.out.println(a));
		System.out.println("---- Cont�m alguma sequ�ncia de caracter ----");
		alunos.stream().filter(a -> a.getNome().contains("ro")).forEach(a -> System.out.println(a));
		
		System.out.println("---- Ignorar o primeiro elemento ----");
		alunos.stream().skip(1).forEach(a -> System.out.println(a));
		
		System.out.println("---- Limitar o resultado ----");
		alunos.stream().limit(1).forEach(a -> System.out.println(a));
		
	}

}