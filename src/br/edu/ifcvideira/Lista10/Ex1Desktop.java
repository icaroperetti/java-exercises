package br.edu.ifcvideira.Lista10;

public class Ex1Desktop extends Ex1Computador {
	private double estabilizador;
	private double teclado;
	
	public Ex1Desktop() {
	
	}
	

	public Ex1Desktop(double placaMae, double processador, double hd, double memoria, int volumes, int garantia,
			double placaVideo, String config,double estabilizador, double teclado) {
		super(placaMae, processador, hd, memoria, volumes, garantia, placaVideo, config);
		
		this.estabilizador = estabilizador;
		this.teclado = teclado;
		
	}


	public double getEstabilizador() {
		return estabilizador;
	}


	public void setEstabilizador(double estabilizador) {
		this.estabilizador = estabilizador;
	}


	public double getTeclado() {
		return teclado;
	}


	public void setTeclado(double teclado) {
		this.teclado = teclado;
	}
	
	public double calculaPreco() {
		return super.calculaPreco() + this.getEstabilizador()+this.getTeclado();
	}
	
	
	public String imprime() {
		return "Dados do Desktop:\n"
				+ this.getConfig()+"Total:R$";
	}
}
