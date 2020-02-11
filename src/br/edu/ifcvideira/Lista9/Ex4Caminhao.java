package br.edu.ifcvideira.Lista9;

public class Ex4Caminhao extends Ex4Veiculo {
	private int cargaMax;
	private double alturaMax;
	private int comprimento;
	
	Ex4Caminhao(){
		this.cargaMax = 0;
		this.alturaMax = 0;
		this.comprimento = 0;
	}

	public Ex4Caminhao(int cargaMax, double alturaMax, int comprimento) {
		this.cargaMax = cargaMax;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public double getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public double calculaValor() {
		return this.getPreco() * 0.80;
	}
	
	public String imprime() {
		return super.imprime()+"\n"
				+ "Carga Máxima: "+this.getCargaMax()+"\n"
						+ "Altura Máxima: "+this.getAlturaMax()+"\n"
								+ "Comprimento: "+this.getComprimento();
	}
}
