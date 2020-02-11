//14 (V�deo Aula 6) - Em um campeonato de futebol, cada time tem uma lista oficial
//de 23 jogadores. Cada time prepara uma lista contendo o peso e a idade de cada
//um dos seus jogadores. Os 40 times que participam do torneio enviam essas listas
//para o CPD da confedera��o. Fa�a um Programa que apresente as seguintes
//informa��es:
// peso m�dio e a idade m�dia de cada um dos times;
// peso m�dio e a idade m�dia de todos os participantes

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jogadores = 0;
		int times = 0;
		int idade=0;
		double peso=0;
		double mediaIdadeTimes=0;
		double mediaPesoTimes=0;
		double mediaIdadeTot=0;
		double mediaPesoTot=0;
		
		for(times = 0; times < 40;times++) {
			System.out.println("Dados do time:"+(times+1));
			for (jogadores=0;jogadores < 23; jogadores++) {
				System.out.println("Digite a idade do jogador "+(jogadores+1));
				idade = Integer.parseInt(in.nextLine());
				
				System.out.println("Digite o peso do jogador:");
				peso = Double.parseDouble(in.nextLine());
				
				mediaIdadeTimes += idade;
				mediaPesoTimes += peso;
			}
			System.out.println("A m�dia de idade do time: "+(times+1)+" � "+(mediaIdadeTimes / jogadores));
			System.out.println("A m�dia de peso do time: "+(times+1)+" � "+(mediaPesoTimes / jogadores));
			
			mediaIdadeTot += mediaIdadeTimes;
			mediaPesoTot += mediaPesoTimes;
			
			mediaIdadeTimes = 0;
			mediaPesoTimes = 0;
		}
		System.out.println("A m�dia de idade total �: " +(mediaIdadeTot/(jogadores*times)));
		System.out.println("A m�dia de peso total �: "+(mediaPesoTot/(jogadores*times)));
		in.close();
	}
}
