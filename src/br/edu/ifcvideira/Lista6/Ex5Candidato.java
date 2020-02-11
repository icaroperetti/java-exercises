//5 - Defina uma classe para representar um candidato a uma eleição, com atributos
//para armazenar o nome do candidato e o número de votos, ambos privados.
//Defina um método de acesso para cada atributo e um método para incrementar o
//número de votos do candidato.
//Crie um método main que:
//Instancie 3 objetos para candidatos distintos;
//Possua um menu para recebimento dos votos para cada um dos
//candidatos;
//Finalize a eleição mostrando seu resultado.
package br.edu.ifcvideira.Lista6;

public class Ex5Candidato {
	private String nome;
	private int votos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	public void recebeVoto() {
		this.setVotos(this.getVotos() + 1);
	}
	
}
