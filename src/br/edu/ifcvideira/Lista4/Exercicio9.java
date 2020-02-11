//9 - Fa�a um programa em JAVA que ir� ler 35 sal�rios e 35 c�digos de
//identifica��o de empregados. Estes dados devem ficar armazenados em vetores
//diferentes. Ap�s lidos os 35 dados pares de dados, mostrar quais s�o os c�digos
//dos funcion�rios que ganham acima de R$ 880,00.

package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salarios[] = new double [35];
		int codigos[] = new int [35];
		int i;
		
		Random r = new Random();
		
		for(i = 0; i < 35; i++) {
			System.out.println("Digite o sal�rio para o funcionario "+(i+1)+":");
			salarios[i] = Double.parseDouble(in.nextLine());
			//System.out.println("Digite o c�digo do funcion�rio:");
			//codigos[i] = Integer.parseInt(in.nextLine());
			codigos[i] = r.nextInt(35);
		}
		
		for(i = 0; i < 35;i++) {
			if (salarios[i] > 880) {
				System.out.println("O c�digo dos funcionarios que ganham mais de R$880 s�o:"+codigos[i]);
			}
		}
		in.close();
	}
}
