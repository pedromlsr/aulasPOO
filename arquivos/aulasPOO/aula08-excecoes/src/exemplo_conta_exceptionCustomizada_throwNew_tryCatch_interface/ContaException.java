package exemplo_conta_exceptionCustomizada_throwNew_tryCatch_interface;

public class ContaException extends RuntimeException {

	public ContaException(String message) {
		super(message);
	}

}
