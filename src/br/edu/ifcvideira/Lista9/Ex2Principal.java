package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex2Principal {
	public static void main(String[] args) {
		int op;
		Ex2EquipamentoSonoro equip = new Ex2EquipamentoSonoro();
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n"
					+ "1 - Ligar\n"
					+ "2 - Desligar\n"
					+ "3 - Regular volume\n"
					+ "4 - Mono\n"
					+ "5 - Stereo\n"
					+ "6 - Sair"));
			
			if ((op == 6)|| (op > 6)||(op < 0)) {
				break;
			}
			
			else if (op == 1 ) {
				equip.liga();
			}
			else if (op == 2) {
				equip.desliga();
			}
			else if (op == 3 ) {
				equip.setVolume(Integer.parseInt(JOptionPane.showInputDialog("Coloque o volume:")));
			}
			else if (op == 4 ) {
				equip.mono();
			}
			else if (op == 5 ) {
				equip.stereo();
			}
			
			JOptionPane.showMessageDialog(null, "Ligado: "+equip.isLigado()+"\n"
					+ "Volume: "+equip.getVolume()+"\n"
							+ "Stereo: "+equip.isStereo());
		}
	}
}
