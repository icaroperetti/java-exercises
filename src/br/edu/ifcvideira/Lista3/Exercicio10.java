//10 - Um determinado material radioativo perde metade de sua massa a cada 50
//segundos. Dada a massa inicial, em gramas, fazer um programa em JAVA que
//calcule o tempo necessário para que essa massa se torne menor que 0,5 gramas. 

package br.edu.ifcvideira.Lista3;


import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double massa;
		int horas=0;
		int min=0;
		int seg=0;
		
		System.out.println("Digite a massa");
		massa = Integer.parseInt(in.nextLine());
		
		while ( massa > 0.5) {
			massa = massa / 2;
			seg += 50;
			
			if (seg >= 60 ) {
				min++;
				seg -= 60;
			}
			if ( min > 60) {
				horas++;
				min -= 60;
			}
		}
		System.out.println("O tempo necessário foi:"+horas+" horas "+min+ " minutos  "+"e "+seg+" segundos");
		in.close();
	}
}
