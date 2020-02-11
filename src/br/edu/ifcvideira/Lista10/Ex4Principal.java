package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ex4Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfIdade;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField tfEmail;
	private JTextField tfSetor;
	private JTextField tfTelefonePessoal;
	private JTextField tfParentesco;
	JLabel lblTelefonePessoal = new JLabel("Telefone Pessoal");
	JLabel lblParentesco = new JLabel("Parentesco");
	JLabel labelSetor = new JLabel("Setor");
	
	Ex4Colega ct = new Ex4Colega();
	Ex4Amigo am = new Ex4Amigo();
	Ex4Parente pa = new Ex4Parente();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex4Principal frame = new Ex4Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex4Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AGENDA");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(141, 13, 103, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeContato = new JLabel("Tipo de contato");
		lblTipoDeContato.setForeground(Color.RED);
		lblTipoDeContato.setFont(new Font("Arial", Font.BOLD, 19));
		lblTipoDeContato.setBounds(115, 42, 156, 25);
		contentPane.add(lblTipoDeContato);
		
		JRadioButton rbColega = new JRadioButton("Colega");
		rbColega.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					tfTelefonePessoal.setEnabled(false);
					lblTelefonePessoal.setEnabled(false);
					tfParentesco.setEnabled(false);
					lblParentesco.setEnabled(false);
					tfNome.setEnabled(true);
					tfSetor.setEnabled(true);
					labelSetor.setEnabled(true);
			}
		});
		buttonGroup.add(rbColega);
		rbColega.setFont(new Font("Arial", Font.PLAIN, 15));
		rbColega.setBounds(47, 80, 83, 25);
		contentPane.add(rbColega);
		
		JRadioButton rbAmigo = new JRadioButton("Amigo");
		rbAmigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					tfParentesco.setEnabled(false);
					lblParentesco.setEnabled(false);
					tfSetor.setEnabled(false);
					labelSetor.setEnabled(false);
					tfTelefonePessoal.setEnabled(true);
					lblTelefonePessoal.setEnabled(true);
			}
		});
		buttonGroup.add(rbAmigo);
		rbAmigo.setFont(new Font("Arial", Font.PLAIN, 15));
		rbAmigo.setBounds(141, 80, 96, 25);
		contentPane.add(rbAmigo);
		
		JRadioButton rbParente = new JRadioButton("Parente");
		rbParente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					tfSetor.setEnabled(false);
					labelSetor.setEnabled(false);
					tfTelefonePessoal.setEnabled(false);
					lblTelefonePessoal.setEnabled(false);
					lblParentesco.setEnabled(true);
					tfParentesco.setEnabled(true);
			}
		});
		buttonGroup.add(rbParente);
		rbParente.setFont(new Font("Arial", Font.PLAIN, 15));
		rbParente.setBounds(242, 80, 127, 25);
		contentPane.add(rbParente);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.BOLD, 17));
		lblNome.setBounds(25, 130, 56, 16);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(96, 128, 217, 22);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Arial", Font.BOLD, 17));
		lblIdade.setBounds(25, 183, 56, 16);
		contentPane.add(lblIdade);
		
		tfIdade = new JTextField();
		tfIdade.setBounds(96, 181, 116, 22);
		contentPane.add(tfIdade);
		tfIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 17));
		lblSexo.setBounds(25, 233, 56, 16);
		contentPane.add(lblSexo);
		
		JRadioButton rbMasculino = new JRadioButton("Masculino");
		buttonGroup_1.add(rbMasculino);
		rbMasculino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbMasculino.setBounds(85, 230, 96, 25);
		contentPane.add(rbMasculino);
		
		JRadioButton rbFeminino = new JRadioButton("Feminino");
		buttonGroup_1.add(rbFeminino);
		rbFeminino.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rbFeminino.setBounds(185, 230, 96, 25);
		contentPane.add(rbFeminino);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 17));
		lblEmail.setBounds(25, 278, 56, 16);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(96, 276, 217, 22);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		
		labelSetor.setFont(new Font("Arial", Font.BOLD, 17));
		labelSetor.setBounds(25, 327, 56, 16);
		contentPane.add(labelSetor);
		
		tfSetor = new JTextField();
		tfSetor.setColumns(10);
		tfSetor.setBounds(96, 325, 217, 22);
		contentPane.add(tfSetor);
		
		
		lblTelefonePessoal.setFont(new Font("Arial", Font.BOLD, 17));
		lblTelefonePessoal.setBounds(25, 373, 140, 16);
		contentPane.add(lblTelefonePessoal);
		
		tfTelefonePessoal = new JTextField();
		tfTelefonePessoal.setColumns(10);
		tfTelefonePessoal.setBounds(164, 371, 149, 22);
		contentPane.add(tfTelefonePessoal);
		
		
		lblParentesco.setFont(new Font("Arial", Font.BOLD, 17));
		lblParentesco.setBounds(25, 419, 140, 16);
		contentPane.add(lblParentesco);
		
		tfParentesco = new JTextField();
		tfParentesco.setColumns(10);
		tfParentesco.setBounds(127, 417, 186, 22);
		contentPane.add(tfParentesco);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbColega.isSelected()) {
					ct.setNome(String.valueOf(tfNome.getText()));
					ct.setIdade(Integer.parseInt(tfIdade.getText()));
					if(rbMasculino.isSelected()) {
						ct.setSexo(rbMasculino.getText());
					}
					else {
						ct.setSexo(rbFeminino.getText());
					}
					ct.setEmail(String.valueOf(tfEmail.getText()));
					ct.setSetor(String.valueOf(tfSetor.getText()));
					JOptionPane.showMessageDialog(btnCadastrar, ct.imprime());
				}
				else if(rbAmigo.isSelected()) {
					am.setNome(String.valueOf(tfNome.getText()));
					am.setIdade(Integer.parseInt(tfIdade.getText()));
					if(rbMasculino.isSelected()) {
						am.setSexo(rbMasculino.getText());
					}
					else {
						am.setSexo(rbFeminino.getText());
					}
					am.setEmail(String.valueOf(tfEmail.getText()));
					am.setTelefone(Integer.parseInt(tfTelefonePessoal.getText()));
					JOptionPane.showMessageDialog(btnCadastrar, am.imprime());
				}
				else if(rbParente.isSelected()) {
					pa.setNome(String.valueOf(tfNome.getText()));
					pa.setIdade(Integer.parseInt(tfIdade.getText()));
					if(rbMasculino.isSelected()) {
						pa.setSexo(rbMasculino.getText());
					}
					else {
						pa.setSexo(rbFeminino.getText());
					}
					pa.setEmail(String.valueOf(tfEmail.getText()));
					pa.setParentesco(String.valueOf(tfParentesco.getText()));
					JOptionPane.showMessageDialog(btnCadastrar, pa.imprime());
				}
			}
		});
		btnCadastrar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		btnCadastrar.setBounds(115, 482, 141, 40);
		contentPane.add(btnCadastrar);
	}
}
