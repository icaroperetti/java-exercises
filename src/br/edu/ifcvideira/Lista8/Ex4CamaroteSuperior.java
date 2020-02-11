package br.edu.ifcvideira.Lista8;

public class Ex4CamaroteSuperior extends Ex4Vip {
	private String localizacao;
	private double valorAdicional;

	public Ex4CamaroteSuperior(double valor, double adicional, double valorAdicional) {
		super(valor, adicional + valorAdicional);
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getAdicionalCamarote() {
		return valorAdicional;
	}

	public void setValorAdicional(double adicionalCamarote, double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
}
