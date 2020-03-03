package br.com.caelum.contas.main;

public class SaldoInsuficienteExcpeption extends RuntimeException {

	public SaldoInsuficienteExcpeption(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}
	
	public SaldoInsuficienteExcpeption() {
	}
	
}