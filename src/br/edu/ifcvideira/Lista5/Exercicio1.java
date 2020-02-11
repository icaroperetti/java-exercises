//1 – Faça um programa utilizando arrayList que permita: inserir alunos de uma
//escola, consultar se um aluno específico está na lista, inserir alunos no meio da
//lista em uma posição específica, remover qualquer aluno que está na lista e
//consultar a qualquer momento.
package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> alunos = new ArrayList<String>();
		int posi;
		String nome;
		int op;
		
		for(;;) {
			System.out.println("Escolha uma opção:\n"
					+ "1 - Inserir\n"
					+ "2 - Buscar\n"
					+ "3 - Remover\n"
					+ "4 - Listar os alunos\n"
					+ "5 - Sair");
			
			op = Integer.parseInt(in.nextLine());
			
			if( op == 1) {
				//inserir
				System.out.println("Como deseja inserir:\n"
						+ "1 - No final\n"
						+ "2 - Em posição especifica\n");
				
				op = Integer.parseInt(in.nextLine());
				
				System.out.println("Qual o nome do aluno: ");
				nome = String.valueOf(in.nextLine());
				if( op == 1) {
					//No final
					alunos.add(nome);
				}
				else {
					//Especifico
					System.out.println("Qual a posição deseja inserir:");
					posi = Integer.parseInt(in.nextLine());
					alunos.add((posi - 1), nome);
				}
			}
			else if ( op == 2) {
				//buscar
				System.out.println("Como deseja buscar:\n"
						+ "1 - Nome\n"
						+ "2 - Posição");
				op = Integer.parseInt(in.nextLine());
				
				if (op == 1 ) {
					//buscar por nome
					System.out.println("Digite o nome do aluno:");
					nome = String.valueOf(in.nextLine());
					
					if(alunos.contains(nome)) {
						System.out.println("O nome "+nome +" foi encontrado na posição" +(alunos.indexOf(nome)+1));
					}
					else {
						System.out.println("Nome não encontrado!");
					}
				}	
					else {
						System.out.println("Qual a posição deseja consultar");
						posi = Integer.parseInt(in.nextLine());
					
						if(alunos.size() >=  posi) {
							System.out.println("O nome " +alunos.get(posi - 1)+" foi encontrado na posição "+posi);
						}
					else {
						System.out.println("Posição inexistente!");
					}
				}	
			}
			else if(op == 3) {
				//remover
				System.out.println("Como deseja remover\n"
						+ "1 - Nome\n"
						+ "2 - Posição\n"
						+ "3 - Limpar lista");
				op = Integer.parseInt(in.nextLine());
				
				if(op == 1) {
					//remover por nome
					System.out.println("Digite o nome do aluno que deseja remover:");
					nome = String.valueOf(in.nextLine());
					
					if(alunos.contains(nome)) {
						System.out.println("O nome "+nome+" foi removido da posição"+(alunos.indexOf(nome)-1));
						alunos.remove(nome);
					}
					else {
						System.out.println("O nome "+nome+" não existente!");
					}
				}
				else if (op==2) {
					//remover por posição
					System.out.println("Qual a posição deseja remover:");
					posi = Integer.parseInt(in.nextLine());
					
					if(alunos.size() >= posi) {
						alunos.remove(posi - 1);
					}
					else {
						System.out.println("Posição não encontrada!");
					}
				}
				else {
					//limpar tudo
					alunos.clear();
				}
			}
			else if (op == 4) {
				//listar todos
				System.out.println(alunos+"\n");
			}
			else if(op == 5) {
				break;
			}
			else {
				System.out.println("Opção inválida!");
			}
		}
		in.close();
	}
}
