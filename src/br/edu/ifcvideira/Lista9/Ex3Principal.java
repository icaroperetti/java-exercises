package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex3Principal {
	public static void main(String[] args) {
		Ex3Animal animal = new Ex3Animal();
		Ex3Peixe peixe = new Ex3Peixe();
		Ex3Mamifero mamifero = new Ex3Mamifero();
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1 - Dom�stico\n"
					+ "2 - Marinho\n"
					+ "3 - Terrestre(Selvagem)\n"
					+ "4 - Cancelar"));
			
			if((op == 4)|| (op > 4)||(op <= 0)) {
				break;
			}
			
			else if (op == 1) {
				animal.setAnimal(String.valueOf(JOptionPane.showInputDialog("Qual o animal?")));
				animal.setHabitat(String.valueOf(JOptionPane.showInputDialog("Qual o seu habitat?")));
				animal.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Qual o seu comprimento?")));
				animal.setPatas(Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero de patas?")));
				animal.imprimeAnimal();
			}
			else if (op == 2) {
				peixe.setAnimal(String.valueOf(JOptionPane.showInputDialog("Qual � o peixe?")));
				peixe.setHabitat(String.valueOf(JOptionPane.showInputDialog("Qual o seu habitat?")));
				peixe.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Qual o seu comprimento?")));
				peixe.setPatas(Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero de patas?")));
				peixe.setCaracteristicas(String.valueOf(JOptionPane.showInputDialog("Quais as caracteristicas?")));
				peixe.imprimeAnimal();
			}
			else if (op == 3 ) {
				mamifero.setAnimal(String.valueOf(JOptionPane.showInputDialog("Qual � o animal?")));
				mamifero.setHabitat(String.valueOf(JOptionPane.showInputDialog("Qual o seu habitat?")));
				mamifero.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Qual o seu comprimento?")));
				mamifero.setPatas(Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero de patas?")));
				mamifero.setComida(String.valueOf(JOptionPane.showInputDialog("Qual a alimenta��o?")));
				mamifero.imprimeAnimal();
			}
		}
	}
}
