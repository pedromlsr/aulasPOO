package exemplo_imovel_1pra1;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("11111111", "Pedro", "abc@gmail.com");
		Pessoa p2 = new Pessoa("33333333", "Rafael", "xyz@gmail.com");
		Imovel i1 = new Imovel("Casa", 100000.00, p1);
		//Imovel i2 = new Imovel("Apto", 80000.00, new Pessoa("2222222", "João", "def@gmail.com"));
		
		System.out.println("Imóvel: " + i1.getTipo() + " - Valor: " + i1.getValor() + " - Dono: " + i1.getDono().getNome());

	}

}
