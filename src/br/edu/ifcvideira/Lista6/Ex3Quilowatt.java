//3 – Antes do racionamento de energia ser decretado, quase ninguém falava em
//quilowatts; mas, agora, todos incorporam essa palavra em seu vocabulário.
//Sabendo-se que 100 quilowatts de energia custam um sétimo do salário mínimo,
//fazer uma classe em java que:
// Tenha dois atributos: um que represente o valor do salário mínimo e
//outro que represente a quantidade de quilowatts gasta por uma
//residência;
// Encapsule esses atributos;
// Crie um método que retorne o valor em reais de cada quilowatt;
// Crie um método que retorne o valor em reais que a residência terá que
//pagar;
// Crie um método que retorne o valor em reais que a residência terá que
//pagar com desconto de 10%;
// Crie um método main que:
// Atribua um valor aos atributos da classe;
//E que mostre na tela a quantidade em reais que a residência
//vai pagar, com e sem o desconto.

package br.edu.ifcvideira.Lista6;

public class Ex3Quilowatt {
	private double salMinimo;
	private double quantQuilowatt;
	
	public double getSalMinimo() {
		return salMinimo;
	}
	public void setSalMinimo(double salMinimo) {
		this.salMinimo = salMinimo;
	}
	public double getQuantQuilowatt() {
		return quantQuilowatt;
	}
	public void setQuantQuilowatt(double quantQuilowatt) {
		this.quantQuilowatt = quantQuilowatt;
	}
	
	public double valorQuilowatt (){
		return (double) this.getSalMinimo() / 100 / 7;
	}
	
	public double totalPagar() {
		return valorQuilowatt() * this.getQuantQuilowatt();
	}
	
	public double totalPagarDesconto() {
		return totalPagar() * 0.9;
	}
}
