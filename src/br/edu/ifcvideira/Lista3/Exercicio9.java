//9 � Foi feita uma pesquisa entre os habitantes de uma regi�o. Foram coletados os
//dados de idade, sexo (M/F) e sal�rio. Fa�a um programa em JAVA que calcule e
//mostre: A m�dia dos sal�rios; A maior e a menor idade; A quantidade de mulheres
//com sal�rio at� R$ 2000,00; Finalize a entrada de dados ao ser digitada uma
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
			
			System.out.println("Digite o sal�rio:");
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
		
		System.out.println("A media de salario �: "+(mediaSalario / contSalario));
		System.out.println("A maior idade �:"+maiorIdade);
		System.out.println("A menor idade �: "+menorIdade);
		System.out.println("As mulheres com salario at� 2000 s�o:"+salarioDoisMil);
		in.close();
	}
}
