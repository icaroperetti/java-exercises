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

import java.util.Scanner;

public class Ex5PrincipalCandidato {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Ex5Candidato c1 = new Ex5Candidato();
		Ex5Candidato c2 = new Ex5Candidato();
		Ex5Candidato c3 = new Ex5Candidato();
		int op;
		
		System.out.println("Digite o nome do candidato 1");
		c1.setNome(String.valueOf(in.nextLine()));
		
		System.out.println("Digite o nome do candidato 2");
		c2.setNome(String.valueOf(in.nextLine()));
		
		System.out.println("Digite o nome do candidato 3");
		c3.setNome(String.valueOf(in.nextLine()));
		
		for(;;) {
			System.out.println("Para quem foi o voto\n"
					+ "1 - "+c1.getNome()+"\n"
							+ "2 - "+c2.getNome()+"\n"
									+ "3 - " + c3.getNome() + "\n"
											+ "4 - Sair");
			
			op = Integer.parseInt(in.nextLine());
			if (op == 1) {
				c1.recebeVoto();
			}
			else if(op == 2) {
				c2.recebeVoto();
			}
			else if (op == 3) {
				c3.recebeVoto();
			}
			else {
				break;
			}
		}
		System.out.println("Resultado da eleição:\n"
				+ "O candidato 1 obteve:"+c1.getVotos()+"\n"
						+ "O candidato 2 obteve:"+c2.getVotos()+"\n"
								+ "O candidato 3 obteve:"+c3.getVotos());
		in.close();
	}
}
