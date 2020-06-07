package jTABLETPANEL;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.ProgressBarUI;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class Jpanel {

	private JFrame frame;
	private JTextField textFieldNOME;
	private JTextField textFieldIDADE;
	
	public static String nome = "";
	public static String idade="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jpanel window = new Jpanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Jpanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "name_10365365197995");
		
		JPanel PanelInserir = new JPanel();
		PanelInserir.setBackground(Color.GRAY);
		tabbedPane.addTab("Inserir", null, PanelInserir, null);
		PanelInserir.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(24, 26, 46, 14);
		PanelInserir.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setBounds(24, 64, 46, 14);
		PanelInserir.add(lblIdade);
		
		textFieldNOME = new JTextField();
		textFieldNOME.setBounds(94, 25, 161, 20);
		PanelInserir.add(textFieldNOME);
		textFieldNOME.setColumns(10);
		
		textFieldIDADE = new JTextField();
		textFieldIDADE.setBounds(94, 63, 86, 20);
		PanelInserir.add(textFieldIDADE);
		textFieldIDADE.setColumns(10);
		
		JPanel panelVER = new JPanel();
		panelVER.setBackground(Color.GREEN);
		tabbedPane.addTab("ver", null, panelVER, null);
		panelVER.setLayout(null);
		
		JPanel panelResultado = new JPanel();
		panelResultado.setBackground(Color.MAGENTA);
		tabbedPane.addTab("Resultado", null, panelResultado, null);
		panelResultado.setLayout(null);
		
		JLabel lblNOME_RES = new JLabel(":");
		lblNOME_RES.setBounds(66, 25, 178, 14);
		panelResultado.add(lblNOME_RES);
		
		JLabel lblIDADE_RES = new JLabel(":");
		lblIDADE_RES.setBounds(66, 62, 46, 14);
		panelResultado.add(lblIDADE_RES);
		
		JProgressBar progressBar1 = new JProgressBar();
		progressBar1.setBounds(22, 142, 146, 14);
		panelResultado.add(progressBar1);
		
		JButton btnMenu = new JButton("Resultado");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNOME_RES.setText(nome);
				lblIDADE_RES.setText(idade);
				int x = Integer.parseInt(idade);
				if(x >= 18) {
					progressBar1.setValue(100);
					progressBar1.setForeground(Color.blue);				
					
				}
				else {
					progressBar1.setValue(30);
					progressBar1.setForeground(Color.red);
					
				}
				
				
				
				
				
				
				
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMenu.setBounds(306, 184, 89, 23);
		panelResultado.add(btnMenu);
		
		JLabel lblNome_2 = new JLabel("Nome");
		lblNome_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome_2.setBounds(10, 23, 46, 14);
		panelResultado.add(lblNome_2);
		
		JLabel lblIdade_2 = new JLabel("Idade");
		lblIdade_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade_2.setBounds(10, 60, 46, 14);
		panelResultado.add(lblIdade_2);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(22, 11, 46, 14);
		panelVER.add(lblNome_1);
		
		JLabel lblIdade_1 = new JLabel("Idade");
		lblIdade_1.setBounds(22, 46, 46, 14);
		panelVER.add(lblIdade_1);
		
		JLabel labelNOME = new JLabel(":");
		labelNOME.setBounds(78, 11, 169, 14);
		panelVER.add(labelNOME);
		
		JLabel labelIdade = new JLabel(":");
		labelIdade.setBounds(78, 46, 46, 14);
		panelVER.add(labelIdade);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelNOME.setText(nome);
				labelIdade.setText(idade);
				
				
				
			}
		});
		btnBuscar.setBounds(316, 112, 89, 23);
		panelVER.add(btnBuscar);
		

		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nome = textFieldNOME.getText();
				idade = textFieldIDADE.getText();
				textFieldNOME.setText(null);
				textFieldIDADE.setText(null);
				
				
				
				
			}
		});
		btnInserir.setBounds(304, 182, 89, 23);
		PanelInserir.add(btnInserir);
		

	}

}
