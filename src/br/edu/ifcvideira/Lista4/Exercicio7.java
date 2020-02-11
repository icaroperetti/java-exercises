//7 - Determinada empresa vende 10 artigos diferentes. Para cada artigo, a
//empresa o identifica com um código numérico e o preço de venda. Faça um
//algoritmo para exibir o código e o preço dos 3 artigos mais caros da empresa.

package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valor[] = new double [10];
		Random r = new Random();
		int i;
		int j;
		int codigo[] = new int [10];
		int auxCod;
		double aux;
		
		for(i = 0;i < 10;i++) {
		valor[i] = r.nextInt(50);
		codigo[i] = r.nextInt(1000);
		}
		
		//Método bolha de ordenação.
		for (j = 0; j < 10; j++){
			for ( i = 0; i < 9; i++) {
				if ( valor[i] > valor[i+1]) {
					aux = valor[i];
					auxCod = codigo[i];
					valor[i] = valor[i+1];
					codigo[i] = codigo[i+1];
					valor[i+1] = aux;
					codigo[i+1] = auxCod;	
				}
			}
		}
		//Impressão
		for (i = 7; i < 10;i++) {
			System.out.println("O código: "+codigo[i]+" - Valor R$:"+valor[i]);
		}
		in.close();
	}
}
