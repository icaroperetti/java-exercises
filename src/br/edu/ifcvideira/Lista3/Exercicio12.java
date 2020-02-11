//12 (Vídeo Aula 4) - A prefeitura de uma cidade fez uma pesquisa entre seus
//habitantes, coletando dados sobre o número de filhos e salário. A prefeitura deseja
//saber:
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$1000,00.
//O final da leitura de dados se dará com a entrada de um salário negativo. 

package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numFilhos;
		double salario;
		double media=0;
		double mediaFilhos=0;
		double maiorSalario=0;
		int salarioMenor=0;
		int cont=0;
		
		while (2 > 1) {
			System.out.println("Qual o salário:");
			salario = Double.parseDouble(in.nextLine());
			
			if(salario < 0 ) {
				break;
			}
			
			System.out.println("Qual o numero de filhos:");
			numFilhos = Integer.parseInt(in.nextLine());
			
			media += salario;
			
			mediaFilhos =+ numFilhos;
			
			if (maiorSalario < salario) {
				maiorSalario = salario;
			}
			if(salario < 1000) {
				salarioMenor++;
			}
			cont++;
		}
		System.out.println("A média é: R$" +(media/cont));
		System.out.println("A média do número de filhos é:"+(mediaFilhos/cont));
		System.out.println("O maior salário é:R$"+maiorSalario);
		System.out.println("O percentual até R$1000 é: " +((salarioMenor /cont) * 100)+"%");
		in.close();
	}
}
