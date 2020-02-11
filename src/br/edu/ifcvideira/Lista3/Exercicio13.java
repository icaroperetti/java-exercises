//13 (Vídeo Aula 5) - Faça um algoritmo que leia o código do jogador (1 ou 2) que
//ganhou o ponto em uma partida de tênis de mesa, e responda quem ganha a
//partida. A partida chega ao final se um dos jogadores chega a 11 pontos e a
//diferença de pontos entre os jogadores é maior ou igual a dois. Caso contrário,
//ganha aquele que, com mais de 11 pontos, consiga colocar uma vantagem de dois
//pontos sobre o adversário. 

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jog1=0;
		int jog2=0;
		int ponto=0;
		
		do {
			System.out.println("Quem marcou o ponto\n"
					+ "1 - Jogador 1\n"
					+ "2 - Jogador 2");
			ponto = Integer.parseInt(in.nextLine());
			
			if (ponto == 1 ) {
				jog1++;
			}
			else if (ponto == 2){
				jog2++;
			}
			else {
				System.out.println("Ponto iválido!");
			}
		}while (((jog1 < 11) || (jog1 < (jog2+2))) && ((jog2 < 11) || (jog2 < (jog1+2))));
		System.out.println("Placar final:\n"
				+ "Jogador 1 :"+jog1+"\n"
						+ "Jogador 2:"+jog2);
		if (jog1 > jog2) {
			System.out.println("Jogador 1 venceu!");
		}
		else {
			System.out.println("Jogador 2 venceu!");
		}
		in.close();
	}
}
