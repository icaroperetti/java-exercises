//3 - Tendo como entrada a altura e o sexo (codificado da seguinte forma:
//1:feminino 2:masculino) de uma pessoa, construa um programa que calcule e
//imprima seu peso ideal, utilizando as seguintes fórmulas:
//- para homens: (72.7 * Altura) – 58
//- para mulheres: (62.1 * Altura) – 44.7
package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int sexo;
		double altura;
		System.out.println("Qual o sexo: \n"
				+ "1 - Feminino\n" 
				+ "2 - Masculino");
		
		sexo = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual a altura da pessoa: ");
		altura = Double.parseDouble(in.nextLine());
		
		if (sexo == 1 ) {
			System.out.println("Seu peso ideal é :" +df.format(((62.1 * altura) - 44.7)));
		}
		else {
			System.out.println("Seu peso ideal é: "+df.format(((72.7* altura)-58)));
		}
		in.close();
	}
}
