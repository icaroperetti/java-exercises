//6 - Crie uma classe chamada de Aluno, esta classe tem os seguintes atributos:
//matricula, nome, e-mail, curso, fone, cel e endereço. Esta classe deve conter os
//getters e setters, além do construtor padrão (vazio), mais um construtor que
//receba todos os atributos como parâmetros. Crie uma classe main, na qual o
//usuário possa cadastrar um aluno pelas duas maneiras.

package br.edu.ifcvideira.Lista7;

public class Ex6Aluno {
	private int matricula;
	private String nome;
	private String email;
	private String curso;
	private int fone;
	private int cel;
	private String endereco;
	
	public Ex6Aluno() {
		
	}

	public Ex6Aluno(int matricula, String nome, String email, String curso, int fone, int cel, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
		this.fone = fone;
		this.cel = cel;
		this.endereco = endereco;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public int getCel() {
		return cel;
	}

	public void setCel(int cel) {
		this.cel = cel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}



