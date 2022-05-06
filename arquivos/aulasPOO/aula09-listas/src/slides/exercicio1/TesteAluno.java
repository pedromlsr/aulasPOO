package slides.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Pedro", -3, 6);
		Aluno a2 = new Aluno("Fábio", 9, 10);
		Aluno a3 = new Aluno("Francarlo", 6, 10);
		
		try {
			System.out.println(a1.getNome() + " teve média " + a1.calcularMedia());
		} catch (AlunoException e) {
			System.out.println(e.getMessage());
		}
		
		List<Aluno> listaAlunos = new ArrayList();
		listaAlunos.add(a1);
		listaAlunos.add(a2);
		listaAlunos.add(a3);
		
		for (Aluno aluno : listaAlunos) {
			System.out.println(aluno);
		}
		
	}

}
