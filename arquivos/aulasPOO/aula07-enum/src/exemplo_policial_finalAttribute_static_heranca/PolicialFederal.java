package exemplo_policial_finalAttribute_static_heranca;

public class PolicialFederal extends Policial {
	private String matricula;

	public PolicialFederal(String cpf, String nome, double salario, String matricula, String lotacao) {
		super(cpf, nome, salario, lotacao);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "PolicialFederal [matricula=" + matricula + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// public void alterarLotacao() {
	// this.lotacao = "Manaus";
	// }

}
