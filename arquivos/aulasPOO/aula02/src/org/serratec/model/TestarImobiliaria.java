package org.serratec.model;

public class TestarImobiliaria {
	public static void main(String[] args) {
		Imobiliaria i1 = new Imobiliaria();
		i1.local = "Centro";
		i1.tipoImovel = "Apto";
		i1.valorImovel = 55800;
		
		i1.reajustarImovel();
		System.out.println("Valor reajustado �: " + i1.valorImovel);
	
		Imobiliaria i2;
		i2 = new Imobiliaria();
		i2.local = "Quitandinha";
		i2.tipoImovel = "Casa";
		i2.valorImovel = 190900;
		
	
	}
}
