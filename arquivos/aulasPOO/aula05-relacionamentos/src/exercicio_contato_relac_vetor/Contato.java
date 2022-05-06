package exercicio_contato_relac_vetor;

import java.util.Arrays;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;

	public Contato(String nome, Telefone[] telefones, Endereco endereco) {
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefones=" + Arrays.toString(telefones) + ", endereco=" + endereco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void inserirTelefones(Telefone numero) {
		for (int i = 0; i < telefones.length; i++) {
			if (telefones[i] == null) {
				telefones[i] = numero;
				break;
			}
		}
	}

	public void mostrarTelefones() {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Telefone: " + telefones[i].getNumero());
		}
	}

}
