package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex1Principal {
	public static void main(String[] args) {
		Ex1Gerente ge = new Ex1Gerente();
		Ex1AssistTecnico at = new Ex1AssistTecnico();
		Ex1AssisAdmnistrativo aa = new Ex1AssisAdmnistrativo();
		String nome;
		double salario;
		String matricula;
		String turno;
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionário:\n"
					+ "1 - Gerente\n"
					+ "2 - Assistente Técnico\n"
					+ "3 - Assistente Administrativo\n"
					+ "4 - Finalizar"));
			
			if(op == 1) {
				nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome?"));
				ge.setNome(nome);
				
				salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?"));
				ge.setSalario(salario);
				ge.setCargo("Gerente");
				
				JOptionPane.showMessageDialog(null,"Dados do funcionario:\n"
						+ "Cargo:"+ge.getCargo()+"\n"
								+ "Nome:"+ge.getNome()+"\n"
										+ "Salario: R$"+ge.calculaSalario());
			}
			else if (op == 2) {
				nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome?"));
				at.setNome(nome);
				
				salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?"));
				at.setSalario(salario);
				at.setCargo("Assistente técnico");
				
				JOptionPane.showMessageDialog(null,"Dados do funcionario:\n"
						+ "Cargo:"+at.getCargo()+"\n"
								+ "Nome:"+at.getNome()+"\n"
										+ "Salario: R$"+at.calculaSalario());
			}
			else if (op == 3) {
				nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome?"));
				aa.setNome(nome);
				
				salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?"));
				aa.setSalario(salario);
				aa.setCargo("Assistente Administrativo");
				
				matricula = String.valueOf(JOptionPane.showInputDialog("Qual a matricula:"));
				aa.setMatricula(matricula);
				
				turno = String.valueOf(JOptionPane.showInputDialog("Qual o turno: Diurno ou Noturno?:"));
				aa.setTurno(turno);
				

				JOptionPane.showMessageDialog(null,"Dados do funcionario:\n"
						+ "Cargo:"+aa.getCargo()+"\n"
								+ "Nome:"+aa.getNome()+"\n"
										+ "Matricula:"+aa.getMatricula()+"\n"
											+ "Turno:"+aa.getTurno()+"\n"
												+ "Salario: R$"+aa.calculaSalario());
			}
			else if (op == 4) {
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}
		}
	}
}
