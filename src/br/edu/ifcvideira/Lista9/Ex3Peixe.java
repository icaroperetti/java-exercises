package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex3Peixe extends Ex3Animal{
	private String caracteristicas;
	
	
	public Ex3Peixe() {
		
	}

	public Ex3Peixe(String caracteristicas) {
	
		this.caracteristicas = caracteristicas;
	}

	public Ex3Peixe(String animal, double comprimento, String habitat, int patas,String caracteristicas) {
		super(animal, comprimento, habitat, patas);
		this.caracteristicas = caracteristicas;
		
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}



	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public void imprimeAnimal() {
		JOptionPane.showMessageDialog(null, "Dados:\n"
				+ "Animal:"+this.getAnimal()+"\n"
						+ "Comprimento:"+this.getComprimento()+"\n"
								+ "Habitat:"+this.getHabitat()+"\n"
										+ "Numero de patas:"+this.getPatas()+"\n"
												+ "Caracteristicas:"+this.getCaracteristicas());
	}
}
