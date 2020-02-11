//5 - Escreva um programa que leia as medidas dos lados de um triângulo e
//escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
//- Triângulo Equilátero: possui os 3 lados iguais;
//- Triângulo Isóscele: possui 2 lados iguais;
//- Triângulo Escaleno: possui 3 lados diferentes.

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double lado1;
		double lado2;
		double lado3;

		System.out.println("Digite a medida do primeiro lado: ");
		lado1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a medida do segundo lado: ");
		lado2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor do terceiro lado: ");
		lado3 = Double.parseDouble(in.nextLine());
		
		if ((lado1 == lado2) && ( lado2 == lado3)) {
			System.out.println("Equilátero");
		}
		else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3 )) {
			System.out.println("Isóceles");
		}
		else {
			System.out.println("Escaleno");
		}
		in.close();
	}
}
