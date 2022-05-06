package exemplo_pessoa_heranca_totalPorClasse_abstract;

public class TotalTributos {
	private double total;
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void totalizarTributos(Tributos tributos) {
		total += tributos.calculaICMS();
		total += tributos.calculaImpostoDeRenda();
		
		//System.out.println(tributos.toString() + "\n" + "ICMS: " + tributos.calculaICMS());
		//System.out.println(tributos.toString() + "\n" + "IR: " + tributos.calculaImpostoDeRenda());
		
	}
	
}
