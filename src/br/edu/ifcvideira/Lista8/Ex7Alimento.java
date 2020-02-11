package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex7Alimento extends Ex7Produto {
	private String tipo;
	
	
	public Ex7Alimento() {
		
	}

	public Ex7Alimento(int codigo, String descricao, double valor,String tipo) {
		super(codigo, descricao, valor);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null,"Dados do produto:\n"
				+ "Código"+this.getCodigo()+"\n"
						+ "Descrição"+this.getDescricao()+"\n"
								+ "Valor: R$"+this.getValor()+"\n"
										+ "Tipo:"+this.getTipo());
	}
}
