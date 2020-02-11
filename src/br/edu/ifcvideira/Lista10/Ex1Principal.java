package br.edu.ifcvideira.Lista10;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Ex1Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JComboBox cbPlacaVideo = new JComboBox();
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$200,00");
	JCheckBox chTeclado = new JCheckBox("Tecaldo - R$200,00");
	JCheckBox chGarantiaEstendida = new JCheckBox("Garantia Estendida");
	JCheckBox chPasta = new JCheckBox("Pasta - R$200,00");
	JCheckBox chCarregador = new JCheckBox("Carregador - R$200,00");
	DecimalFormat df = new DecimalFormat("0.00");
	Ex1Notebook no = new Ex1Notebook();
	Ex1Desktop de = new Ex1Desktop();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Principal frame = new Ex1Principal();
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
	public Ex1Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ex1Principal.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rbDesktop = new JRadioButton("Desktop");
		rbDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chTeclado.setEnabled(true);
				chEstabilizador.setEnabled(true);
				chPasta.setEnabled(false);
				chCarregador.setEnabled(false);
			}
		});
		buttonGroup.add(rbDesktop);
		rbDesktop.setFont(new Font("Arial", Font.BOLD, 14));
		rbDesktop.setBounds(221, 69, 127, 25);
		contentPane.add(rbDesktop);
		
		JRadioButton rbNotebook = new JRadioButton("Notebook");
		rbNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chTeclado.setEnabled(false);
				chEstabilizador.setEnabled(false);
				chPasta.setEnabled(true);
				chCarregador.setEnabled(true);
			}
		});
		buttonGroup.add(rbNotebook);
		rbNotebook.setSelected(true);
		rbNotebook.setFont(new Font("Arial", Font.BOLD, 14));
		rbNotebook.setBounds(73, 69, 127, 25);
		contentPane.add(rbNotebook);
		
		JLabel lblEscolhaAConfigurao = new JLabel("Escolha a configura\u00E7\u00E3o do computador");
		lblEscolhaAConfigurao.setFont(new Font("Arial", Font.BOLD, 17));
		lblEscolhaAConfigurao.setBounds(45, 13, 319, 16);
		contentPane.add(lblEscolhaAConfigurao);
		
		JLabel lblPlacamae = new JLabel("Placa M\u00E3e:");
		lblPlacamae.setFont(new Font("Arial", Font.BOLD, 14));
		lblPlacamae.setBounds(22, 110, 97, 19);
		contentPane.add(lblPlacamae);
		
		JComboBox cbPlacamae = new JComboBox();
		cbPlacamae.setFont(new Font("Arial", Font.BOLD, 13));
		cbPlacamae.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$500,00", "Modelo 2 - R$1000,00", "Modelo 3 - R$1500,00"}));
		cbPlacamae.setBounds(158, 108, 164, 22);
		contentPane.add(cbPlacamae);
		
		JLabel lblProcessador = new JLabel("Processador:");
		lblProcessador.setFont(new Font("Arial", Font.BOLD, 14));
		lblProcessador.setBounds(22, 156, 97, 19);
		contentPane.add(lblProcessador);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$600,00", "Modelo 2 - R$800,00", "Modelo 3 - R$1000,00"}));
		cbProcessador.setFont(new Font("Arial", Font.BOLD, 13));
		cbProcessador.setBounds(158, 154, 164, 22);
		contentPane.add(cbProcessador);
		
		JLabel lblHd = new JLabel("HD:");
		lblHd.setFont(new Font("Arial", Font.BOLD, 14));
		lblHd.setBounds(22, 198, 97, 19);
		contentPane.add(lblHd);
		
		JComboBox cbHD = new JComboBox();
		cbHD.setModel(new DefaultComboBoxModel(new String[] {"500GB - R$100,00", "1 TB - R$200,00", "2 TB - R$300,00"}));
		cbHD.setFont(new Font("Arial", Font.BOLD, 13));
		cbHD.setBounds(158, 196, 164, 22);
		contentPane.add(cbHD);
		
		JLabel lblMemria = new JLabel("Mem\u00F3ria:");
		lblMemria.setFont(new Font("Arial", Font.BOLD, 14));
		lblMemria.setBounds(12, 236, 97, 19);
		contentPane.add(lblMemria);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"4GB - R$200,00", "8GB - R$300,00", "16GB - R$400,00"}));
		cbMemoria.setFont(new Font("Arial", Font.BOLD, 13));
		cbMemoria.setBounds(158, 234, 164, 22);
		contentPane.add(cbMemoria);
		
		JCheckBox chPlacaVideo = new JCheckBox("Placa Video Off Board");
		chPlacaVideo.setSelected(true);
		chPlacaVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chPlacaVideo.isSelected()) {
					cbPlacaVideo.setEnabled(true);
				}
				else {
					cbPlacaVideo.setEnabled(false);
				}
			}
		});
		chPlacaVideo.setBounds(12, 274, 153, 25);
		contentPane.add(chPlacaVideo);
		
		
		cbPlacaVideo.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$600,00", "Modelo 2 - R$900,00", "Modelo 3 - R$1200,00"}));
		cbPlacaVideo.setFont(new Font("Arial", Font.BOLD, 13));
		cbPlacaVideo.setBounds(168, 275, 170, 22);
		contentPane.add(cbPlacaVideo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 324, 415, 2);
		contentPane.add(separator_2);
		
		
		chCarregador.setBounds(12, 339, 164, 25);
		contentPane.add(chCarregador);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(184, 324, 1, 92);
		contentPane.add(separator_8);
		
		
		chPasta.setBounds(12, 380, 148, 25);
		contentPane.add(chPasta);
		chEstabilizador.setEnabled(false);
		
		
		chEstabilizador.setBounds(219, 339, 175, 25);
		contentPane.add(chEstabilizador);
		chTeclado.setEnabled(false);
		
		
		chTeclado.setBounds(218, 380, 164, 25);
		contentPane.add(chTeclado);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 414, 415, 2);
		contentPane.add(separator);
		
		
		chGarantiaEstendida.setBounds(124, 437, 148, 25);
		contentPane.add(chGarantiaEstendida);
		
		JButton btnFinalizarPedido = new JButton("Finalizar Pedido");
		btnFinalizarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbNotebook.isSelected()) {
					//notebook	
					
					no.setConfig("");
					
					//placa mae
					if (cbPlacamae.getSelectedIndex()==0) {
						no.setPlacaMae(500);
					}else if (cbPlacamae.getSelectedIndex()==1) {
						no.setPlacaMae(1000);
					}else if (cbPlacamae.getSelectedIndex()==2) {
						no.setPlacaMae(1500);
					}
					no.setConfig(no.getConfig()+"Placa Mãe: "+cbPlacamae.getSelectedItem()+"\n");
					
					
					//processador
					if (cbProcessador.getSelectedIndex()==0) {
						no.setProcessador(600);
					}else if (cbProcessador.getSelectedIndex()==1) {
						no.setProcessador(800);
					}else if (cbProcessador.getSelectedIndex()==2) {
						no.setProcessador(1000);
					}
					no.setConfig(no.getConfig()+"Processador: "+cbProcessador.getSelectedItem()+"\n");
					
					
					//hd
					if (cbHD.getSelectedIndex()==0) {
						no.setHd(100);
					}else if (cbHD.getSelectedIndex()==1) {
						no.setHd(200);
					}else if (cbHD.getSelectedIndex()==2) {
						no.setHd(3300);
					}
					no.setConfig(no.getConfig()+"HD: "+cbHD.getSelectedItem()+"\n");
					
					//memoria
					if (cbMemoria.getSelectedIndex()==0) {
						no.setMemoria(200);
					}else if (cbMemoria.getSelectedIndex()==1) {
						no.setMemoria(300);
					}else if (cbMemoria.getSelectedIndex()==2) {
						no.setMemoria(400);
					}
					no.setConfig(no.getConfig()+"Memória: "+cbMemoria.getSelectedItem()+"\n");
					
					//placa video
					if (chPlacaVideo.isSelected()) {
						if (cbPlacaVideo.getSelectedIndex()==0) {
							no.setPlacaVideo(600);
						}else if (cbPlacaVideo.getSelectedIndex()==1) {
							no.setPlacaVideo(900);
						}else if (cbPlacaVideo.getSelectedIndex()==2) {
							no.setPlacaVideo(1200);
						}
						no.setConfig(no.getConfig()+"Placa Vídeo: "+cbPlacaVideo.getSelectedItem()+"\n");
					}
					
					//carregador
					if (chCarregador.isSelected()) {
						no.setCarregador(200);
						no.setConfig(no.getConfig()+chCarregador.getText()+"\n");
					}
					
					
					//pasta
					if (chPasta.isSelected()) {
						no.setPasta(200);
						no.setConfig(no.getConfig()+chPasta.getText()+"\n");
					}
					
					no.setVolumes(1);
					no.setConfig(no.getConfig()+"Volumes: "+no.getVolumes()+"\n");
					
					if (chGarantiaEstendida.isSelected()) {
						no.setGarantia(2);
						no.setConfig(no.getConfig()+"Garantia: "+no.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, no.imprime()+df.format(no.calculaPrecoGarantia()));
					}else {
						no.setGarantia(1);
						no.setConfig(no.getConfig()+"Garantia: "+no.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, no.imprime()+df.format(no.calculaPreco()));
					}	
					
				}else {
					//desktop
					
					de.setConfig("");
					
					//placa mae
					if (cbPlacamae.getSelectedIndex()==0) {
						de.setPlacaMae(500);
					}else if (cbPlacamae.getSelectedIndex()==1) {
						de.setPlacaMae(1000);
					}else if (cbPlacamae.getSelectedIndex()==2) {
						de.setPlacaMae(1500);
					}
					de.setConfig(de.getConfig()+"Placa Mãe: "+cbPlacamae.getSelectedItem()+"\n");
					
					
					//processador
					if (cbProcessador.getSelectedIndex()==0) {
						de.setProcessador(600);
					}else if (cbProcessador.getSelectedIndex()==1) {
						de.setProcessador(800);
					}else if (cbProcessador.getSelectedIndex()==2) {
						de.setProcessador(1000);
					}
					de.setConfig(de.getConfig()+"Processador: "+cbProcessador.getSelectedItem()+"\n");
					
					
					//hd
					if (cbHD.getSelectedIndex()==0) {
						de.setHd(100);
					}else if (cbHD.getSelectedIndex()==1) {
						de.setHd(200);
					}else if (cbHD.getSelectedIndex()==2) {
						de.setHd(3300);
					}
					de.setConfig(de.getConfig()+"HD: "+cbHD.getSelectedItem()+"\n");
					
					//memoria
					if (cbMemoria.getSelectedIndex()==0) {
						de.setMemoria(200);
					}else if (cbMemoria.getSelectedIndex()==1) {
						de.setMemoria(300);
					}else if (cbMemoria.getSelectedIndex()==2) {
						de.setMemoria(400);
					}
					de.setConfig(de.getConfig()+"Memória: "+cbMemoria.getSelectedItem()+"\n");
					
					//placa video
					if (chPlacaVideo.isSelected()) {
						if (cbPlacaVideo.getSelectedIndex()==0) {
							de.setPlacaVideo(600);
						}else if (cbPlacaVideo.getSelectedIndex()==1) {
							de.setPlacaVideo(900);
						}else if (cbPlacaVideo.getSelectedIndex()==2) {
							de.setPlacaVideo(1200);
						}
						de.setConfig(de.getConfig()+"Placa Vídeo: "+cbPlacaVideo.getSelectedItem()+"\n");
					}
					
					//estabilizador
					if (chEstabilizador.isSelected()) {
						de.setEstabilizador(200);
						de.setConfig(de.getConfig()+chEstabilizador.getText()+"\n");
					}
					
					
					//teclado
					if (chTeclado.isSelected()) {
						de.setTeclado(200);
						de.setConfig(de.getConfig()+chTeclado.getText()+"\n");
					}
					
					de.setVolumes(4);
					de.setConfig(de.getConfig()+"Volumes: "+de.getVolumes()+"\n");
					
					//garantia
					if (chGarantiaEstendida.isSelected()) {
						de.setGarantia(3);
						de.setConfig(de.getConfig()+"Garantia: "+de.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, de.imprime()+df.format(de.calculaPrecoGarantia()));
					}else {
						de.setGarantia(2);
						de.setConfig(de.getConfig()+"Garantia: "+de.getGarantia()+" anos\n");
						JOptionPane.showMessageDialog(null, de.imprime()+df.format(de.calculaPreco()));
					}	
				}
			}
		});
		btnFinalizarPedido.setFont(new Font("Arial", Font.PLAIN, 14));
		btnFinalizarPedido.setBounds(124, 483, 138, 25);
		contentPane.add(btnFinalizarPedido);
	}
}
