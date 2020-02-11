package br.edu.ifcvideira.Lista10;

public class Ex4Parente extends Ex4Pessoa {
	private String parentesco;

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	public String assinaturaEmail() {
		return "Até mais."+this.getNome();
	}
	
	public String imprime() {
		return super.imprime()
				+ "Parentesco: "+this.getParentesco()+"\n"
						+ "Assinatura de e-mail: "+this.assinaturaEmail();
		}
}
