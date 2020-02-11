//10 - Faça um programa em JAVA para ler inicialmente o nome, o preço, a
//quantidade e o código de 10 produtos e armazenar estes itens em vetores. Cada
//produto tem um código entre 0 e 9 e os códigos são únicos. Depois que os dados
//dos produtos forem armazenados, perguntar o código de um produto, perguntar se
//foi venda ou compra e a quantidade (vendida / comprada) e alterar os vetores
//correspondentes. Continuar perguntando até que o usuário informe um código composto por um número negativo. Após terminada a movimentação, mostrar a
//lista de produtos com o código, descrição, preço unitário e quantidade em estoque
//e o valor total do estoque de cada item. Imprimir também o valor total do estoque
//para todos os itens juntos.

package br.edu.ifcvideira.Lista4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String nome[] = new String[10];
		double preco[] = new double[10];
		double total = 0;
		int codigo[] = new int[10];
		int quantidade[] = new int[10];
		int id;
		int op;
		int quant;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um codigo de 0 a 9 para produto " + (i+1)+":" );
			codigo[i] = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite o nome do produto " + (i+1));
			nome[i] = String.valueOf(in.nextLine());
			
			System.out.println("Digite o preço do produto " + (i+1) +":" );
			preco[i] = Double.parseDouble(in.nextLine());
			
			System.out.println("Digite a quantidade em estoque do produto" + (i+1)+":");
			quantidade[i] = Integer.parseInt(in.nextLine());
		}

		for (;;) {
			System.out.println("Qual código deseja consultar?: ");
			id = Integer.parseInt(in.nextLine());
			
			if (id < 0) {
				break;
			}
			
			System.out.println("1 - Venda\n"
					+ " 2 - Compra ");
			op = Integer.parseInt(in.nextLine());
			
			System.out.println("Quantidade: ");
			quant = Integer.parseInt(in.nextLine());

			for (int i = 0; i < 10; i++) {
				if (codigo[i] == id) {
					if (op == 1) {
						quantidade[i] -= quant;
					} else if (op == 2) {
						quantidade[i] += quant;
					}
					break;
				}
			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Codigo [" + codigo[i] + "]");
			System.out.println("Nome " + nome[i]);
			System.out.println("Preco " + df.format(preco[i]));
			System.out.println("Quantidade " + quantidade[i]);
			System.out.println("Total Unitario R$" + df.format(preco[i] * quantidade[i]));
			total += preco[i] * quantidade[i];
		}
		System.out.println("Total Final R$ " +df.format(total));

		in.close();

	}
}