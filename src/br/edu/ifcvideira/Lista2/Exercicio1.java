//1 � Escreva um programa em JAVA que verifique a validade de uma senha
//fornecida pelo usu�rio. A senha v�lida � o n�mero 1234. Devem ser impressas as
//seguintes mensagens:
//ACESSO PERMITIDO caso a senha seja v�lida.
//ACESSO NEGADO caso a senha seja inv�lida.

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int senhaPadrao = 1234;
		int senhaUsuario;
		 System.out.println("Digite a sua senha: ");
		 senhaUsuario = Integer.parseInt(in.nextLine());
		 
		 	if ( senhaUsuario == senhaPadrao ) {
		 		System.out.println("ACESSO PERMITIDO!");
		 	} 
		 	else
		 		System.out.println("ACESSO NEGADO!");
		 	
		 	in.close();
	}
}
