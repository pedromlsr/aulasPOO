package org.serratec.model;

import java.time.LocalDate;

public class Produto { //implements Comparable<Produto> {
	private Integer codigo;
	private String nome;
	private Integer quantidadeEstoque;
	private LocalDate dataCadastro;

	public Produto(Integer codigo, String nome, Integer quantidadeEstoque, LocalDate dataCadastro) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidadeEstoque = quantidadeEstoque;
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidadeEstoque=" + quantidadeEstoque
				+ ", dataCadastro=" + dataCadastro + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

//	@Override
//	public int compareTo(Produto o) {
//		return nome.compareTo(o.getNome());
//	}

}
