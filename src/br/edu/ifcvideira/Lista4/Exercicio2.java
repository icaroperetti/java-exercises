//2 – Faça um programa em JAVA que leia um vetor de 12 posições e em seguida
//ler também dois valores X e Y quaisquer correspondentes a duas posições no
//vetor. Ao final seu programa deverá escrever a soma dos valores encontrados nas
//respectivas posições X e Y.
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
			System.out.println("Digite o valor para a posição "+(i+1));
			vet[i] = Integer.parseInt(in.nextLine());
		}
		
		System.out.println("Digite a primeira posição que deseja somar:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite a segunda posição que deseja somar:");
		y = Integer.parseInt(in.nextLine());
		
		soma = vet[x-1] + vet[y-1];
		
		System.out.println("A soma é:"+soma);
		in.close();
		}
	}
