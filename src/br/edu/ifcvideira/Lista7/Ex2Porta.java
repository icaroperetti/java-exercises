//2 - Faça uma classe Porta com os seguintes atributos: estado (boolean –
//aberta/fechada), cor, dimensaoX, dimensaoY e dimensaoZ. Esta classe deve
//representar os comportamentos: abrir a porta, fechar a porta, pintar e também
//verificar se a porta está aberta (atributo estado da porta estaAberta()) . Em
//seguida em outra classe (main), crie 1 porta, que possa ser aberta ou fechada e
//pintada de diversas cores, alterar suas dimensões e usar o método estaAberta
//para verificar se está aberta
package br.edu.ifcvideira.Lista7;

public class Ex2Porta {
	private boolean estado;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public  Ex2Porta() {
		
	}

	public Ex2Porta(boolean estado, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.estado = estado;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	
	public void abrir() {
		this.setEstado(true);
	}
	
	public void fechar() {
		this.setEstado(false);
	}
	
	public void pintar(String cor) {
		this.setCor(cor);
	}
	
	public String estaAberta() {
		String verificar;
			if(this.estado) {
				verificar = "A porta esta aberta";
			}
			else {
				verificar = "A porta esta fechada";
			}
			return verificar;
		}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
}
