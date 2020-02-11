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

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex4Principal {
	public static void main(String[] args) {
		int op;
		DecimalFormat df = new DecimalFormat("0.00");
		Ex4Computador co = new Ex4Computador();
		
		//Processador
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um processador:\n"
				+ "1 - 3,36Ghz - R$250,00\n"
				+ "2 - 3,56Ghz - R$310,00\n"
				+ "3 - 3,9Ghz - R$620,00\n"));
		
		if (op == 1) {
			co.setProcessador(250);
			co.setConfiguracao("Processador 3,3Ghz: R$"+df.format(co.getProcessador())+"\n");
		}
		else if (op == 2){
			co.setProcessador(310);
			co.setConfiguracao("Processador 3,5Ghz R$"+df.format(co.getProcessador())+"\n");
		}
		else {
			co.setProcessador(620);
			co.setConfiguracao("Processador 3,9Ghz R$"+df.format(co.getProcessador())+"\n");
		}
		
	op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma memória:\n"
			+ "1 - 2Gb - R$300,00\n"
			+ "2 - 4Gb - R$600,00\n"
			+ "3 - 8Gb - R$1200,00\n"
			+ "4 - 16Gb - R$2400,00"));
	
	if (op == 1) {
		co.setMemoria(300);
		co.setConfiguracao(co.getConfiguracao()+"Memoria 2Gb: R$"+co.getMemoria()+"\n");
	}
	else if (op == 2){
		co.setMemoria(600);
		co.setConfiguracao(co.getConfiguracao()+"Memoria 4Gb: R$"+co.getMemoria()+"\n");
	}
	else if (op == 3){
		co.setMemoria(1200);
		co.setConfiguracao(co.getConfiguracao()+"Memoria 8Gb: R$"+co.getMemoria()+"\n");
	}
	else {
		co.setMemoria(2400);
		co.setConfiguracao(co.getConfiguracao()+"Memoria 16Gb: R$"+co.getMemoria()+"\n");
	}
	
	//HD
	op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um HD\n"
			+ "1 - 500Gb - R$400,00\n"
			+ "2 - 1Tb - R$600,00\n"
			+ "3 - 2Tb - R$800,00"));
	
	
		if (op == 1) {
			co.setHd(400);
			co.setConfiguracao(co.getConfiguracao()+"HD 2Tb: R$"+co.getHd()+"\n");
		}
		else if (op == 2){
			co.setHd(600);
			co.setConfiguracao(co.getConfiguracao()+"HD 2Tb: R$"+co.getHd()+"\n");
		}
		else {
			co.setHd(800);
			co.setConfiguracao(co.getConfiguracao()+"HD 2Tb: R$"+co.getHd()+"\n");
		}
		
		//Monitor
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o monitor:\n"
				+ "1 - 17\" - R$390,00\n"
				+ "2 - 19\" - R$520,00"));
		
		if (op == 1 ) {
			co.setMonitor(390);
			co.setConfiguracao(co.getConfiguracao()+"Monitor 17\": R$"+co.getMonitor()+"\n");
		}
		else if (op == 2) {
			co.setMonitor(520);
			co.setConfiguracao(co.getConfiguracao()+"Monitor 17\": R$"+co.getMonitor()+"\n");
		}
		//metodo impressão
		co.imprime();
	}		
}
