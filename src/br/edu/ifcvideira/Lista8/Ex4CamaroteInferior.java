package br.edu.ifcvideira.Lista8;

public class Ex4CamaroteInferior extends Ex4Vip {
	private String localizacao;
	private double valorAdicional;


	public Ex4CamaroteInferior(double valor, double valorAdicional,double valorVip) {
		super(valor,valorVip + valorAdicional);
		
	}


	public String getLocaliza��o() {
		return localizacao;
	}


	public void setLocaliza��o(String localiza��o) {
		this.localizacao = localiza��o;
	}


	public double getValorAdicional() {
		return valorAdicional;
	}


	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}


	


	
	
	
}
