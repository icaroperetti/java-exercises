package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex2Principal {
	public static void main(String[] args) {
		Ex2Funcionario fu;
		String nome;
		String turno;
		double salario;
		String matricula;
		int op;
		
		for(;;) {
			op  = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionario:\n"
					+ "1 - Gerente\n"
					+ "2 - Assistente técnico\n"
					+ "3 - Assistente Administrativo\n"
					+ "4 - Finalizar"));
			
			if (op == 4) {
				break;
			}
			else if ((op < 1) || (op > 4)) {
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
			else {
				nome = String.valueOf(JOptionPane.showInputDialog("Qual nome:"));
				salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salario?"));
				
				if (op == 1) {
					fu = new Ex2Gerente(nome, salario, "Gerente");
					fu.imprime();
				}
				else if (op == 2) {
					fu = new Ex2AssistTecnico(nome, salario, "Assistente técnico");
					fu.imprime();
				}
				else if (op == 3) {
					matricula = String.valueOf(JOptionPane.showInputDialog("Qual a matricula:"));
					turno = String.valueOf(JOptionPane.showInputDialog("Qual o turno: Diurno ou Noturno?:"));
					
					fu = new Ex2AssisAdministrativo(nome, salario, "Assistente administrativo"
							, matricula, turno);
					
					fu.imprime();
				}
			}
			
		}
	}
}
