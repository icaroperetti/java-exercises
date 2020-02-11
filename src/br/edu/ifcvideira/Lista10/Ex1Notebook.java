package br.edu.ifcvideira.Lista10;

public class Ex1Notebook extends Ex1Computador {
	private double carregador;
	private double pasta;
	
	public Ex1Notebook() {
	
	}


	public Ex1Notebook(double placaMae, double processador, double hd, double memoria, int volumes, int garantia,
			double placaVideo, String config,double carregador, double pasta) {
		
		super(placaMae, processador, hd, memoria, volumes, garantia, placaVideo, config);
		this.carregador = carregador;
		this.pasta = pasta;
		
	}


	public double getCarregador() {
		return carregador;
	}


	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}


	public double getPasta() {
		return pasta;
	}


	public void setPasta(double pasta) {
		this.pasta = pasta;
	}
	
	public double calculaPreco() {
		return super.calculaPreco() +  this.getCarregador() + this.getPasta();
	}
	
	public double calculaPrecoGarantia() {
		return calculaPreco() * 1.12;
 	}
	
	public String imprime() {
		return "Dados do notebook:\n"
				+ this.getConfig()+"Total:R$";
	}
}
