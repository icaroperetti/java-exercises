//10 - Fa�a um programa em JAVA para ler inicialmente o nome, o pre�o, a
//quantidade e o c�digo de 10 produtos e armazenar estes itens em vetores. Cada
//produto tem um c�digo entre 0 e 9 e os c�digos s�o �nicos. Depois que os dados
//dos produtos forem armazenados, perguntar o c�digo de um produto, perguntar se
//foi venda ou compra e a quantidade (vendida / comprada) e alterar os vetores
//correspondentes. Continuar perguntando at� que o usu�rio informe um c�digo composto por um n�mero negativo. Ap�s terminada a movimenta��o, mostrar a
//lista de produtos com o c�digo, descri��o, pre�o unit�rio e quantidade em estoque
//e o valor total do estoque de cada item. Imprimir tamb�m o valor total do estoque
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
			
			System.out.println("Digite o pre�o do produto " + (i+1) +":" );
			preco[i] = Double.parseDouble(in.nextLine());
			
			System.out.println("Digite a quantidade em estoque do produto" + (i+1)+":");
			quantidade[i] = Integer.parseInt(in.nextLine());
		}

		for (;;) {
			System.out.println("Qual c�digo deseja consultar?: ");
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