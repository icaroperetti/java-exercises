//2 - Faça uma classe Porta com os seguintes atributos: estado (boolean –
//aberta/fechada), cor, dimensaoX, dimensaoY e dimensaoZ. Esta classe deve
//representar os comportamentos: abrir a porta, fechar a porta, pintar e também
//verificar se a porta está aberta (atributo estado da porta estaAberta()) . Em
//seguida em outra classe (main), crie 1 porta, que possa ser aberta ou fechada e
//pintada de diversas cores, alterar suas dimensões e usar o método estaAberta
//para verificar se está aberta

package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Ex2Principal {
	public static void main(String[] args) {
		Ex2Porta po = new Ex2Porta();
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção:\n"
					+ "1 - Abrir a porta\n"
					+ "2 - Fechar a porta\n"
					+ "3 - Pintar a porta\n"
					+ "4 - Alterar dimensões\n"
					+ "5 - Verificar se a porta esta aberta\n"
					+ "6 - Sair"));
			
			
			if(op == 1 ) {
				po.abrir();
			}
			else if(op == 2) {
				po.fechar();
			}
			else if (op == 3) {
				po.pintar(String.valueOf(JOptionPane.showInputDialog(null, "Qual cor deseja utilizar?")));
			}
			else if (op == 4 ) {
				po.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão X:")));
				po.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão Y:")));
				po.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão Z")));
			}
			else if (op == 5) {
				JOptionPane.showMessageDialog(null, po.estaAberta());
			}
			else if (op == 6) {
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Opção inexistente!");
			}
		}
		
	}
}
