//10 (V�deo Aula 1) - Fa�a um algoritmo para calcular a �rea superficial de um
//cilindro (2*pi*r*h)

package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double raio;
		double altura;
		double area;
		
		System.out.println("Digite o raio: ");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura: ");
		altura = Double.parseDouble(in.nextLine());
		
		area = 2 * Math.PI * raio * altura;
		
		System.out.println("A �rea do cilindro �: " +area);
		
		in.close();
	}
}
