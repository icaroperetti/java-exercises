package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex2AssisAdministrativo extends Ex2Funcionario{
	private String matricula;
	private String turno;
	
	public Ex2AssisAdministrativo() {
		
	}
	
	public Ex2AssisAdministrativo(String nome, double salario, String cargo,
			String matricula, String turno) {
		super(nome, salario, cargo);
		this.matricula = matricula;
		this.turno = turno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public double calculaSalario() {
		if (this.getTurno().equals("Noturno")) {
			return this.getSalario() * 1.3;
		}
		else {
			return super.calculaSalario();
		}
	}
		
		public void imprime() {
			JOptionPane.showMessageDialog(null,"Dados do funcionario:\n"
					+ "Cargo:"+this.getCargo()+"\n"
							+ "Nome:"+this.getNome()+"\n"
									+ "Matricula:"+this.getMatricula()+"\n"
										+ "Turno:"+this.getTurno()+"\n"
											+ "Salario: R$"+calculaSalario());
		}
	}
