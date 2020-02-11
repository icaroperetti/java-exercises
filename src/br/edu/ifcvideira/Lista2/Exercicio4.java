//4 - Escreva um programa para ler o número de lados de um polígono regular e a
//medida do lado (em cm). Calcular e imprimir o seguinte:
//- Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da
//Área;
//- Se o número de lados for igual a 4 escrever QUADRADO e o valor da
//sua área;
//- Se o número de lados for igual a 5 escrever PENTÁGONO.


package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int numeroLados;
		double lado;
		double area;
		double altura;
		
		System.out.println("Digite o número de lados: ");
		numeroLados = Integer.parseInt(in.nextLine());
		
		if (numeroLados == 3) {
			
			System.out.println("Digite a medida do lado: ");
			lado = Double.parseDouble(in.nextLine());
			
			altura = Math.sqrt((Math.pow(lado, 2)- Math.pow((lado/2), 2)));
			
			area = (lado * altura) / 2;
			
			System.out.println("É um triângulo e sua área é: "+df.format(area));
		}
		else if (numeroLados == 4) {
			System.out.println("Digite o lado: ");
			lado = Double.parseDouble(in.nextLine());
			
			area = Math.pow(lado, 2);
			System.out.println("É um quadrado e sua área é: "+df.format(area));
		}
		else if (numeroLados == 5) {
			System.out.println("É um pentágono!");
		}
		else {
			System.out.println("INVÁLIDO!");
		}
		in.close();
	}
}
