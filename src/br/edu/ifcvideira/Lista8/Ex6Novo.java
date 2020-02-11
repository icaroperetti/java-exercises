package br.edu.ifcvideira.Lista8;

public class Ex6Novo extends Ex6Imovel{
	private double adicional;

	public Ex6Novo(String endereco, double preco, double adicional) {
		super(endereco, preco + adicional);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
}
