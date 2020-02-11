//18 - Leia uma matriz 100 x 10 que se refere respostas de 10 questões de múltipla
//escolha, referentes a 100 alunos. Leia também um vetor de 10 posições contendo
//o gabarito d e respostas que podem ser a, b, c ou d. Seu programa deverá
//comparar as respostas de cada candidato com o gabarito e emitir um vetor
//Resultado, contendo a pontuação correspondente.

package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio18 {
	public static void main(String[] args) {
		String respostas[][] = new String [100][10];
		String gabarito[] = new String [10];
		int pontuacao[] = new int [100];
		int i;
		int j;
		int x;
		
		Random r = new Random();
		
		//preenchimento respostas
		for (i = 0; i <100;i++) { //alunos
			for (j=0;j < 10;j++) { //respostas
				x = r.nextInt(4);
				
				if (x == 0) {
				   respostas[i][j] = "a";
				}
				else if ( x == 1) {
					respostas[i][j] = "b";
				}
				else if ( x == 2) {
					respostas[i][j] = "c";
				}
				else {
					respostas[i][j] = "d";
				}
			}
		}
		//preenchimento gabarito
		for (i = 0; i < 10;i++) {
			x = r.nextInt(4);
			
			if (x == 0) {
				gabarito[i] = "a";
			}
			else if ( x == 1) {
				gabarito[i] = "b";
			}
			else if ( x == 2) {
				gabarito[i] = "c";
			}
			else {
				gabarito[i] = "d";
			}
		}
		
		//verificação respostas
		for ( i =0; i < 100;i++) {//alunos
			System.out.print("Aluno "+(i+1)+" - ");
			for(j = 0;j < 10;j++) {//respostas
				if (respostas[i][j].equals(gabarito[j])) {
					pontuacao[i]++;
				}
				System.out.print(respostas[i][j]+"  ");
			}
			System.out.println(" - "+pontuacao[i]);
		}
		//Gabarito
		System.out.println("Gabarito - ");
		for (i=0; i < 10;i++) {
			System.out.println(gabarito[i]+"  ");
		}
	}
}

