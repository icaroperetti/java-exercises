//3 - Defina uma classe Professor com os dados: nome do professor, nome do
//departamento, n�mero de registro e data de admiss�o. Crie uma classe main que
//permita manipular os dados dos professores.

package br.edu.ifcvideira.Lista7;

public class Ex3Professor {
	private String nome;
	private String departamento;
	private String registro;
	private String dataAdmiss�o;

	public Ex3Professor() {
		
	}
	
	public Ex3Professor(String nome, String departamento, String registro, String dataAdmiss�o) {
		this.nome = nome;
		this.departamento = departamento;
		this.registro = registro;
		this.dataAdmiss�o = dataAdmiss�o;
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

	public String getDataAdmiss�o() {
		return dataAdmiss�o;
	}

	public void setDataAdmiss�o(String dataAdmiss�o) {
		this.dataAdmiss�o = dataAdmiss�o;
	}
	
	
	
}
