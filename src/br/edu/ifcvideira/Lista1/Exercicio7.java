//7 - Escreva um programa em JAVA para ler as dimensões de uma cozinha
//retangular (comprimento, largura e altura), calcular e escrever a quantidade de
//caixas de azulejos para se colocar em todas as suas paredes (considere que não
//será descontada a área ocupada por portas e janelas). Cada caixa de azulejos
//possui 1,5 m2.

package br.edu.ifcvideira.Lista1;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double comprimento;
		double largura;
		double altura;
		double area;
		double numerocaixas;
		
		
		System.out.println("Digite o comprimento da cozinha: ");
		comprimento = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a largura da cozinha: ");
		largura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a altura da cozinha: ");
		altura = Double.parseDouble(in.nextLine());
		
		area = ((comprimento * altura)*2) + ((largura * altura)*2);
		
		numerocaixas = area / 1.5;
		
		System.out.println("Serão necessárias: " +(int) Math.round(numerocaixas) + " caixas.");
		
		in.close();
	}
}
