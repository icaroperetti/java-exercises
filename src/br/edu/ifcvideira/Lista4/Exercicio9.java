//9 - Faça um programa em JAVA que irá ler 35 salários e 35 códigos de
//identificação de empregados. Estes dados devem ficar armazenados em vetores
//diferentes. Após lidos os 35 dados pares de dados, mostrar quais são os códigos
//dos funcionários que ganham acima de R$ 880,00.

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
			System.out.println("Digite o salário para o funcionario "+(i+1)+":");
			salarios[i] = Double.parseDouble(in.nextLine());
			//System.out.println("Digite o código do funcionário:");
			//codigos[i] = Integer.parseInt(in.nextLine());
			codigos[i] = r.nextInt(35);
		}
		
		for(i = 0; i < 35;i++) {
			if (salarios[i] > 880) {
				System.out.println("O código dos funcionarios que ganham mais de R$880 são:"+codigos[i]);
			}
		}
		in.close();
	}
}
