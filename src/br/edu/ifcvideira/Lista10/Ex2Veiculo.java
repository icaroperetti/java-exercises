//2 - Elabore uma aplicação para uma concessionária de veículos, Para isto:
//Implemente uma classe veículo:
//Implemente uma classe moto, que herda características de veículo;
//Implemente uma classe automóvel, que herda características de veículo;
//Implemente uma classe caminhão, que herda características de veículo;
//Implemente métodos para cálculo do valor de tabela do veículo, levando em conta os
//seguintes parâmetros:
//Entrada: valor do veículo novo.
//Para cada ano de uso em se tratando de moto é depreciado 8%, automóvel é depreciado 5%
//e caminhão 3,5%;
//Para cálculo do seguro do veículo são determinadas as seguintes opções: moto: (Não é
//possível contratar seguro pela concessionária), automóvel: o valor do seguro é de 4,5% para
//veículos com até 5 anos de uso, 5% para veículos entre 5 e 10 anos de uso e 5,5% para mais
//de 10 anos de uso. Caminhões valor de 500,00 para cada 10 toneladas de capacidade.
//Cálculo de IPVA:
//moto - 4% para até 5 anos de uso, 3% para até 10 anos de uso, + de 10 anos é isento:
//automóvel - 5% para até 10 anos de uso, 4% para até 20 anos de uso, + de 20 anos é isento:
//caminhão - 4% para até 50 toneladas de capacidade, 3% para capacidade maior de 50
//toneladas, se tiver + de 15 anos de uso é isento. (Independente da capacidade):
//A saída deve apresentar o valor atual do veículo, o valor do seguro e o valor do IPVA.


package br.edu.ifcvideira.Lista10;

public class Ex2Veiculo {
	private int anos;
	private double valor;
	private double novoValor;
	
	
	public int getAnos() {
		return anos;
	}
	public void setAnos(int anos) {
		this.anos = anos;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getnovoValor() {
		return novoValor;
	}
	public void setnovoValor(double novoValor) {
		this.novoValor = novoValor;
	}
	
	
}
