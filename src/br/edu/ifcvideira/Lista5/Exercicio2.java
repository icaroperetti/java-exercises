//2 � Leia uma arrayList de 20 posi��es inteiras e a coloque em ordem crescente,
//utilizando a seguinte estrat�gia de ordena��o (sele��o direta):
//selecione o elemento do vetor que apresenta o menor valor;
//troque este elemento pelo primeiro;
//repita estas opera��es, envolvendo agora apenas os 19 elementos
//restantes (trocando o de menor valor com a segunda posi��o, depois os 18
//elementos (trocando o de menor valor com a terceira posi��o), depois os
//17, os 16 e assim por diante, at� restar um �nico elemento, o maior deles.

package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random(20);
		
		ArrayList<Integer> ordenar = new ArrayList<Integer>();
		int i;
		int j;
		int menor;
		
		for (i = 0; i < 20;i++) {
			ordenar.add(r.nextInt(30));
		}
		System.out.println(ordenar);
		menor = ordenar.get(0);
		
		for (i = 0; i < 20; i++) {
			for (j = i; j < 20;j++) {
				if (ordenar.get(j) < ordenar.get(i)) {
					menor = ordenar.get(j);
					ordenar.remove(j);
					ordenar.add(i, menor);
				}
			}
		}
		System.out.println("#######");
		System.out.println(ordenar);
		in.close();
	}
}
