package br.edu.ifcvideira.Lista8;

public class Ex6Velho extends Ex6Imovel{
	private double desconto;

	public Ex6Velho(String endereco, double preco,double desconto) {
		super(endereco, preco - desconto);
		this.desconto = desconto;
		
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
}
