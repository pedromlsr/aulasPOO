package exemplo_medico_polimorf;

public class Anestesista extends Medico {
	private double valorAnestesia;

	public Anestesista(String crm, String nome, double valorConsulta, double valorAnestesia) {
		super(crm, nome, valorConsulta);
		this.valorAnestesia = valorAnestesia;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + "Valor da Anestesia: " + valorAnestesia;
	}
	
	public double getValorAnestesia() {
		return valorAnestesia;
	}
	
}
