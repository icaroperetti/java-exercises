package br.edu.ifcvideira.Lista9;

public class Ex4CarroPasseio extends Ex4Veiculo {
	private String cor;
	private String modelo;
	
	
	public Ex4CarroPasseio() {
		this.cor = "";
		this.modelo = "";
		
	}
	
	public Ex4CarroPasseio(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double calculaValor() {
		return this.getPreco() * 0.85;
	}

	public String imprime() {
		return super.imprime()+"\n"+"Cor: "+this.getCor()+"\n"
				+ "Modelo: "+this.getModelo();
	}
	
	
}
