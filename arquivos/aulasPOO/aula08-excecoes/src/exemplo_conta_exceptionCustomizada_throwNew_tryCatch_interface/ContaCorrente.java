package exemplo_conta_exceptionCustomizada_throwNew_tryCatch_interface;

public class ContaCorrente implements Conta {
	private String numeroConta;
	private String titular;
	private double saldo;

	public ContaCorrente(String numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Número: " + numeroConta + " - Titular: " + titular + " - Saldo: " + saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public boolean saque(double valor) {
		if (saldo < valor) {
			throw new ContaException("Saldo insuficiente!");
		} else {
			return true;
		}
	}

	@Override
	public boolean deposito(double valor) {
		if (valor > 1000) {
			throw new ContaException("Depósito acima do permitido!");
		}
		saldo += valor;
		return true;
	}

}
