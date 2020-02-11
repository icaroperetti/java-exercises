//4 - Crie uma classe de nome "Calculadora" com os seguintes atributos:
//numero1 (private – inteiro) numero2 (private – inteiro)
//Encapsule os atributos;
//E os seguintes métodos:
//retornaSomaAtributos – este método não deve receber parâmetros, mas deve
//retornar a soma dos valores atuais dos seus atributos (numero1 e numero2).
//retornaMultiplicacaoAtributos – este método não deve receber parâmetros, mas
//deve retornar a multiplicação dos valores atuais dos seus atributos.
//insereValoresAtributos – este método deve receber como parâmetros, dois valores
//inteiros que devem ser colocados em cada um dos atributos (obs.: este método
//não deve retornar valor algum).
//Crie uma classe "Principal" (com o método main) que:
// Instancia a classe "Calculadora"
// Coloca valores nos seus atributos.
// Mostra o valor retornado pelo Método "retornaSomaAtributos"
// Mostra o valor retornado pelo Método "retornaMultiplicacaoAtributos"
// Coloca outros valores nos atributos da Classe através do Método
//"insereValoresAtributos".
//Mostra o valor dos Atributos.
package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class Ex4Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex4Calculadora calc = new Ex4Calculadora();

		
		System.out.println("Digite o primeiro número:");
		calc.numero1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo número:");
		calc.numero2 = Integer.parseInt(in.nextLine());
		
	
		System.out.println("O primeiro número digitado foi:"+calc.numero1+"\n"
					+ "O segundo número digitado foi:"+calc.numero2+"\n"
							+ "A soma foi:"+calc.retornaSomaAtributos()+"\n"
									+ "A multiplicação foi:"+calc.retornaMultiplicacaoAtributos()+"\n");
		
		System.out.println("Insira dois novos valores:");
		calc.insereValoresAtributos(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
		System.out.println("Os valores digitados foram:"+calc.numero1+" e "+calc.numero2);
		
		in.close();
	}
}
