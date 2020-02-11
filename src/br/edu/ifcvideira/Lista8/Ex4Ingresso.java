package br.edu.ifcvideira.Lista8;

public class Ex4Ingresso {
	private double valor;

	public Ex4Ingresso() {
		
	}

	public Ex4Ingresso(double valor) {
		super();
		this.valor = valor;
	}
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String imprime(String tipo) {
		return "Ingresso " + tipo + " R$" + this.getValor();
	}
	
}
