//2 � Fa�a um programa em JAVA que leia um vetor de 12 posi��es e em seguida
//ler tamb�m dois valores X e Y quaisquer correspondentes a duas posi��es no
//vetor. Ao final seu programa dever� escrever a soma dos valores encontrados nas
//respectivas posi��es X e Y.
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vet[] = new int [12];
		int i=0;
		int x;
		int y;
		int soma;
		
		for(i = 0; i < 12;i++) {
			System.out.println("Digite o valor para a posi��o "+(i+1));
			vet[i] = Integer.parseInt(in.nextLine());
		}
		
		System.out.println("Digite a primeira posi��o que deseja somar:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite a segunda posi��o que deseja somar:");
		y = Integer.parseInt(in.nextLine());
		
		soma = vet[x-1] + vet[y-1];
		
		System.out.println("A soma �:"+soma);
		in.close();
		}
	}
