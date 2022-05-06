package exemplo_veiculo_scanner_equals;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteVeiculoJOP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resposta = 's';
		do {
			Veiculo v1 = new Veiculo();
			v1.placa = JOptionPane.showInputDialog("Digite a placa do ve�culo:");
			v1.tipoCombustivel = JOptionPane.showInputDialog("Digite o tipo de combust�vel:");
			System.out.println("Digite o valor do ve�culo: ");
			v1.valor = sc.nextDouble();
			JOptionPane.showMessageDialog(null, "O valor do IPVA 2022 �: " + v1.calcularIPVA());
			System.out.println("Deseja continuar (S/s)");
			resposta = sc.next().charAt(0);
		} while (resposta == 'S' || resposta == 's');	
		sc.close();
	}
	
}