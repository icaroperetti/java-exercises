//2 � Defina uma classe em Java, que:
//Crie dois atributos, n1 e n2;
//Encapsule os atributos;
//Crie um m�todo que troque os valores entre os atributos n1 e n2;
//Crie um m�todo main que:
//Atribua valor aos atributos n1 e n2;
//Chame o m�todo que altera os valores;
//Mostra os valores dos atributos;
package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class Ex2Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex2Trocavalores trocar = new Ex2Trocavalores();
		
		System.out.println("Digite o primeiro numero:");
		trocar.setNumero1(Integer.parseInt(in.nextLine()));
		
		System.out.println("Digite o segundo n�mero:");
		trocar.setNumero2(Integer.parseInt(in.nextLine()));
		
		System.out.println("Os valores eram:"+trocar.getNumero1() +","+ trocar.getNumero2());
		
		trocar.troca();
		
		System.out.println("Os valores trocados:"+trocar.getNumero1() +","+ trocar.getNumero2());
		
		in.close();
		
	}
}
