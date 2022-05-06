package exemplo_plano_override_totalPorClasse;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String nome, String crm, String nomeMedico, String tipoAnestesia) {
		super(nome, crm, nomeMedico);
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return super.toString() + " - Tipo Anestesia: " + tipoAnestesia;
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public double calcularPagamento() {
		valorPago = super.calcularPagamento() + 1000.00;
		return valorPago;
	}

}
