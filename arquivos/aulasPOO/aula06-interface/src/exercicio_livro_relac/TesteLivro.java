package exercicio_livro_relac;

public class TesteLivro {

	public static void main(String[] args) {
		Livro l1 = new Livro("Fabio Coelho", "A Arte do Atleticismo", 45.00);
		Livro l2 = new Livro("Francarlo Lispector", "O Sopro Ardente", 70.00);
		Operacao o1 = new Operacao("Empr�stimo", 0, l1);
		Operacao o2 = new Operacao("Venda", 0, l2);
		
		l1.reajuste(l1.getValor() * 1.06);
		o1.venderLivro();
		o2.emprestarLivro();
		
		System.out.println("Tipo: " + o1.getTipo() + " - Valor: " + o1.getValorOperacao() + " - Autor: " + o1.getLivro().getAutor() + " - Titulo: " + o1.getLivro().getTitulo());
		System.out.println("Tipo: " + o2.getTipo() + " - Valor: " + o2.getValorOperacao() + " - Autor: " + o2.getLivro().getAutor() + " - Titulo: " + o2.getLivro().getTitulo());
		
	}

}