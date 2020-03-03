package br.com.caelum.contas.modelo;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(3320.00);
		System.out.println(cc.getValorImposto());
	
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
		
	}

}