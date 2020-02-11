package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex7Eletrodomestico extends Ex7Produto{
	private String voltagem;

	
	public Ex7Eletrodomestico() {
		
		}


	public Ex7Eletrodomestico(int codigo, String descricao, double valor, String voltagem) {
		super(codigo, descricao, valor);
		this.voltagem = voltagem;
	}


	public String getVoltagem() {
		return voltagem;
	}


	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null,"Dados do produto:\n"
				+ "Código"+this.getCodigo()+"\n"
						+ "Descrição"+this.getDescricao()+"\n"
								+ "Valor: R$"+this.getValor()+"\n"
										+ "Voltagem:"+this.getVoltagem());
												
	}
}
