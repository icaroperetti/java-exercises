package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex4Principal {
	public static void main(String[] args) {
		Ex4CarroPasseio veic = new Ex4CarroPasseio();
		Ex4Caminhao cam = new Ex4Caminhao();
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Carro de passeio\n"
					+ "2 - Caminhão\n"
					+ "3 - Cancelar "));
			
			if((op == 3)|| (op > 3)||(op <= 0 )) {
				break;
			}
			else if (op == 1 ) {
				veic.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor?")));
				veic.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Qual o peso?")));
				veic.setCor(String.valueOf(JOptionPane.showInputDialog("Qual a cor?")));
				veic.setModelo(String.valueOf(JOptionPane.showInputDialog("Qual o modelo?")));
				veic.setVelMax(Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade máxima?")));
				JOptionPane.showMessageDialog(null,veic.imprime());
			}
			else if ( op == 2) {
				cam.setCargaMax(Integer.parseInt(JOptionPane.showInputDialog("Qual a carga máxima(toneladas)?")));
				cam.setAlturaMax(Double.parseDouble(JOptionPane.showInputDialog("Qual a altura máxima?")));
				cam.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Qual o comprimento?")));
				cam.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Qual o preço?")));
				cam.setVelMax(Integer.parseInt(JOptionPane.showInputDialog("Qual a velocidade máxima?")));
				JOptionPane.showMessageDialog(null, cam.imprime());
			}
		}
	}
}
