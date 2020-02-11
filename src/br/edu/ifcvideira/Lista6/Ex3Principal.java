//3 � Antes do racionamento de energia ser decretado, quase ningu�m falava em
//quilowatts; mas, agora, todos incorporam essa palavra em seu vocabul�rio.
//Sabendo-se que 100 quilowatts de energia custam um s�timo do sal�rio m�nimo,
//fazer uma classe em java que:
// Tenha dois atributos: um que represente o valor do sal�rio m�nimo e
//outro que represente a quantidade de quilowatts gasta por uma
//resid�ncia;
// Encapsule esses atributos;
// Crie um m�todo que retorne o valor em reais de cada quilowatt;
// Crie um m�todo que retorne o valor em reais que a resid�ncia ter� que
//pagar;
// Crie um m�todo que retorne o valor em reais que a resid�ncia ter� que
//pagar com desconto de 10%;
// Crie um m�todo main que:
// Atribua um valor aos atributos da classe;
//E que mostre na tela a quantidade em reais que a resid�ncia
//vai pagar, com e sem o desconto.
package br.edu.ifcvideira.Lista6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df  = new DecimalFormat("0.00");
		Ex3Quilowatt qw = new Ex3Quilowatt();
		double salMinimo;
		double quantQuilowatt;
		
		System.out.println("Qual o salario:");
		salMinimo = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a quantidade de quilowatt gasta:");
		quantQuilowatt = Double.parseDouble(in.nextLine());
		
		qw.setSalMinimo(salMinimo);
		qw.setQuantQuilowatt(quantQuilowatt);
		
		System.out.println("Valor total � pagar:"+df.format(qw.totalPagar())+"\n"
				+ "Com desconto de 10%:"+df.format(qw.totalPagarDesconto()));
		
		in.close();
	}
}
