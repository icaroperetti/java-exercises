//4 - Crie uma classe chamada Ingresso que possui um valor em reais.
//a. crie uma classe Normal, que herda Ingresso e possui um método que imprime:
//"Ingresso Normal" e o seu valor. 
//b. Crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um
//método que retorne o valor do ingresso VIP e o tipo do ingresso (com o adicional
//incluído).
//c. crie uma classe CamaroteInferior (que possui a localização do ingresso e
//métodos para cadastrar e imprimir esta localização, além de ser mais cara que a
//VIP) e uma classe CamaroteSuperior, que é mais cara (possui valor adicional às
//demais). Ambas as classes herdam a classe VIP.
//Obs: Todas permitem a impressão dos valores e dos tipos dos ingressos.


package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex4Principal {
	public static void main(String[] args) {
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de ingresso?\n"
					+ "1 - Normal  \n"
					+ "2 - Vip \n"
					+ "3 - Camarote Inferior\n"
					+ "4 - Camarote Superior\n"
					+ "5- Sair"));
			
			if(op == 5) {
				break;
			}
			else if ( (op > 5) || (op < 1)) {
				System.out.println("Opção inválida!");
				break;
			}
			else {
				if (op == 1 ) {
					Ex4Ingresso ingresso = new Ex4Normal(10);
					JOptionPane.showMessageDialog(null, ingresso.imprime("Normal"));
				}
				else if (op == 2) {
					Ex4Ingresso ingresso = new Ex4Vip(10, 20);
					JOptionPane.showMessageDialog(null, ingresso.imprime("Vip")+"\n");
				}
				else if (op == 3) {
					Ex4Ingresso  ingresso = new Ex4CamaroteInferior(10, 10,20);
					JOptionPane.showMessageDialog(null, ingresso.imprime("Camarote Inferior custa:"));
				}
				else if(op == 4) {
					Ex4Ingresso ingresso = new Ex4CamaroteSuperior(10, 20, 20);
					JOptionPane.showMessageDialog(null, ingresso.imprime("Camarote superior custa:"));
				}
			}
		
		}
	}
}
