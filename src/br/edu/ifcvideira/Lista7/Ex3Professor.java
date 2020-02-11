//3 - Defina uma classe Professor com os dados: nome do professor, nome do
//departamento, número de registro e data de admissão. Crie uma classe main que
//permita manipular os dados dos professores.

package br.edu.ifcvideira.Lista7;

public class Ex3Professor {
	private String nome;
	private String departamento;
	private String registro;
	private String dataAdmissão;

	public Ex3Professor() {
		
	}
	
	public Ex3Professor(String nome, String departamento, String registro, String dataAdmissão) {
		this.nome = nome;
		this.departamento = departamento;
		this.registro = registro;
		this.dataAdmissão = dataAdmissão;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getDataAdmissão() {
		return dataAdmissão;
	}

	public void setDataAdmissão(String dataAdmissão) {
		this.dataAdmissão = dataAdmissão;
	}
	
	
	
}
