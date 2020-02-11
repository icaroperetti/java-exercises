//9 � Fa�a um programa em JAVA que pergunte quanto voc� ganha por hora e o
//n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no
//referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda,
//8% para o INSS e 5% para o sindicato, fa�a um programa que nos mostre:
//a) sal�rio bruto;
//b) quanto pagou ao INSS;
//c) quanto pagou ao sindicato;
//d) o sal�rio l�quido.

package br.edu.ifcvideira.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double numerodeHoras;
		double valorHora;
		double salariobruto;
		double salarioliquido;
		double inss;
		double impostorenda;
		double sindicato;
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		numerodeHoras = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor recebido por hora: ");
		valorHora = Double.parseDouble(in.nextLine());
		
		salariobruto = numerodeHoras * valorHora;
		
		System.out.println("O salario bruto �: " +salariobruto);
		
		impostorenda = salariobruto * 11 / 100;
		
		inss = salariobruto * 8 / 100;
		
		sindicato = salariobruto * 5 / 100;
		
		salarioliquido = salariobruto - impostorenda - inss - sindicato;
		
		System.out.println("O  desconto do imposto de renda �: " +impostorenda);
		
		System.out.println("O  desconto do INSS �: " +inss);
		
		System.out.println("O  desconto do sindicato �: " +sindicato);
		
		System.out.println("O salario liquido �: " +df.format(salarioliquido));
		
		in.close();
	}
}
