package br.edu.ifcvideira.Lista10;

public class Ex2Moto extends Ex2Veiculo {
	public void setValor(double valor) {
		super.setValor(valor);
		for(int i = 0; i < this.getAnos();i++) {
			valor *= 0.92;
		}
		this.setnovoValor(valor);
	}
	
	public double ipva(){
		if(this.getAnos() <= 5) {
			return this.getnovoValor() * 0.04;
		}
		else if((this.getAnos() > 5) && (this.getAnos() <= 10)) {
			return this.getnovoValor() * 0.03;
		}
		else {
			return 0;
		}
	}
}
