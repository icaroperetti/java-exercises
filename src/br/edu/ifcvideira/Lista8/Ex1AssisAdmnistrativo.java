package br.edu.ifcvideira.Lista8;

public class Ex1AssisAdmnistrativo extends Ex1Funcionario {
	private String matricula;
	private String turno;
	
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
			return this.getSalario();
		}
	}
	
}
