package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JSlider;

public class PrincipalCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero1;
	private JTextField tfNumero2;
	private JTextField tfResultado;
	
	Calculadora ca = new Calculadora();
	
	JRadioButton rbMultiplicacao = new JRadioButton("Multiplica\u00E7\u00E3o");
	JRadioButton rbDivisao = new JRadioButton("Divis\u00E3o");
	JRadioButton rbSoma = new JRadioButton("Soma");
	JRadioButton rbSubtracao = new JRadioButton("Subtra\u00E7\u00E3o");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalCalculadora frame = new PrincipalCalculadora();
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
	public PrincipalCalculadora() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(91, 11, 93, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("N\u00FAmero 1:");
		lblNmero.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNmero.setBounds(10, 46, 93, 25);
		contentPane.add(lblNmero);
		
		tfNumero1 = new JTextField();
		tfNumero1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		tfNumero1.setBounds(121, 47, 137, 23);
		contentPane.add(tfNumero1);
		tfNumero1.setColumns(10);
		
		JLabel lblNmero_1 = new JLabel("N\u00FAmero 2:");
		lblNmero_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNmero_1.setBounds(10, 82, 93, 25);
		contentPane.add(lblNmero_1);
		
		tfNumero2 = new JTextField();
		tfNumero2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		tfNumero2.setColumns(10);
		tfNumero2.setBounds(121, 83, 137, 23);
		contentPane.add(tfNumero2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ca.setNumero1(Double.parseDouble(tfNumero1.getText()));
				ca.setNumero2(Double.parseDouble(tfNumero2.getText()));
				
				tfResultado.setText(""+ca.soma());
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(10, 123, 56, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setNumero1(Double.parseDouble(tfNumero1.getText()));
				ca.setNumero2(Double.parseDouble(tfNumero2.getText()));
				
				tfResultado.setText(""+ca.subtracao());
			}
		});
		button.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		button.setBounds(76, 123, 56, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setNumero1(Double.parseDouble(tfNumero1.getText()));
				ca.setNumero2(Double.parseDouble(tfNumero2.getText()));
				
				tfResultado.setText(""+ca.multiplicacao());
			}
		});
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		button_1.setBounds(144, 123, 56, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setNumero1(Double.parseDouble(tfNumero1.getText()));
				ca.setNumero2(Double.parseDouble(tfNumero2.getText()));
				
				tfResultado.setText(""+ca.divisao());
			}
		});
		button_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		button_2.setBounds(210, 123, 56, 23);
		contentPane.add(button_2);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblResultado.setBounds(10, 289, 93, 25);
		contentPane.add(lblResultado);
		
		tfResultado = new JTextField();
		tfResultado.setEnabled(false);
		tfResultado.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		tfResultado.setColumns(10);
		tfResultado.setBounds(121, 290, 137, 23);
		contentPane.add(tfResultado);
		
		JComboBox cbOperacao = new JComboBox();
		cbOperacao.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
				ca.setNumero1(Double.parseDouble(tfNumero1.getText()));
				ca.setNumero2(Double.parseDouble(tfNumero2.getText()));
				
				if (cbOperacao.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(cbOperacao, "Selecione uma operação");
				}else if (cbOperacao.getSelectedIndex()==1) {
					tfResultado.setText(""+ca.soma());
				}else if (cbOperacao.getSelectedIndex()==2) {
					tfResultado.setText(""+ca.subtracao());
				}else if (cbOperacao.getSelectedIndex()==3) {
					tfResultado.setText(""+ca.multiplicacao());
				}else if (cbOperacao.getSelectedIndex()==4) {
					tfResultado.setText(""+ca.divisao());
				}
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
			}
		});
		cbOperacao.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Soma", "Subtra\u00E7\u00E3o", "Multiplica\u00E7\u00E3o", "Divis\u00E3o"}));
		cbOperacao.setBounds(76, 155, 124, 20);
		contentPane.add(cbOperacao);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ca.setNumero1(Double.parseDouble(tfNumero1.getText()));
				ca.setNumero2(Double.parseDouble(tfNumero2.getText()));
				
				if (rbSoma.isSelected()) {
					tfResultado.setText(""+ca.soma());
				}else if (rbSubtracao.isSelected()) {
					tfResultado.setText(""+ca.subtracao());
				}else if (rbDivisao.isSelected()) {
					tfResultado.setText(""+ca.divisao());
				}else if (rbMultiplicacao.isSelected()) {
					tfResultado.setText(""+ca.multiplicacao());
				}
				
//				
//				if (cbOperacao.getSelectedItem().equals("Soma")) {
//					tfResultado.setText(""+ca.soma());
//				}else if (cbOperacao.getSelectedItem().equals("Subtração")) {
//					tfResultado.setText(""+ca.subtracao());
//				}else if (cbOperacao.getSelectedItem().equals("Multiplicação")) {
//					tfResultado.setText(""+ca.multiplicacao());
//				}else if (cbOperacao.getSelectedItem().equals("Divisão")) {
//					tfResultado.setText(""+ca.divisao());
//				}
			}
		});
		btnNewButton_1.setBounds(91, 255, 89, 23);
		contentPane.add(btnNewButton_1);
		
		buttonGroup.add(rbMultiplicacao);
		rbMultiplicacao.setBounds(26, 225, 109, 23);
		contentPane.add(rbMultiplicacao);

		buttonGroup.add(rbDivisao);
		rbDivisao.setBounds(144, 225, 109, 23);
		contentPane.add(rbDivisao);

		rbSoma.setSelected(true);
		buttonGroup.add(rbSoma);
		rbSoma.setBounds(26, 199, 109, 23);
		contentPane.add(rbSoma);

		buttonGroup.add(rbSubtracao);
		rbSubtracao.setBounds(144, 199, 109, 23);
		contentPane.add(rbSubtracao);
	}
}

























