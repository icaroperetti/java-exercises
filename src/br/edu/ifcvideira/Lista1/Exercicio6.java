//6 - Escreva um programa em JAVA para calcular e imprimir o n�mero de
//l�mpadas necess�rias para iluminar um determinado c�modo de uma resid�ncia.
//Dados de entrada: a pot�ncia da l�mpada utilizada (em watts), as dimens�es
//(largura e comprimento, em metros) do c�modo. Considere que a pot�ncia
//necess�ria � de 18 watts por metro quadrado.


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
		
		System.out.println("O numero de lampadas necess�rias �:" +df.format(numerolampadas));
		
		in.close();
	}
}
