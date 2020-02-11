//1 - Escreva as seguintes classes:
//a) Uma classe Pessoa atributos nome (tipo String) e sobrenome (tipo String). Cada um
//desses atributos deve ter métodos para lê-los e alterá-los (getters e setters). A classe Pessoa
//ainda deve ter um método chamado getNomeCompleto que não possui parâmetros de
//entrada e que retorna a concatenação do atributo nome com o atributo sobrenome. Além
//disso, a classe deve possuir um construtor sem parâmetros e um outro construtor que
//recebe como parâmetros o nome e o sobrenome da pessoa e altera respectivamente os
//atributos nome e sobrenome.
//b) Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os
//atributos matricula (tipo int) e salario (tipo double), com seus respectivos métodos para
//leitura e alteração (getters e setters). O salário de um funcionário jamais poderá ser
//negativo. Todo funcionario recebe seu salario em duas parcelas, sendo 60% na primeira
//parcela e 40% na segunda parcela. Assim, escreva os métodos getSalarioPrimeiraParcela
//que retorna o valor da primeira parcela do salário (60%) e getSalarioSegundaParcela que
//retorna o valor da segunda parcela do salário (40%).
//c) Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu salário
//em uma única parcela. Assim, deve-se sobrescrever os métodos
//getSalarioPrimeiraParcela e getSalarioSegundaParcela. O método
//getSalarioPrimeiraParcela da classe Professor deve retornar o valor integral do salário do
//professor e o método getSalarioSegundaParcela do professor deve retornar o valor zero.


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
					JOptionPane.showMessageDialog(null, "Opção Inválida");
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
	