package br.edu.ifcvideira.Lista10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Ex2Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfPrecoNovo;
	private JTextField tfAnosUso;
	private JTextField tfToneladas;
	
	Ex2Moto mo = new Ex2Moto();
	Ex2Automovel at = new Ex2Automovel();
	Ex2Caminhao ca = new Ex2Caminhao();
	DecimalFormat df = new DecimalFormat(" #00.00");
	JLabel lblToneladas = new JLabel("Toneladas:");
	JLabel label = new JLabel("Anos de uso:");
	JLabel lblSelecioneUmVeiculo = new JLabel("Selecione o tipo de veiculo");
	JRadioButton rbCarro = new JRadioButton("Carro");
	JRadioButton rbMoto = new JRadioButton("Moto");
	JRadioButton rbCaminhao = new JRadioButton("Caminh\u00E3o");
	JLabel lblPreoDoVeiculo = new JLabel("Pre\u00E7o do veiculo novo:");
	JButton btnFinalizar = new JButton("CALCULAR ");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2Principal frame = new Ex2Principal();
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
	public Ex2Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblSelecioneUmVeiculo.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblSelecioneUmVeiculo.setBounds(49, 13, 256, 29);
		contentPane.add(lblSelecioneUmVeiculo);
		
		
		rbCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfToneladas.setEnabled(false);
				lblToneladas.setEnabled(false);
			}
		});
		rbCarro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rbCarro);
		rbCarro.setBounds(225, 51, 69, 25);
		contentPane.add(rbCarro);
		rbMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					tfToneladas.setEnabled(false);
					lblToneladas.setEnabled(false);
			}
		});
		
		
		rbMoto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rbMoto);
		rbMoto.setBounds(149, 51, 63, 25);
		contentPane.add(rbMoto);
		rbCaminhao.setSelected(true);
		rbCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfToneladas.setEnabled(true);
				lblToneladas.setEnabled(true);
			}
		});
		
		
		rbCaminhao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		buttonGroup.add(rbCaminhao);
		rbCaminhao.setBounds(52, 51, 93, 25);
		contentPane.add(rbCaminhao);
		
		
		lblPreoDoVeiculo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreoDoVeiculo.setFont(new Font("Arial", Font.BOLD, 14));
		lblPreoDoVeiculo.setBounds(12, 85, 172, 42);
		contentPane.add(lblPreoDoVeiculo);
		
		tfPrecoNovo = new JTextField();
		tfPrecoNovo.setBounds(188, 95, 144, 22);
		contentPane.add(tfPrecoNovo);
		tfPrecoNovo.setColumns(10);
		
		
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setBounds(12, 120, 172, 42);
		contentPane.add(label);
		
		tfAnosUso = new JTextField();
		tfAnosUso.setColumns(10);
		tfAnosUso.setBounds(188, 130, 144, 22);
		contentPane.add(tfAnosUso);
		
		
		lblToneladas.setHorizontalAlignment(SwingConstants.LEFT);
		lblToneladas.setFont(new Font("Arial", Font.BOLD, 14));
		lblToneladas.setBounds(12, 155, 172, 42);
		contentPane.add(lblToneladas);
		
		tfToneladas = new JTextField();
		tfToneladas.setColumns(10);
		tfToneladas.setBounds(188, 165, 144, 22);
		contentPane.add(tfToneladas);
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbCarro.isSelected()) {
					at.setAnos(Integer.parseInt(tfAnosUso.getText()));
					at.setValor(Double.parseDouble(tfPrecoNovo.getText()));
					JOptionPane.showMessageDialog(null, "O valor atualizado do veiculo é R$"+df.format(at.getnovoValor())+"\n"
							+ "O valor do seguro é R$:"+df.format(at.seguro())+"\n"
							+ "O valor do ipva é R$: "+df.format(at.ipva()));
				}
				else if(rbMoto.isSelected()) {
					mo.setAnos(Integer.parseInt(tfAnosUso.getText()));
					mo.setValor(Double.parseDouble(tfPrecoNovo.getText()));
					JOptionPane.showMessageDialog(null, "O valor atualizado do veiculo é R$"+df.format(mo.getnovoValor())+"\n"
							+ "A concessonária não possui seguro para motos"+"\n"
									+ "O valor do ipva é R$: "+df.format(mo.ipva()));	
				}
				else if(rbCaminhao.isSelected()) {
					ca.setAnos(Integer.parseInt(tfAnosUso.getText()));
					ca.setValor(Double.parseDouble(tfPrecoNovo.getText()));
					ca.setToneladas(Double.parseDouble(tfToneladas.getText()));
					JOptionPane.showMessageDialog(null, "O valor atualizado do veiculo é R$"+df.format(ca.getnovoValor())+"\n"
							+ "O valor do seguro é R$:"+df.format(ca.seguro())+"\n"
							+ "O valor do ipva é R$: "+df.format(ca.ipva())+"\n");
				}
			}
		});
		
		
		btnFinalizar.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnFinalizar.setBounds(96, 209, 157, 42);
		contentPane.add(btnFinalizar);
	}
}
