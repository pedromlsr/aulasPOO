package org.serratec.exemplos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.serratec.model.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Arroz", 100, LocalDate.of(2022, 04, 1));
		Produto p2 = new Produto(2, "Farinha", 30, LocalDate.of(2022, 04, 2));
		Produto p3 = new Produto(3, "Macarr�o", 20, LocalDate.of(2022, 04, 3));
		Produto p4 = new Produto(4, "Feij�o", 120, LocalDate.of(2022, 04, 4));
		Produto p5 = new Produto(5, "Arroz integral", 120, LocalDate.of(2022, 04, 4));
		
		List<Produto> produtos  = Arrays.asList(p1, p2, p3, p4, p5);
		
		//Forma tradicional
//		Collections.sort(produtos);
//		System.out.println(produtos);
//		produtos.stream().sorted().forEach(p -> System.out.println(p));

		
		//Comparator<Produto> compareQuantidade = (a, b) -> a.getQuantidadeEstoque().compareTo(b.getQuantidadeEstoque());
//		Comparator<Produto> compareQuantidade = (a, b) -> b.getQuantidadeEstoque().compareTo(a.getQuantidadeEstoque());
//		Collections.sort(produtos, compareQuantidade);
//		produtos.forEach(p -> System.out.println(p));
//		
//		System.out.println("---------------");
//		
//		Comparator<Produto> compareNome = (a, b) -> b.getNome().compareTo(a.getNome());
//		Collections.sort(produtos, compareNome);
//		produtos.forEach(p -> System.out.println(p));
//		
//		System.out.println("-------- Outra forma (ordendando pelo nome do produto ----------");
//		
//		produtos.sort((a, b) -> a.getNome().compareTo(b.getNome()));
//		produtos.forEach(p -> System.out.println(p));
//		
		System.out.println("-------- Filtro por nome --------");
		produtos.stream().distinct().filter(p -> p.getNome().contains("Arroz")).forEach(p -> System.out.println(p));
		
	}
}
