package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex7Roupa extends Ex7Produto{
	private String tamanho;
	private String cor;
	
	public Ex7Roupa() {
		
	}
	
	public Ex7Roupa(int codigo, String descricao, double valor,String tamanho, String cor) {
		super(codigo, descricao, valor);
		
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public void imprime() {
		JOptionPane.showMessageDialog(null,"Dados do produto:\n"
				+ "Código"+this.getCodigo()+"\n"
						+ "Descrição"+this.getDescricao()+"\n"
								+ "Valor: R$"+this.getValor()+"\n"
										+ "Tamanho:"+this.getTamanho()+"\n"
												+ "Cor:"+this.getCor());
	}
}
