package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex3Mamifero extends Ex3Animal{
	private String comida;

	

	public Ex3Mamifero(String comida) {
		super();
		this.comida = comida;
	}

	
	public Ex3Mamifero() {

	}


	public Ex3Mamifero(String animal, double comprimento, String habitat, int patas) {
		super(animal, comprimento, habitat, patas);
		// TODO Auto-generated constructor stub
	}


	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}
	
	public void imprimeAnimal() {
		JOptionPane.showMessageDialog(null, "Dados:\n"
				+ "Animal:"+this.getAnimal()+"\n"
						+ "Comprimento:"+this.getComprimento()+"\n"
								+ "Habitat:"+this.getHabitat()+"\n"
										+ "Numero de patas:"+this.getPatas()+"\n"
												+ "Alimento:"+this.getComida());
	}
}	
