package br.com.senai.exemplos;

import javax.swing.JButton;

public class ExemploAnonima {

	public static void main(String[] args) {
		JButton jButton = new JButton();
//		jButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Teste");
//			}
//		});
		
		jButton.addActionListener(e -> System.out.println("Teste"));
		
	}

}
