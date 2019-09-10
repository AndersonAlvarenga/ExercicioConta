package usuario;

public class Conta {
	private static int numeroConta;
	private String nomerUsuario;
	private double saldo;

	public Conta(int numeroConta, String nomeUsuario) {
		Conta.numeroConta = numeroConta;
		this.nomerUsuario = nomeUsuario;
	}

	public Conta(int numeroConta, String nomeUsuario, double saldo) {
		Conta.numeroConta = numeroConta;
		this.nomerUsuario = nomeUsuario;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeUsuario() {
		return nomerUsuario;
	}

	public void setNomerUsuario(String nomeUsuario) {
		this.nomerUsuario = nomeUsuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public void saque(double saque) {
		this.saldo -= saque + 5.00;
	}

	public String toString() {
	return "Conta: "
			+ numeroConta
			+"\nNome:  "
			+nomerUsuario
			+"\nSaldo: "
			+String.format("%.2f", saldo);
	}
}
