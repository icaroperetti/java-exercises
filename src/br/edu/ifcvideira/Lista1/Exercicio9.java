//9 – Faça um programa em JAVA que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
//referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
//8% para o INSS e 5% para o sindicato, faça um programa que nos mostre:
//a) salário bruto;
//b) quanto pagou ao INSS;
//c) quanto pagou ao sindicato;
//d) o salário líquido.

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
		
		System.out.println("O salario bruto é: " +salariobruto);
		
		impostorenda = salariobruto * 11 / 100;
		
		inss = salariobruto * 8 / 100;
		
		sindicato = salariobruto * 5 / 100;
		
		salarioliquido = salariobruto - impostorenda - inss - sindicato;
		
		System.out.println("O  desconto do imposto de renda é: " +impostorenda);
		
		System.out.println("O  desconto do INSS é: " +inss);
		
		System.out.println("O  desconto do sindicato é: " +sindicato);
		
		System.out.println("O salario liquido é: " +df.format(salarioliquido));
		
		in.close();
	}
}
