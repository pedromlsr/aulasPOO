package exercicio_maratona_toString_polimorf;

public class Maratona {
	protected String nome, sexo;
	protected int idade;
	protected double altura;

	public Maratona(String nome, String sexo, int idade, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " - Sexo: " + sexo + " - Idade: " + idade + " - Altura: " + altura;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public String verificaSituacao() {
		if (idade > 18 || altura >= 1.80) {
			return "Participará da competição";
		} else {
			return "Não participará da competição";
		}
	}
}
