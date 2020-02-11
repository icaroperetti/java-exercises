//4 - Escreva a classe Veiculo contendo Peso em quilos (int), VelocMax em Km/h (int) e
//Preco em R$ (float). Inclua um construtor sem argumentos que inicialize os dados com os
//valores recebidos como argumento. Crie os getters e setters da classe; Crie um método para
//calcular o valor do veículo com 10% de desconto;
//b) Crie uma classe CarroPasseio que herda Veiculo como base. Inclua Cor (string) e
//Modelo (string). Inclua um construtor sem argumentos que inicialize os dados com zeros e
//uma que inicialize os dados com os valores recebidos como argumentos. Crie os getters e
//setters da classe; Crie um método para calcular o valor do Carro que sobrescreva o método
//da classe veículo aplicando 15% de desconto;
//c) Crie uma classe Caminhao que herda Veiculo. Inclua Toneladas (carga máxima),
//AlturaMax (int) e Comprimento (int). Inclua um construtor sem argumentos que inicialize
//os dados com zeros e um que inicialize com os valores recebidos como argumento. Crie os
//getters e setters da classe; Crie um método para calcular o valor do Caminhão que
//sobrescreva o método da classe veículo aplicando 20% de desconto;

package br.edu.ifcvideira.Lista9;

public class Ex4Veiculo {
	private int peso;
	private int velMax;
	private double preco;
	
	public Ex4Veiculo() {
		this.peso = 0;
		this.velMax = 0;
		this.preco = 0;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double calculaValor() {
		return this.getPreco() * 0.9;
	}
	
	public String imprime() {
		return "Peso: "+this.getPeso()+"\n"
				+ "Velocidade máxima: "+this.getVelMax()+"\n"
						+ "Preço: "+calculaValor();
	}
	
}
