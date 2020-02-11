//1 - Escreva as seguintes classes:
//a) Uma classe Pessoa atributos nome (tipo String) e sobrenome (tipo String). Cada um
//desses atributos deve ter m�todos para l�-los e alter�-los (getters e setters). A classe Pessoa
//ainda deve ter um m�todo chamado getNomeCompleto que n�o possui par�metros de
//entrada e que retorna a concatena��o do atributo nome com o atributo sobrenome. Al�m
//disso, a classe deve possuir um construtor sem par�metros e um outro construtor que
//recebe como par�metros o nome e o sobrenome da pessoa e altera respectivamente os
//atributos nome e sobrenome.
//b) Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os
//atributos matricula (tipo int) e salario (tipo double), com seus respectivos m�todos para
//leitura e altera��o (getters e setters). O sal�rio de um funcion�rio jamais poder� ser
//negativo. Todo funcionario recebe seu salario em duas parcelas, sendo 60% na primeira
//parcela e 40% na segunda parcela. Assim, escreva os m�todos getSalarioPrimeiraParcela
//que retorna o valor da primeira parcela do sal�rio (60%) e getSalarioSegundaParcela que
//retorna o valor da segunda parcela do sal�rio (40%).
//c) Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu sal�rio
//em uma �nica parcela. Assim, deve-se sobrescrever os m�todos
//getSalarioPrimeiraParcela e getSalarioSegundaParcela. O m�todo
//getSalarioPrimeiraParcela da classe Professor deve retornar o valor integral do sal�rio do
//professor e o m�todo getSalarioSegundaParcela do professor deve retornar o valor zero.


package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Ex1Principal {
	public static void main(String[] args) {
		Ex1Pessoa pe;
		String nome = "";
		String sobrenome;
		int matricula;
		double salario;
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual cadastro deseja fazer\n"
					+ "1 - Pessoa\n"
					+ "2 - Funcionario\n"
					+ "3 - Professor\n"
					+ "4 - sair"));
			
				if(op == 4) {
					break;
				}
				
				else if ((op < 1)||(op > 4 )) {
					JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
					break;
				}
				else {
					nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome:"));
					sobrenome = String.valueOf(JOptionPane.showInputDialog("Qual sobrenome:"));
					
				
				if (op == 1) {
					pe = new Ex1Pessoa(nome, sobrenome);
					pe.imprime();
					}
				else {
					matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual a matricula"));
					salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salario"));
				
					if(op == 2) {
						pe = new Ex1Funcionario(nome, sobrenome, matricula, salario);
						pe.imprime();
					}
					else {
						pe = new Ex1Professor(nome, sobrenome, matricula, salario);
						pe.imprime();
					}
				}
			}
		}
	}
}
	