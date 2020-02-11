//3 – Faça uma calculadora que mostre quantos azulejos são necessários para azulejar uma
//parede. É necessário conhecer a altura da parede (AP), a sua largura (LP), e a altura do azulejo (A)
//e sua largura (LA). Leia os dados através do teclado.
//O azulejo pode ser quadrado: L*L = Área
//O azulejo pode ser retangular: H*L= Área
//O azulejo pode ser triangular de lados iguais: L*L/2 = Área
//O azulejo pode ser triangular de lados diferentes: H*L/2 = Área

package br.edu.ifcvideira.Lista10;

public class Ex3CalculadoraAzulejo {
	private double ap;
	private double lp;
	private double a;
	private double la;
	
	private double areaAzulejos(int tipo){
		double area = 0;
		if (tipo == 0) {
			area = this.getLa() * this.getLa();
		}
		else if(tipo == 1) {
			area = this.getA() * this.getLa();
		}
		else if (tipo == 2) {
			area = (this.getLa() * this.getLa()) / 2;
		}
		else if(tipo == 3) {
			area = (this.getLa() * this.getA()) / 2;
		}
		return area;
	}
	
	public double calculaAzulejo(int tipo) {
		return (this.getAp() * this.getLp() / this.areaAzulejos(tipo));
	}
	
	
	public double getAp() {
		return ap;
	}
	public void setAp(double ap) {
		this.ap = ap;
	}
	public double getLp() {
		return lp;
	}
	public void setLp(double lp) {
		this.lp = lp;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getLa() {
		return la;
	}
	public void setLa(double la) {
		this.la = la;
	}
	
	
	
}
