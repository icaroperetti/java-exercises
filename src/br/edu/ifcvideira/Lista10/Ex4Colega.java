package br.edu.ifcvideira.Lista10;

public class Ex4Colega extends Ex4Pessoa {
	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String assinaturaEmail() {
		return "Att. "+this.getNome();
	}
	
	public String imprime() {
		return super.imprime()+"Setor: "+this.getSetor()+"\n"
				+ "Assinatura do e-mail: "+this.assinaturaEmail();
	}
	
}
