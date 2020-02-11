//4 - Escreva uma classe chamada Computador, que encapsule atributos que
//definam a configuração da máquina (tipo de processador, memória RAM, tamanho
//do disco rígido e tamanho do monitor). Esta classe deve ter um método
//calculaPreco, que calcule o preço do computador como sendo a soma do custo de
//seus componentes:
//Gabinete + Placa-mãe + Fonte: R$900.
//Opções de processadores: 3,3Ghz a R$250, 3,5Ghz a R$310, 3,9Ghz a R$620
//Opções de memória: 2, 4, 8 ou 16Gb, cada 1Gb custa R$150.
//Opções de disco rígido: 500 Gb a R$400, 1 Tb a R$600, 2 Tb a R$800.
//Opções de monitor: 17 polegadas a R$390, 19 polegadas a R$520.
package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Ex4Computador {
	private double processador;
	private double memoria;
	private double hd;
	private double monitor;
	private String configuracao;
	
	//construtor vazio
	public Ex4Computador(){
		
	}

	//construtor com todos os campos
	public Ex4Computador(double processador, double memoria, double hd, 
			double monitor, String configuracao) {
		this.processador = processador;
		this.memoria = memoria;
		this.hd = hd;
		this.monitor = monitor;
		this.configuracao = configuracao;
	}

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMonitor() {
		return monitor;
	}

	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	
	public double calculaPreco() {
		return 900 + this.getProcessador() +this.getMemoria() + this.getHd() +
				this.getMonitor();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Configuração do computador:\n"
				+ "Gabinete + Placa-mãe + Fonte: R$900.\n"
				+ this.getConfiguracao()+"\n"
						+ "Valor total R$"+calculaPreco());
	}
	
}
