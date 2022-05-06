package slides.exercicio1;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;

	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double calcularMedia() {
		if (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
			throw new AlunoException("Nota deve ser de 0 a 10.");
		}
		return (nota1 + nota2) / 2;
	}
	
}
