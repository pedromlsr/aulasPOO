package exemplo1_produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto(1, "TV 42", 2500.0);
		Produto produto2 = new Produto(2, "Celular", 1000.0);
		
		produto2.setValor(1100);
	}

}
