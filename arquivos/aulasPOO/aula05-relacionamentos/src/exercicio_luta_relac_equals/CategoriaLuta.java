package exercicio_luta_relac_equals;

public class CategoriaLuta {
	private int codigo;
	private String nomeCategoria;
	
	public CategoriaLuta(int codigo, String nomeCategoria) {
		this.codigo = codigo;
		this.nomeCategoria = nomeCategoria;
	}
	
	@Override
	public String toString() {
		return "CategoriaLuta [codigo=" + codigo + ", nomeCategoria=" + nomeCategoria + "]";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

}
