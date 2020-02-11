package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex1Pessoa {
	private String nome;
	private String sobrenome;
	
	public Ex1Pessoa() {
		
	}

	public Ex1Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String nomeCompleto() {
		return this.getNome()+"  "+this.getSobrenome();
	}
	
	public void imprime () {
		JOptionPane.showMessageDialog(null, "Dados da pessoa\n"
				 +"Nome completo:"+nomeCompleto());
	}
	
}
