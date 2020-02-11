package br.edu.ifcvideira.Lista10;

public class Ex4Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String imprime() {
		return "Nome: "+this.getNome()+"\n"
				+ "Idade: "+this.getIdade()+"\n"
						+ "Sexo: "+this.getSexo()+"\n"
								+ "E-mail: "+this.getEmail()+"\n";
	}
	
}
