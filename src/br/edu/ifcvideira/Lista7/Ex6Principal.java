//6 - Crie uma classe chamada de Aluno, esta classe tem os seguintes atributos:
//matricula, nome, e-mail, curso, fone, cel e endere�o. Esta classe deve conter os
//getters e setters, al�m do construtor padr�o (vazio), mais um construtor que
//receba todos os atributos como par�metros. Crie uma classe main, na qual o
//usu�rio possa cadastrar um aluno pelas duas maneiras
package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Ex6Principal {
	public static void main(String[] args) {
		Ex6Aluno aluno = new Ex6Aluno();
		 int matricula;
		 String nome;
		 String email;
		 String curso;
		 int fone;
		 int cel;
		 String endereco = "";
		 
		 matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o n� da matr�cula:"));
		 nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome: "));
		 email = String.valueOf(JOptionPane.showInputDialog("Digite o e-mail: "));
		 curso = String.valueOf(JOptionPane.showInputDialog("Digite o curso: "));
		 fone = Integer.parseInt(JOptionPane.showInputDialog("Digite o n� do telefone(fixo):"));
		 cel =  Integer.parseInt(JOptionPane.showInputDialog("Digite o n� do celular:"));
		 String.valueOf(JOptionPane.showInputDialog("Digite o endere�o: "));
		 
		 aluno.setMatricula(matricula);
		 aluno.setNome(nome);
		 aluno.setEmail(email);
		 aluno.setCurso(curso);
		 aluno.setFone(fone);
		 aluno.setCel(cel);
		 aluno.setEndereco(endereco);
		 
		 Ex6Aluno al = new Ex6Aluno(matricula, nome, email, curso, fone, cel, endereco);
			JOptionPane.showMessageDialog(null, "N�mero da matricula:"+al.getMatricula()+"\n"
					+ "Nome do aluno:"+al.getNome()+"\n"
							+ "Email do aluno: "+al.getEmail()+"\n"
									+ "Curso:"+al.getCurso()+"\n"
											+ "Telefone fixo:"+al.getFone()+"\n"
													+ "Celular:"+al.getCel());
	}
}
