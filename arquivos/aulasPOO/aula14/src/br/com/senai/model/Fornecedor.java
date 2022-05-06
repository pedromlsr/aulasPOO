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
	 * Cadastro �nico das empresas junto a receita federal
	 */
	private String cnpj;
	private String nome;
	private String email;
	/**
	 * Todo vendedor recebe 1% de comiss�o
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

	/** M�todo criado para calcular o pagamento dos fornecedores.
	 * A f�rmula de c�lculo dever� ser acrescida a comiss�o.
	 * @author Pedro
	 * @since 29/04/2022
	 * @param valor recebe o valor de entrada do pagamento
	 * @return retorna o valor do c�lculo do pagamento
	 * @throws IllegalArgumentException caso o valor for negativo, o m�todo dever� lan�ar uma exce��o
	 * 
	 */
	public Double calcularPagamento(double valor) throws IllegalArgumentException {
		return 0.0;
	}
	
	/**
	 * Este m�todo imprime uma listagem de todos os fornecedores.
	 *  @author Pedro
	 *  @since 29/04/2022
	 */
	public void listarFornecedores() {
		
	}
	
}
