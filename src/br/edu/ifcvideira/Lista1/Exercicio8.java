//8 - A equipe Benneton-Ford deseja calcular o número mínimo de litros que deverá
//colocar no tanque de seu carro para que ele possa percorrer um determinado
//número de voltas até o primeiro reabastecimento. Escreva um programa em JAVA
//que leia o comprimento da pista (em metros), o número total de voltas a serem
//percorridas no grande prêmio, o número de reabastecimentos desejados e o
//consumo de combustível do carro (em Km/L). Calcular e escrever o número
//mínimo de litros necessários para percorrer até o primeiro reabastecimento. OBS:
//Considere que o número de voltas entre os reabastecimentos é o mesmo

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
			
			System.out.println("Digite o número de voltas: ");
			voltas = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite a quantidade de reabastecimentos desejados: ");
			reabastecimentos = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite o consumo: ");
			consumo = Double.parseDouble(in.nextLine());
			
			minimoLitros = (double) comprimentoPista * voltas / consumo / (reabastecimentos+1);
			
			System.out.println("A quantidade minima de litros é: " +df.format(minimoLitros));
			
			in.close();		
	}
}
