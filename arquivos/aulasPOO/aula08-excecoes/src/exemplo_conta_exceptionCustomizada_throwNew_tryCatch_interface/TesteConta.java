package exemplo_conta_exceptionCustomizada_throwNew_tryCatch_interface;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente("123", "Pedro", 1000.00);
		
		try {
			cc.deposito(1500.00);
			cc.saque(2000.00);
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
	}

}
