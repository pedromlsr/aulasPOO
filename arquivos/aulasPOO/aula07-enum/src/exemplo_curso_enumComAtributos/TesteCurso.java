package exemplo_curso_enumComAtributos;

public class TesteCurso {

	public static void main(String[] args) {
		Turma t1 = new Turma("Java WEB", PeriodoCurso.NOTURNO);

		System.out.println("Curso: " + t1.getCurso());
		System.out.println(t1.getPeriodoCurso().getDiasDaSemana());
		System.out.println(t1.getPeriodoCurso().getValor());
		System.out.println(t1.getPeriodoCurso().getCargaHoraria());
		
		System.out.println(t1.getPeriodoCurso());
		
		System.out.println(t1);
	}

}
