//7 – Crie uma classe produto com os atributos, “código”, “descrição” e “valor”, com
//um método de impressão desses produtos:
//a. Crie a classe alimento que herda produto com o atributo “tipo” e um método
//polimórfico ao método de impressão da classe mãe;
//b. Crie a classe eletrodoméstico que herda produto e possui o atributo “voltagem”
//e um método polimórfico ao método de impressão da classe mãe;
//c. Crie a classe roupa que herda produto e possui os atributos “tamanho” e “cor” e
//um método polimórfico ao método de impressão da classe mãe;


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
				+ "Código"+this.getCodigo()+"\n"
						+ "Descrição"+this.getDescricao()+"\n"
								+ "Valor: R$"+this.getValor());
	}
}
