//4 - Escreva um programa em JAVA para ler o raio de um c�rculo, calcular e
//escrever a sua �rea.

package br.edu.ifcvideira.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double raio;
		double area;
	
		System.out.println("Digite o valor do raio: ");
		raio = Double.parseDouble(in.nextLine());
		
		
		area = Math.PI*Math.pow(raio,2);
		
		System.out.println("A �rea do circulo �: " +df.format(area));
		
		in.close();
	}
}
