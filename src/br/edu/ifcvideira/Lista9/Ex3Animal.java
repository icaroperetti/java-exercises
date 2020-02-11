//3 – Desenvolva 3 classes: Animal, Peixe e Mamífero, onde Peixe e Mamífero herdam da
//classe Animal, porém possuem suas características.

package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex3Animal {
	private String animal;
	private double comprimento;
	private String habitat;
	private int patas;
	
	public Ex3Animal() {
		
	}
	
	public Ex3Animal(String animal, double comprimento, String habitat, int patas) {
		
		this.animal = animal;
		this.comprimento = comprimento;
		this.habitat = habitat;
		this.patas = patas;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public void imprimeAnimal() {
		JOptionPane.showMessageDialog(null, "Dados\n"
				+ "Animal"+this.getAnimal()+"\n"
						+ "Comprimento:"+this.getComprimento()+"\n"
								+ "Habitat:"+this.getHabitat()+"\n"
										+ "Numero de patas:"+this.getPatas());
				
	}
	
}
