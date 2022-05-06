package exemplo_medico_polimorf;

public class TesteMedico {

	public static void main(String[] args) {
		Medico anestesista = new Anestesista("123", "Maria", 220, 1000);
		Medico medico = new Medico("2343", "Ana", 1000);
		
		
		System.out.println(anestesista.toString());
		System.out.println(medico);

	}

}
