//1 - Faça uma classe Pessoa, que possui os seguintes atributos: nome e idade. A
//cada aniversário a idade desta pessoa aumenta um ano. Faça um método que
//represente este fato (ex: void fazAniversario()). Em seguida crie a classe main que
//deve criar 3 pessoas com nome e idade inicial, incremente suas idades utilizando
//o método fazAniversário, em seguida imprima o nome e idade destas pessoas.
package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Ex1Principal {
	public static void main(String[] args) {
		String nome;
		int idade;
		int op;
		
		Ex1Pessoas p1 = new Ex1Pessoas();
		nome = String.valueOf(JOptionPane.showInputDialog("Escreva o nome da pessoa 1: "));
		p1.setNome(nome);
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de: "+nome));
		p1.setIdade(idade);
		
		
		nome = String.valueOf(JOptionPane.showInputDialog("Escreva o nome da pessoa 2: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de: "+nome));
		Ex1Pessoas p2 = new Ex1Pessoas(nome, idade);
		
		nome = String.valueOf(JOptionPane.showInputDialog("Escreva o nome da pessoa 3: "));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de: "+nome));
		Ex1Pessoas p3 = new Ex1Pessoas(nome, idade);
		
		for(;;) {
		op = Integer.parseInt(JOptionPane.showInputDialog("Quem fez aniversario?:\n"
				+ "1 - "+p1.getNome()+"\n"
						+ "2 - "+p2.getNome()+"\n"
								+ "3 - "+p3.getNome()+"\n"
										+ "4 - Sair\n"
										+ "5 - Ver idades atualizadas:"));
		
		
			if(op == 1 ) {
				p1.fazAniversario();
			}
			else if(op == 2) {
				p2.fazAniversario();
			}
			else if (op == 3) {
				p3.fazAniversario();
			}
			else if (op == 4) {
				break;
			}
			else if(op == 5) {
				JOptionPane.showMessageDialog(null, "Dados finais:\n"
						+ p1.getNome() +" - "+p1.getIdade()+" anos\n"
								+ p2.getNome()+ " - "+p2.getIdade()+" anos\n"
										+ p3.getNome()+" - "+p3.getIdade()+" anos");
			}
			else if ((op < 1) || (op > 5)){
				JOptionPane.showMessageDialog(null,"Opção inválida");
			}
		}
	}
}
