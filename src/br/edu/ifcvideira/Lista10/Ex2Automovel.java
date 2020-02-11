package br.edu.ifcvideira.Lista10;

public class Ex2Automovel extends Ex2Veiculo {
	public void setValor(double valor) {
		super.setValor(valor);
		for (int i = 0; i < this.getAnos(); i++) {
			valor *= 0.95;
		}
		this.setnovoValor(valor);
	}
	
	public double seguro() {
		if(this.getAnos() <= 5) {
			return this.getnovoValor() * 0.045;
		}
		else if((this.getAnos() > 5) && (this.getAnos() <= 10)) {
			return this.getnovoValor() * 0.05;
		}
		else {
			return this.getnovoValor() * 0.055;
		}
	}
	
	public double ipva() {
		if(this.getAnos() < 10) {
			return this.getnovoValor() * 0.05;
		}
		else if ((this.getAnos() > 10) && (this.getAnos() <= 20)) {
			return this.getnovoValor() * 0.04;
		}
		else {
			return 0;
		}
	}
	
}
