package br.com.caelum.contas.modelo;

import br.com.caelum.contas.main.SaldoInsuficienteExcpeption;

public class ContaCorrente extends Conta implements Tributavel {

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		} 
		if (this.saldo < valor) {
			throw new SaldoInsuficienteExcpeption(valor);
		}
		this.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.03;
	}
}