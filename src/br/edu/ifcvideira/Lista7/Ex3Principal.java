//3 - Defina uma classe Professor com os dados: nome do professor, nome do
//departamento, n�mero de registro e data de admiss�o. Crie uma classe main que
//permita manipular os dados dos professores.

package br.edu.ifcvideira.Lista7;
import javax.swing.JOptionPane;

public class Ex3Principal {
	public static void main(String[] args) {
		Ex3Professor prof = new Ex3Professor();
		int op;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("O que desenha fazer?\n"
					+ "1 - Inserir nome\n"
					+ "2 - Inserir departamento\n"
					+ "3 - Inserir n�mero do registro\n"
					+ "4 - Inserir data de admiss�o\n"
					+ "5 - Consultar dados"));
			
			if (op == 1 ) {
				prof.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome?:")));
			}
			else if(op == 2){
				prof.setDepartamento(String.valueOf(JOptionPane.showInputDialog
						("Qual departamento?:")));
			}
			else if (op == 3) {
				prof.setRegistro(String.valueOf(JOptionPane.showInputDialog
						("Qual o n�mero de registro?:")));
			}
			else if ( op == 4) {
				prof.setDataAdmiss�o(String.valueOf(JOptionPane.showInputDialog
						("Qual data de admiss�o?:")));
			}
			else if(op == 5) {
				JOptionPane.showMessageDialog(null, "O nome �: "+prof.getNome()+"\n"
						+ "O departamento �:"+prof.getDepartamento()+"\n"
								+ "O n�mero de registro �: "+prof.getRegistro()+"\n"
										+ "Data de admiss�o: "+prof.getDataAdmiss�o());
			}
			else {
				JOptionPane.showMessageDialog(null, "Op��o inexistente");
				break;
			}
		}
	}
}
