//6 - Escreva um programa em JAVA para calcular e imprimir o número de
//lâmpadas necessárias para iluminar um determinado cômodo de uma residência.
//Dados de entrada: a potência da lâmpada utilizada (em watts), as dimensões
//(largura e comprimento, em metros) do cômodo. Considere que a potência
//necessária é de 18 watts por metro quadrado.


package br.edu.ifcvideira.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double area;
		double largura;
		double comprimento;
		double potencia;
		double numerolampadas;
		
		System.out.println("Digite a largura do comodo:");
		largura = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o comprimento do comodo:");
		comprimento = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite a potencia da lampada: ");
		potencia = Double.parseDouble(in.nextLine());
		
		area = comprimento * largura;
		
		numerolampadas = (area * 18) / potencia;
		
		System.out.println("O numero de lampadas necessárias é:" +df.format(numerolampadas));
		
		in.close();
	}
}
