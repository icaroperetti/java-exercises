package br.edu.ifcvideira.Lista10;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Ex3Principal extends JFrame {

	private JPanel contentPane;
	private JTextField tfAp;
	private JTextField tfLp;
	private JTextField tfA;
	private JTextField tfLa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3Principal frame = new Ex3Principal();
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
	public Ex3Principal() {
		Ex3CalculadoraAzulejo ca = new Ex3CalculadoraAzulejo();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCalculadoraDeAzulejos = new JLabel("Calculadora de azulejos");
		lblCalculadoraDeAzulejos.setBackground(Color.WHITE);
		lblCalculadoraDeAzulejos.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCalculadoraDeAzulejos.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraDeAzulejos.setBounds(-12, 13, 426, 17);
		contentPane.add(lblCalculadoraDeAzulejos);

		JLabel lblColoque = new JLabel("Altura da parede");
		lblColoque.setFont(new Font("Arial", Font.BOLD, 17));
		lblColoque.setBounds(79, 58, 132, 17);
		contentPane.add(lblColoque);

		JLabel lblLarguraDaParede = new JLabel("Largura da parede");
		lblLarguraDaParede.setFont(new Font("Arial", Font.BOLD, 17));
		lblLarguraDaParede.setBounds(79, 87, 154, 17);
		contentPane.add(lblLarguraDaParede);

		JLabel lblAlturaDoAzulejo = new JLabel("Altura do azulejo");
		lblAlturaDoAzulejo.setFont(new Font("Arial", Font.BOLD, 17));
		lblAlturaDoAzulejo.setBounds(79, 116, 132, 17);
		contentPane.add(lblAlturaDoAzulejo);

		JLabel lblLarguraDoAzulejo = new JLabel("Largura do azulejo");
		lblLarguraDoAzulejo.setFont(new Font("Arial", Font.BOLD, 17));
		lblLarguraDoAzulejo.setBounds(79, 145, 147, 17);
		contentPane.add(lblLarguraDoAzulejo);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setForeground(Color.RED);

		btnCalcular.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		btnCalcular.setBounds(137, 306, 132, 43);
		contentPane.add(btnCalcular);

		tfAp = new JTextField();
		tfAp.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfAp.setBounds(245, 55, 114, 21);
		contentPane.add(tfAp);
		tfAp.setColumns(10);

		tfLp = new JTextField();
		tfLp.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfLp.setColumns(10);
		tfLp.setBounds(245, 84, 114, 21);
		contentPane.add(tfLp);

		tfA = new JTextField();
		tfA.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfA.setColumns(10);
		tfA.setBounds(245, 113, 114, 21);
		contentPane.add(tfA);

		tfLa = new JTextField();
		tfLa.setFont(new Font("Dialog", Font.PLAIN, 14));
		tfLa.setColumns(10);
		tfLa.setBounds(245, 142, 114, 21);
		contentPane.add(tfLa);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Quadrado", "Retangular", "Triangular de lados iguais", "Triangular de lados diferentes"}));
		comboBox.setBounds(109, 243, 219, 26);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Selecione o formato");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(128, 213, 164, 17);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(-13, 188, 415, 2);
		contentPane.add(separator);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setA(Double.parseDouble(tfA.getText()));
				ca.setAp(Double.parseDouble(tfAp.getText()));
				ca.setLa(Double.parseDouble(tfLa.getText()));
				ca.setLp(Double.parseDouble(tfLp.getText()));
				JOptionPane.showMessageDialog(null, "O número de azulejos necessários é: "+
				ca.calculaAzulejo(comboBox.getSelectedIndex()));
			}
		});
	}

}
