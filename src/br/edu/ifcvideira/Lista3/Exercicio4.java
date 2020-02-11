//4 - Faça um programa em JAVA para ler a altura e o sexo (feminino, masculino)
//de 10 pessoas. Calcular e escrever:
//- A maior e a menor altura;
//- A média de altura das mulheres;
//- A porcentagem de homens;

package br.edu.ifcvideira.Lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int sexo;
		int contMasc=0;
		int contFem=0;
		double altura=0;
		double maiorAltura=0;
		double menorAltura=9999;
		double mediaFem=0;
		
		
		for (int i=0;i < 3;i++) {
			System.out.println("Qual o sexo: \n"
					+ "1 - Feminino\n" 
					+ "2 - Masculino");
			
			sexo = Integer.parseInt(in.nextLine());
			
			if ((sexo != 1) && (sexo != 2)) {
				System.out.println("Opção INVÁLIDA!");
				break;
			}
			
			System.out.println("Entre com a altura da pessoa: ");
			altura = Double.parseDouble(in.nextLine());
			
			if (sexo == 1) {
				contFem++;
				mediaFem += altura;
			}
			if (sexo == 2) {
				contMasc++;
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			if ( altura < 1 ) {
				System.out.println("A idade precisa ser maior que 0:");
				break;
			}
		}
		System.out.println("A maior altura é :"+df.format(maiorAltura));
		System.out.println("A menor altura é: "+df.format(menorAltura));
		System.out.println("A média feminina é: "+df.format(mediaFem/contFem));
		System.out.println("A porcentagem de homens é: "+df.format(contMasc*0.10));
		in.close();
	}
}
