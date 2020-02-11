package br.edu.ifcvideira.Lista10;

public class Ex2Caminhao extends Ex2Veiculo{
	private double toneladas;
	
	public double getToneladas() {
		return toneladas;
	}
	public void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}
	
	
	public void setValor(double valor) {
		super.setValor(valor);
		for (int i = 0; i < this.getAnos();i++) {
			valor *= 0.965;
		}
		this.setnovoValor(valor);
	}
	
	public double ipva() {
		if(this.getAnos() >= 15) {
			return 0;
		}
		else if(this.getToneladas() <= 50) {
			return this.getnovoValor() * 0.04;
		}
		else {
			return this.getnovoValor() * 0.03;
		}
	}	
		public double seguro() {
			return (500 * this.getToneladas()) /10;
		}
}
