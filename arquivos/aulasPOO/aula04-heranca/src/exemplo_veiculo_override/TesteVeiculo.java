package exemplo_veiculo_override;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		caminhao.setPlaca("123");
		caminhao.setChassi("1231231231123");
		caminhao.setChassi("1231231231123");
		caminhao.setCor("Azul");
		caminhao.setValorIPVA(5000);
		caminhao.setCargaMaxima(1000);
		caminhao.adicionarValorIPVA(500);
	
		System.out.println("O valor do ipva: " + caminhao.getValorIPVA());
	}

}
