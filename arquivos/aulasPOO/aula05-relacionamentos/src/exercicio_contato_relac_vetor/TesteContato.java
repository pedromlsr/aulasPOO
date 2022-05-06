package exercicio_contato_relac_vetor;

public class TesteContato {

	public static void main(String[] args) {
		Estado estado = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade = new Cidade("Petrópolis", estado);
		Endereco endereco = new Endereco("Rua A", "São Sebastião", "1111111", cidade);
		Telefone telefone1 = new Telefone("22334455");
		Telefone telefone2 = new Telefone("22667788");
		Contato contato = new Contato("Pedro", new Telefone[2], endereco);

		contato.inserirTelefones(telefone1);
		contato.inserirTelefones(telefone2);
		System.out.println("Nome: " + contato.getNome());
		System.out.println(endereco.getRua() + ", " + endereco.getBairro() + ", " + endereco.getCep() + ", "
				+ endereco.getCidade().getNomeCidade() + ", " + cidade.getEstado().getNomeEstado());
		contato.mostrarTelefones();
	}

}
