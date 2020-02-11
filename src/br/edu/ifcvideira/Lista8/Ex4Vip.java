package br.edu.ifcvideira.Lista8;

public class Ex4Vip extends Ex4Ingresso {
	private double valorVip;

	public Ex4Vip(double valor, double valorVip) {
		super(valor + valorVip);
		this.valorVip = valorVip;
	}

	public double getValorVip() {
		return valorVip;
	}
	
	
	
	
}
