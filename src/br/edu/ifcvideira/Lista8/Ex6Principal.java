package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Ex6Principal {
	public static void main(String[] args) {
		int op;
		double preco;
		double valorAdicional;
		double valorDesconto;
		String endereco;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual a conservação do imóvel\n"
					+ "1 - Novo\n"
					+ "2 - Velho\n"
					+ "3 - Cancelar"));
			
			if ( op == 3) {
				break;
			}
			else if ((op > 3) ||(op < 1)){
				break;
			}
			else {
				if (op == 1) {
					endereco = String.valueOf(JOptionPane.showInputDialog("Qual o endereço?"));
					preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço?"));
					valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço adicional?"));
					Ex6Imovel imovel = new Ex6Novo(endereco, preco, valorAdicional);
					
					JOptionPane.showMessageDialog(null,
							"Imovel novo\n" + "Preço: R$" + imovel.getPreco() + "\n"
									+ "Adicional: R$" + ((Ex6Novo) imovel).getAdicional()+ "\n"
											+ "Endereco:" + imovel.getEndereco());
									 
				}
				else if (op == 2) {
					endereco = String.valueOf(JOptionPane.showInputDialog("Qual o endereço?"));
					preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço?"));
					valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do desconto?"));
					Ex6Imovel imovel = new Ex6Velho(endereco, preco, valorDesconto);
					
					JOptionPane.showMessageDialog(null,
							"Imovel velho\n" + "Preço: R$" + imovel.getPreco() + "\n"
									 + "Desconto: R$"+((Ex6Velho) imovel).getDesconto()+ "\n"
									 		+ "Endereco: " + imovel.getEndereco());
				}
			}
		}
	}
}
