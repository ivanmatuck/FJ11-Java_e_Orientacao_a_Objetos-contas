package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {
	
	public String getTipo() {
		return "Conta Poupança";
	}
	
	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}
}
