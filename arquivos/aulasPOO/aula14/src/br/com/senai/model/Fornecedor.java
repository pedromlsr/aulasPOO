package br.com.senai.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author pedro
 * @version 1.0
 * @since criada em 29 de abril de 2022
 *
 */

public class Fornecedor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Cadastro único das empresas junto a receita federal
	 */
	private String cnpj;
	private String nome;
	private String email;
	/**
	 * Todo vendedor recebe 1% de comissão
	 */
	private Double comissao;

	/**
	 * Construtor com todos atributos de fornecedor
	 * @param cnpj
	 * cnpj
	 * @param nome
	 * nome
	 * @param email
	 * email
	 * @param comissao
	 * comissao
	 */
	
	public Fornecedor(String cnpj, String nome, String email, Double comissao) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + ", comissao=" + comissao + "]";
	}

	/**
	 * 
	 * @return
	 * Retorna o cnpj do cliente
	 */
	
	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getComissao() {
		return comissao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}

	/** Método criado para calcular o pagamento dos fornecedores.
	 * A fórmula de cálculo deverá ser acrescida a comissão.
	 * @author Pedro
	 * @since 29/04/2022
	 * @param valor recebe o valor de entrada do pagamento
	 * @return retorna o valor do cálculo do pagamento
	 * @throws IllegalArgumentException caso o valor for negativo, o método deverá lançar uma exceção
	 * 
	 */
	public Double calcularPagamento(double valor) throws IllegalArgumentException {
		return 0.0;
	}
	
	/**
	 * Este método imprime uma listagem de todos os fornecedores.
	 *  @author Pedro
	 *  @since 29/04/2022
	 */
	public void listarFornecedores() {
		
	}
	
}
