package exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	public static Calculo calculo = new Calculo();
	private JTextField textFieldTela;
	private JPanel panelBotao;
	private JPanel panelOperacoes;
	private JButton btnButtonSOMA;
	private JButton btnButtonSUB;
	private JButton btnButtonDIV;
	private JButton btnButtonMULT;
	private JButton btnButtonN1;
	private JButton btnButtonN2;
	private JButton btnButtonN3;
	private JButton btnButtonN4;
	private JButton btnButtonN5;
	private JButton btnButtonN6;
	private JButton btnButtonN7;
	private JButton btnButtonN8;
	private JButton btnButtonN9;
	private JButton btnButtonN0;
	public static float soma, n1, n2, resultado;
	public static boolean botao = true;
	private JButton btnNewButtonIQUAL;
	public static int op;
	private JButton btnCe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
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
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_4964854718057");
		panel.setLayout(null);
		
		JLabel lblTecla = new JLabel("Tela");
		lblTecla.setBounds(10, 11, 62, 18);
		lblTecla.setFont(new Font("Verdana", Font.PLAIN, 14));
		panel.add(lblTecla);
		
		textFieldTela = new JTextField();
		textFieldTela.setBounds(80, 12, 210, 20);
		panel.add(textFieldTela);
		textFieldTela.setColumns(10);
		
		panelBotao = new JPanel();
		panelBotao.setBounds(5, 60, 160, 190);
		panel.add(panelBotao);
		panelBotao.setLayout(null);
		
		btnButtonN1 = new JButton("1");// n1
		btnButtonN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldTela.setText(textFieldTela.getText() +"1");
				
			}
		});
		btnButtonN1.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN1.setBounds(0, 11, 41, 34);
		panelBotao.add(btnButtonN1);
		
		btnButtonN2 = new JButton("2"); // botao 2
		btnButtonN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"2");
				
			}
		});
		btnButtonN2.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN2.setBounds(51, 11, 41, 34);
		panelBotao.add(btnButtonN2);
		
		btnButtonN3 = new JButton("3"); // botão 3
		btnButtonN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"3");				
				
			}
		});
		btnButtonN3.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN3.setBounds(99, 11, 41, 34);
		panelBotao.add(btnButtonN3);
		
		btnButtonN4 = new JButton("4");
		btnButtonN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"4");
			}
		});
		btnButtonN4.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN4.setBounds(0, 54, 41, 34);
		panelBotao.add(btnButtonN4);
		
		btnButtonN5 = new JButton("5");
		btnButtonN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"5");
			}
		});
		btnButtonN5.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN5.setBounds(51, 54, 41, 34);
		panelBotao.add(btnButtonN5);
		
		btnButtonN6 = new JButton("6");
		btnButtonN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"6");
			}
		});
		btnButtonN6.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN6.setBounds(99, 54, 41, 34);
		panelBotao.add(btnButtonN6);
		
		btnButtonN7 = new JButton("7");
		btnButtonN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"7");
			}
		});
		btnButtonN7.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN7.setBounds(0, 99, 41, 34);
		panelBotao.add(btnButtonN7);
		
		btnButtonN8 = new JButton("8");
		btnButtonN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"8");
			}
		});
		btnButtonN8.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN8.setBounds(51, 99, 41, 34);
		panelBotao.add(btnButtonN8);
		
		btnButtonN9 = new JButton("9");
		btnButtonN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"9");
			}
		});
		btnButtonN9.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN9.setBounds(99, 99, 41, 34);
		panelBotao.add(btnButtonN9);
		
		btnButtonN0 = new JButton("0");
		btnButtonN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(textFieldTela.getText() +"0");
			}
		});
		btnButtonN0.setFont(new Font("Verdana", Font.PLAIN, 10));
		btnButtonN0.setBounds(51, 145, 41, 34);
		panelBotao.add(btnButtonN0);
		
		panelOperacoes = new JPanel();
		panelOperacoes.setBounds(175, 60, 221, 154);
		panel.add(panelOperacoes);
		panelOperacoes.setLayout(null);
		
		btnButtonSOMA = new JButton("+"); // soma
		btnButtonSOMA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Float.parseFloat(textFieldTela.getText());
				textFieldTela.setText("");
				btnButtonSUB.setEnabled(false);
				btnButtonDIV.setEnabled(false);
				btnButtonMULT.setEnabled(false);
				op = 1;
			}
		});
		btnButtonSOMA.setBounds(0, 0, 68, 35);
		btnButtonSOMA.setFont(new Font("Verdana", Font.PLAIN, 20));
		panelOperacoes.add(btnButtonSOMA);
		
		btnButtonSUB = new JButton("-"); // SUB
		btnButtonSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Float.parseFloat(textFieldTela.getText());
				textFieldTela.setText("");
				btnButtonSOMA.setEnabled(false);
				btnButtonDIV.setEnabled(false);
				btnButtonMULT.setEnabled(false);
				
				op = 2;
			}
		});
		btnButtonSUB.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnButtonSUB.setBounds(73, 0, 68, 35);
		panelOperacoes.add(btnButtonSUB);
		
		btnButtonDIV = new JButton("/"); // DIV
		btnButtonDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Float.parseFloat(textFieldTela.getText());
				textFieldTela.setText("");
				btnButtonSOMA.setEnabled(false);
				btnButtonSUB.setEnabled(false);
				btnButtonMULT.setEnabled(false);
				
				op = 3;
				
			}
		});
		btnButtonDIV.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnButtonDIV.setBounds(0, 36, 68, 35);
		panelOperacoes.add(btnButtonDIV);
		
		btnButtonMULT = new JButton("*"); // MULT
		btnButtonMULT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Float.parseFloat(textFieldTela.getText());
				textFieldTela.setText("");
				btnButtonSOMA.setEnabled(false);
				btnButtonSUB.setEnabled(false);
				btnButtonDIV.setEnabled(false);
				
			}
		});
		btnButtonMULT.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnButtonMULT.setBounds(73, 36, 68, 35);
		panelOperacoes.add(btnButtonMULT);
		
		btnNewButtonIQUAL = new JButton("=");// botão igual
		btnNewButtonIQUAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (op) {
				case 1:
					resultado = Float.parseFloat(textFieldTela.getText()) + n1;
					textFieldTela.setText(Float.toString(resultado));
					btnButtonSUB.setEnabled(true);
					btnButtonDIV.setEnabled(true);
					btnButtonMULT.setEnabled(true);
					
					break;
				case 2: 
					resultado = Float.parseFloat(textFieldTela.getText()) - n1;
					textFieldTela.setText(Float.toString(resultado));
					btnButtonSOMA.setEnabled(true);
					btnButtonDIV.setEnabled(true);
					btnButtonMULT.setEnabled(true);
					
					break;
				case 3:
					resultado =  n1 /Float.parseFloat(textFieldTela.getText()) ;
					textFieldTela.setText(Float.toString(resultado));
					btnButtonSOMA.setEnabled(true);
					btnButtonSUB.setEnabled(true);
					btnButtonMULT.setEnabled(true);
					
					
					break;
				case 4: 
					resultado =  n1 * Float.parseFloat(textFieldTela.getText());
					textFieldTela.setText(Float.toString(resultado));
					btnButtonSOMA.setEnabled(true);
					btnButtonSUB.setEnabled(true);
					btnButtonDIV.setEnabled(true);
					
					
					break;

				default:
					break;
				}
				
				
			
				
			}
		});
		btnNewButtonIQUAL.setBounds(0, 75, 68, 35);
		panelOperacoes.add(btnNewButtonIQUAL);
		
		btnCe = new JButton("CE"); // botão CE
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTela.setText(null);
				n1 = 0;
				resultado = 0;
				
				
				
			}
		});
		btnCe.setBounds(73, 75, 68, 35);
		panelOperacoes.add(btnCe);
	}

}
