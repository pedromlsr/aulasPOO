package exemplo_atleta_relac_static;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("Portugal");
		Atleta a1 = new Atleta("Pedro", 100.00, null, p1);
		Atleta a2 = new  Atleta("Fabio", 80.00, null, p2);
		Atleta a3 = new Atleta("Francarlo", 55.00, null, p1);
		
		System.out.println("O atleta " + a1.getNomeAtleta() + ": " + a1.verificaSituacao());
		System.out.println("O atleta " + a2.getNomeAtleta() + ": " + a2.verificaSituacao());
		System.out.println("O atleta " + a3.getNomeAtleta() + ": " + a3.verificaSituacao());
		
		System.out.println("Total de participantes: " + Atleta.totalParticipantes);
	}

}
