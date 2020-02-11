//7 - A companhia telef�nica �Tchau� deseja calcular o valor das contas telef�nicas
//mensais de seus assinantes atrav�s do computador. A cobran�a de seus servi�os
//� feita obedecendo ao seguinte crit�rio:
//Tarifa b�sica: residencial � R$ 10,20;
// Comercial � R$ 19,50
// Liga��es de servi�o local (para fixo ou celular): R$ 0,50 o minuto
// Servi�o de interurbano (para fixo ou celular): R$ 1,10 o minuto
// Em cima do valor total da conta, � adicionada uma taxa de 30% para o
//Fundo Nacional de Telecomunica��es (FNT).
//Ent�o:
// Leia um n�mero de telefone e tamb�m as seguintes informa��es:
//tipo do telefone: 1 se for residencial, 2 se comercial e qualquer outro
//n�mero encerra o algoritmo avisando que o tipo de telefone � inv�lido;
// n�mero de minutos registrados para chamadas locais;
// total de minutos registrados para interurbano;
//Depois dos dados de entrada o programa dever� calcular o valor da conta e
//mostrar o detalhamento para cada tarifa (tipo de linha, local para fixo e
//celular, interurbano para fixo e celular, valor da conta, valor da taxa para a
//FNT, valor final da conta).


package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int telefoneNumero;
		int tipoTel;
		double minutosUrbanos=0;
		double minutosLocais=0;
		double valorPagar;
		double valorTaxa;
		double valorFinal;
		
		System.out.println("Qual o tipo de telefone: \n"
				+ "1 - Residencial\n" 
				+ "2 - Comercial");
		
		tipoTel = Integer.parseInt(in.nextLine());
		
		if (tipoTel == 1 ) {
			
			System.out.println("Digite o n�mero do telefone:");
			telefoneNumero = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite os minutos cahamadas interurbanas:");
			minutosUrbanos = Double.parseDouble(in.nextLine());
			
			System.out.println("Digite os minutos de chamadas locais:");
			minutosLocais = Double.parseDouble(in.nextLine());
			
			valorPagar = 19.50 + (minutosUrbanos * 1.10) + (minutosLocais * 0.50);
			valorTaxa = (valorPagar * 0.3);
			valorFinal = valorPagar + valorTaxa;
			
			System.out.println("O tipo da linha �:Residencial" + "\n"
					+ "\"Valor da conta �:"+df.format(valorPagar)+"\n"
							+ "O n�mero do telefone �:"+telefoneNumero+"\n"
									+ "Os minutos de chamadas locais foram:"+minutosLocais+"\n"
											+ "Os minutos de chamadas interurbanas foram:"+minutosUrbanos+"\n"
													+ "O valor da tarifa �:"+df.format(valorTaxa)+"\n"
															+ "O valor final �:"+df.format(valorFinal));
		}
		else if (tipoTel == 2 ) {
		
			System.out.println("Digite o n�mero do telefone:");
			telefoneNumero = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite os minutos cahamadas Urbanas:");
			minutosUrbanos = Double.parseDouble(in.nextLine());
			
			System.out.println("Digite os minutos de chamadas locais:");
			minutosLocais = Double.parseDouble(in.nextLine());
			
			valorPagar = 19.50 + (minutosUrbanos * 1.10) + (minutosLocais * 0.50);
			valorTaxa = (valorPagar * 0.3);
			valorFinal = valorPagar + valorTaxa;
			
			System.out.println("O tipo da linha �:Comercial" + "\n"
					+ "\"Valor da conta �:"+df.format(valorPagar)+"\n"
							+ "O n�mero do telefone �:"+telefoneNumero+"\n"
									+ "Os minutos de chamadas locais foram:"+minutosLocais+"\n"
											+ "Os minutos de chamadas interurbanas foram:"+minutosUrbanos+"\n"
													+ "O valor da tarifa �:"+df.format(valorTaxa)+"\n"
															+ "O valor final �:"+df.format(valorFinal));								   
		}
		else {
			System.out.println("INV�LIDO!");
		}
		in.close();
	}
}
