package interfaces;

import java.util.List;

import model.Produto;

public interface ProdutoImplements extends CrudGenerico<Produto> {
	
	public List<Produto> buscaPorNome(String nome);
}
