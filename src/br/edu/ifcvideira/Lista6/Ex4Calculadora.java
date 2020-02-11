//4 - Crie uma classe de nome "Calculadora" com os seguintes atributos:
//numero1 (private � inteiro) numero2 (private � inteiro)
//Encapsule os atributos;
//E os seguintes m�todos:
//retornaSomaAtributos � este m�todo n�o deve receber par�metros, mas deve
//retornar a soma dos valores atuais dos seus atributos (numero1 e numero2).
//retornaMultiplicacaoAtributos � este m�todo n�o deve receber par�metros, mas
//deve retornar a multiplica��o dos valores atuais dos seus atributos.
//insereValoresAtributos � este m�todo deve receber como par�metros, dois valores
//inteiros que devem ser colocados em cada um dos atributos (obs.: este m�todo
//n�o deve retornar valor algum).
//Crie uma classe "Principal" (com o m�todo main) que:
// Instancia a classe "Calculadora"
// Coloca valores nos seus atributos.
// Mostra o valor retornado pelo M�todo "retornaSomaAtributos"
// Mostra o valor retornado pelo M�todo "retornaMultiplicacaoAtributos"
// Coloca outros valores nos atributos da Classe atrav�s do M�todo
//"insereValoresAtributos".
//Mostra o valor dos Atributos.
package br.edu.ifcvideira.Lista6;

public class Ex4Calculadora {
	public int numero1;
	public int numero2;

	public int retornaSomaAtributos() {
		return this.numero1 + this.numero2;
	}
	
	public int retornaMultiplicacaoAtributos() {
		return this.numero1 * this.numero2;
	}
	
	public void insereValoresAtributos(int n1, int n2) {
		this.numero1 = n1;
		this.numero2 = n2;
	}
}