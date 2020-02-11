package br.edu.ifcvideira.Lista8;

public class Ex4CamaroteInferior extends Ex4Vip {
	private String localizacao;
	private double valorAdicional;


	public Ex4CamaroteInferior(double valor, double valorAdicional,double valorVip) {
		super(valor,valorVip + valorAdicional);
		
	}


	public String getLocalização() {
		return localizacao;
	}


	public void setLocalização(String localização) {
		this.localizacao = localização;
	}


	public double getValorAdicional() {
		return valorAdicional;
	}


	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}


	


	
	
	
}
