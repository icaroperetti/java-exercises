package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex7Principal {
	public static void main(String[] args) {
		Ex7Produto pr;
		int codigo = 0;
		String descricao = "";
		double valor = 0;
		String voltagem = "";
		String tamanho = "";
		String cor = "";
		String tipo = "";
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual o produto?\n"
					+ "1 - Alimento\n"
					+ "2 - Eletrodomestico\n"
					+ "3 - Roupa\n"
					+ "4 - Sair"));
			
			if(op == 4) {
				break;
			}
			else if ((op < 1) || (op > 4)) {
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
			else {
				codigo = Integer.parseInt(JOptionPane.showInputDialog("Qual o código?:"));
				descricao = String.valueOf(JOptionPane.showInputDialog("Descrição do produto:"));
				valor = Double.parseDouble(JOptionPane.showInputDialog("Qual p valor?:"));
			}
			
			
			if(op == 1) {
				tipo = String.valueOf(JOptionPane.showInputDialog("Qual o tipo de alimento"));
				
				pr = new Ex7Alimento(codigo, descricao, valor, tipo);
				pr.imprime();
			}
			else if(op == 2) {
				voltagem = String.valueOf(JOptionPane.showInputDialog("Qual a voltagem?:"));
				
				pr = new Ex7Eletrodomestico(codigo, descricao, valor, voltagem);
				pr.imprime();
			}
			else if(op == 3) {
				tamanho = String.valueOf(JOptionPane.showInputDialog("Qual o tamanho?"));
				cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor?"));
				
				pr = new Ex7Roupa(codigo, descricao, valor, tamanho, cor);
				pr.imprime();
			}
		}
		
	}
}
