package exemplo_time_vetor_1praN;

public class TesteTime {

	public static void main(String[] args) {
		Atleta a1 = new Atleta("Diego Alves", 30, "Goleiro");
		Atleta a2 = new Atleta("Isla", 35, "Lateral");
		Atleta a3 = new Atleta("Bruno Henrique", 28, "Atacante");
		Time t1 = new Time("Flamengo", "Paulo Souza", new Atleta[3]);
		
		t1.inserirAtletas(a1);
		t1.inserirAtletas(a2);
		t1.inserirAtletas(a3);
		
		System.out.println("Time: " + t1.getNomeTime());
		t1.listaTime();
	}

}
