//9 – Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
//dados de idade, sexo (M/F) e salário. Faça um programa em JAVA que calcule e
//mostre: A média dos salários; A maior e a menor idade; A quantidade de mulheres
//com salário até R$ 2000,00; Finalize a entrada de dados ao ser digitada uma
//idade negativa.

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sexo=0;
		int idade=0;
		double salario=0;
		double mediaSalario=0;
		int maiorIdade=0;
		int menorIdade=9999;
		int salarioDoisMil=0;
		int contSalario=0;
		
		
		
	
		do {
			System.out.println("Digite a idade da pessoa ");
			idade = Integer.parseInt(in.nextLine());
			
			if ( idade < 0) {
				break;
			}
			
			System.out.println("Qual o sexo: \n"
					+ "1 - Feminino\n" 
					+ "2 - Masculino");
			sexo = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite o salário:");
			salario = Integer.parseInt(in.nextLine());
			contSalario++;
			mediaSalario += salario;
			
			if ((sexo == 1) && (salario <= 2000)) {
				salarioDoisMil++;
			}
			if (idade > maiorIdade) {
				maiorIdade = idade;
			}
			if (idade < menorIdade) {
				menorIdade = idade;
			}
		}while ( idade > 0);	
		
		System.out.println("A media de salario é: "+(mediaSalario / contSalario));
		System.out.println("A maior idade é:"+maiorIdade);
		System.out.println("A menor idade é: "+menorIdade);
		System.out.println("As mulheres com salario até 2000 são:"+salarioDoisMil);
		in.close();
	}
}
