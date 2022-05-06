package org.serratec.model;

public class Funcionario {
	private Integer codigo;
	private String nome;
	private String setor;
	private Double salario;
	
	public Funcionario() {
	}

	public Funcionario(Integer codigo, String nome, String setor, Double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.setor = setor;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", setor=" + setor + ", salario=" + salario + "]";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getSetor() {
		return setor;
	}

	public Double getSalario() {
		return salario;
	}
	
}
