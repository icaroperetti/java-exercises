//8 - A equipe Benneton-Ford deseja calcular o n�mero m�nimo de litros que dever�
//colocar no tanque de seu carro para que ele possa percorrer um determinado
//n�mero de voltas at� o primeiro reabastecimento. Escreva um programa em JAVA
//que leia o comprimento da pista (em metros), o n�mero total de voltas a serem
//percorridas no grande pr�mio, o n�mero de reabastecimentos desejados e o
//consumo de combust�vel do carro (em Km/L). Calcular e escrever o n�mero
//m�nimo de litros necess�rios para percorrer at� o primeiro reabastecimento. OBS:
//Considere que o n�mero de voltas entre os reabastecimentos � o mesmo

package br.edu.ifcvideira.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
			double comprimentoPista;
			int voltas;
			int reabastecimentos;
			double consumo;
			double minimoLitros;
			
			System.out.println("Digite o comprimento da pista em KM: ");
			comprimentoPista = Double.parseDouble(in.nextLine());
			
			System.out.println("Digite o n�mero de voltas: ");
			voltas = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite a quantidade de reabastecimentos desejados: ");
			reabastecimentos = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite o consumo: ");
			consumo = Double.parseDouble(in.nextLine());
			
			minimoLitros = (double) comprimentoPista * voltas / consumo / (reabastecimentos+1);
			
			System.out.println("A quantidade minima de litros �: " +df.format(minimoLitros));
			
			in.close();		
	}
}
