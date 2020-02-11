//4 - Escreva um programa para ler o n�mero de lados de um pol�gono regular e a
//medida do lado (em cm). Calcular e imprimir o seguinte:
//- Se o n�mero de lados for igual a 3 escrever TRI�NGULO e o valor da
//�rea;
//- Se o n�mero de lados for igual a 4 escrever QUADRADO e o valor da
//sua �rea;
//- Se o n�mero de lados for igual a 5 escrever PENT�GONO.


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
		
		System.out.println("Digite o n�mero de lados: ");
		numeroLados = Integer.parseInt(in.nextLine());
		
		if (numeroLados == 3) {
			
			System.out.println("Digite a medida do lado: ");
			lado = Double.parseDouble(in.nextLine());
			
			altura = Math.sqrt((Math.pow(lado, 2)- Math.pow((lado/2), 2)));
			
			area = (lado * altura) / 2;
			
			System.out.println("� um tri�ngulo e sua �rea �: "+df.format(area));
		}
		else if (numeroLados == 4) {
			System.out.println("Digite o lado: ");
			lado = Double.parseDouble(in.nextLine());
			
			area = Math.pow(lado, 2);
			System.out.println("� um quadrado e sua �rea �: "+df.format(area));
		}
		else if (numeroLados == 5) {
			System.out.println("� um pent�gono!");
		}
		else {
			System.out.println("INV�LIDO!");
		}
		in.close();
	}
}
