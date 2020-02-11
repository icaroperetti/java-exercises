//7 � Crie uma classe produto com os atributos, �c�digo�, �descri��o� e �valor�, com
//um m�todo de impress�o desses produtos:
//a. Crie a classe alimento que herda produto com o atributo �tipo� e um m�todo
//polim�rfico ao m�todo de impress�o da classe m�e;
//b. Crie a classe eletrodom�stico que herda produto e possui o atributo �voltagem�
//e um m�todo polim�rfico ao m�todo de impress�o da classe m�e;
//c. Crie a classe roupa que herda produto e possui os atributos �tamanho� e �cor� e
//um m�todo polim�rfico ao m�todo de impress�o da classe m�e;


package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex7Produto {
	private int codigo;
	private String descricao;
	private double valor;
	
	public Ex7Produto() {
		
	}
	
	public Ex7Produto(int codigo, String descricao, double valor) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null,"Dados do produto:\n"
				+ "C�digo"+this.getCodigo()+"\n"
						+ "Descri��o"+this.getDescricao()+"\n"
								+ "Valor: R$"+this.getValor());
	}
}
