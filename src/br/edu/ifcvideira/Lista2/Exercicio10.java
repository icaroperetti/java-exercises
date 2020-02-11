//10 (Vídeo Aula 3) - Dados os nomes de 5 municípios de uma região e suas
//temperaturas médias, emitir o seguinte relatório:
// a) temperatura média da região;
// b) número de municípios com temperatura média inferior a 10ºC;
// c) nome dos municípios que apresentam temperatura média superior a 30ºC.

package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String municipio1;
		double temp1;
		String municipio2;
		double temp2;
		String municipio3;
		double temp3;
		String municipio4;
		double temp4;
		String municipio5;
		double temp5;
		double tempMedia;
		int munTempInf=0;
		
		System.out.println("Digite o nome do  municipio:");
		municipio1 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura de " +municipio1);
		temp1 = Double.parseDouble(in.nextLine());
		
		
		System.out.println("Digite o nome do  municipio:");
		municipio2 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura de "+municipio2);
		temp2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o nome do municipio:");
		municipio3 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura de "+municipio3);
		temp3 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o nome do municipio:");
		municipio4 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura de "+municipio4);
		temp4 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o nome do municipio:");
		municipio5 = String.valueOf(in.nextLine());
		System.out.println("Digite a temperatura de "+municipio5);
		temp5 = Double.parseDouble(in.nextLine());
		
		tempMedia = (temp1 + temp2 + temp3 + temp4 + temp5) / 5;
		
		System.out.println("A temperatura média entre os municipios é:"+tempMedia);
		
		if (temp1 < 10) {
			munTempInf++;
		}
		if (temp2 < 10) {
			munTempInf++;
		}
		if (temp3 < 10) {
			munTempInf++;
		}
		if (temp4 < 10) {
			munTempInf++;
		}
		if (temp5 < 10) {
			munTempInf++;
		}
		System.out.println("O numero de municipios com temperatura abaixo de 10:" +munTempInf);
		
		System.out.println("O(s) municipios com temperatura superior á 30 C:");
		
		if(temp1 > 30) {
			System.out.println(municipio1);
		}
		if(temp2 > 30) {
			System.out.println(municipio2);
		}
		if(temp3 > 30) {
			System.out.println(municipio3);
		}
		if(temp4 > 30) {
			System.out.println(municipio4);
		}
		if(temp5 > 30) {
			System.out.println(municipio5);
		}
		in.close();
	}
}
