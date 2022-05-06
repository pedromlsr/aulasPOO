package exercicio_pg24;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Livro l1 = new Livro("A", "Pedro", 50);
		Livro l2 = new Livro("B", "Larissa", 80);
		Livro l3 = new Livro("C", "Fabiano", 40);
		Biblioteca biblio = new Biblioteca("Francarlo");
		
		biblio.adicionar(l1);
		biblio.adicionar(l2);
		biblio.adicionar(l3);
		biblio.listar();
		System.out.println("Quantidade de livros na faixa de pre�o: " + biblio.pesquisarFaixaDePreco(50, 100));
		System.out.println("Valor total dos livros: " + biblio.calcularTotalLivros());

	}

}
