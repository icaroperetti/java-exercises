//2 – Defina uma classe em Java, que:
//Crie dois atributos, n1 e n2;
//Encapsule os atributos;
//Crie um método que troque os valores entre os atributos n1 e n2;
//Crie um método main que:
//Atribua valor aos atributos n1 e n2;
//Chame o método que altera os valores;
//Mostra os valores dos atributos;
package br.edu.ifcvideira.Lista6;

public class Ex2Trocavalores {
	private int numero1;
	private int numero2;
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public void troca() {
		int aux;
		aux = this.getNumero1();
		this.setNumero1(getNumero2());
		this.setNumero2(aux);
	}
}
