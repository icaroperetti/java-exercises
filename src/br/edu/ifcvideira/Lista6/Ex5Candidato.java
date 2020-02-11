//5 - Defina uma classe para representar um candidato a uma elei��o, com atributos
//para armazenar o nome do candidato e o n�mero de votos, ambos privados.
//Defina um m�todo de acesso para cada atributo e um m�todo para incrementar o
//n�mero de votos do candidato.
//Crie um m�todo main que:
//Instancie 3 objetos para candidatos distintos;
//Possua um menu para recebimento dos votos para cada um dos
//candidatos;
//Finalize a elei��o mostrando seu resultado.
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
