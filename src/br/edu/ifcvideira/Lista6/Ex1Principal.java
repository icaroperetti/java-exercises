//1 � Defina uma classe em Java, chamada de Contador, que:
// Declare um atributo chamado numero;
// Encapsule esse atributo;
// Crie um m�todo que incremente o atributo numero, somando 1 ao
//valor atual do n�mero;
// Crie um m�todo que desfa�a o incremento, subtraia 1 ao valor atual
//do n�mero;
// Crie um m�todo main que:
// Possua um menu para chamada dos m�todos;
// Ao usu�rio digitar 1 chama o m�todo que incrementa;
// Ao usu�rio digitar 2 chama o m�todo que decrementa;
// Cada vez que o valor for alterado apresentar o valor na tela;
package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class Ex1Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ex1Contador cont = new  Ex1Contador();
		int op;
		
		for(;;) {
			System.out.println("Selecione a op��o\n"
					+ "1 - Para incrementar\n"
					+ "2 - Para decrementar\n"
					+ "3 - Para sair");
			op = Integer.parseInt(in.nextLine());
			
			if (op == 1) {
				cont.incrementar();
			}
			
			else if (op == 2 ) {
				cont.decrementar();
			}
			else if (op == 3) {
				System.out.println("Voc� saiu!");
				break;
			}
			else {
				System.out.println("Op��o inexistente, por favor selecione outra op��o!\n");
			}
			System.out.println("O valor atual �: "+cont.getNumero());
		}
		in.close();
	}
}
