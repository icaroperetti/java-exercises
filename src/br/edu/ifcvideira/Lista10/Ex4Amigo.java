package br.edu.ifcvideira.Lista10;

public class Ex4Amigo extends Ex4Pessoa{
	private int telefonePessoal;

	public int getTelefonePessoal() {
		return telefonePessoal;
	}

	public void setTelefone(int telefonePessoal) {
		this.telefonePessoal = telefonePessoal;
	}
	
	public String assinaturaEmail() {
		return "Abraços."+this.getNome();
		
	}
	
	public String imprime() {
		return super.imprime() + "Numero pessoal: " + this.getTelefonePessoal()+"\n"
				+ "Assinatura de e-mail: "+this.assinaturaEmail()+"\n";
				
	}
}
