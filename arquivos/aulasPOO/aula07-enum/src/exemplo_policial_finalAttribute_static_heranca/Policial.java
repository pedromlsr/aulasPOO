package exemplo_policial_finalAttribute_static_heranca;

public class Policial {
	protected String cpf;
	protected String nome;
	protected double salario;
	protected final String lotacao;
	protected static int totalPoliciais;

	public Policial(String cpf, String nome, double salario, String lotacao) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.lotacao = lotacao;
		totalPoliciais++;
	}

	@Override
	public String toString() {
		return "Policial [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + ", lotacao=" + lotacao + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getLotacao() {
		return lotacao;
	}

	public static int getTotalPoliciais() {
		return totalPoliciais;
	}

	public static void setTotalPoliciais(int totalPoliciais) {
		Policial.totalPoliciais = totalPoliciais;
	}

	// N�o pode ser sobrescrito (override)
	public final String mostrarInformacoes() {
		return nome + " - " + cpf + " - " + salario;
	}

}
