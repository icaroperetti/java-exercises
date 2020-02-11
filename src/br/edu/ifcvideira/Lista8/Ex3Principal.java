package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex3Principal {
	public static void main(String[] args) {
		Ex3Gato gt = new Ex3Gato();
		Ex3Animal cachorro = new Ex3Cachorro("Astolfo", "Vira lata");
		Ex3Animal gato = new Ex3Gato("Patuleia", "Persa");
		
		
		JOptionPane.showMessageDialog(null,
				"Cachorro: " + cachorro.getNome() + "\n" + "Raça: " + cachorro.getRaca() + "\n"
								+ cachorro.late() + "\n"
									+ "Gato: " + gato.getNome() + "\n"
										+ "Raça: "+ gato.getRaca()  + "\n"
											+gt.mia());
	}
	
}
