package label;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Exercicio01 {

	private JFrame frame;
	private JTextField textFieldNome;
	private JTextField textFieldIdade;
	private JTextField textFieldNota1;
	public static String nome;
	public static int idade;
	public static float nota1;
	public static float nota2;
	public static float total;
	private JTextField textFieldNota2;
	public Aluno[] aluno = new Aluno [2];
	
	
                   	/* aqui declaremos os dados**/

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio01 window = new Exercicio01();
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
	public Exercicio01() {
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
		
		JPanel panel = new JPanel(); // PANEL 0
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel, "name_12619754305607");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel(); // PANEL 1
		panel_1.setBackground(Color.PINK);
		frame.getContentPane().add(panel_1, "name_12623733382437");
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		frame.getContentPane().add(panel_2, "name_12632528547286");
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.RED);
		frame.getContentPane().add(panel_3, "name_14085412635128");
		panel_3.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");  // botão entrar do panel 1
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				
				
			}
		});
		btnEntrar.setBounds(148, 90, 89, 23);
		panel.add(btnEntrar);
		
		
		
		JLabel lblPanel1Nome = new JLabel("Digite seu Nome");
		lblPanel1Nome.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPanel1Nome.setBounds(10, 25, 192, 27);
		panel_1.add(lblPanel1Nome);
		
		JButton btnOk = new JButton("OK"); // botão ok do 1º panel de inserir 
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			nome=	textFieldNome.getText();
			idade = Integer.parseInt(textFieldIdade.getText()) ;
			nota1 = Integer.parseInt(textFieldNota1.getText());
			nota2= Integer.parseInt(textFieldNota2.getText());
			total = (nota1 + nota2 ) /2;
	
			int i = 0;
			if(textFieldNome.getText() != null && textFieldIdade.getText() != null && textFieldNota1.getText() !=null && textFieldNota2.getText() != null ) {
			aluno[i] = new Aluno(textFieldNome.getText(),Integer.parseInt(textFieldIdade.getText()),Float.parseFloat(textFieldNota1.getText()),Float.parseFloat(textFieldNota2.getText()));
					
			i++;
			}// fim if
			textFieldNome.setText(null);
			textFieldIdade.setText(null);
			textFieldNota1.setText(null);
			textFieldNota2.setText(null);
		
				
				
				
				
				
			}
		});
		btnOk.setBounds(208, 173, 89, 23);
		panel_1.add(btnOk);
		
		JButton btnRetorno = new JButton("Retorno"); // botão retorno do panel 2
		btnRetorno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
				
				
				
			}
		});
		btnRetorno.setBounds(52, 227, 89, 23);
		panel_1.add(btnRetorno);
		
		JButton btnAvanco = new JButton("Avan\u00E7o");// botão avanço do label1
		btnAvanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				
				
				
				
			}
		});
		btnAvanco.setBounds(269, 227, 89, 23);
		panel_1.add(btnAvanco);
		
		JLabel lblNome = new JLabel("Inserir");
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNome.setBounds(192, 0, 46, 14);
		panel_1.add(lblNome);
		
		JLabel lblPanel1DigiteSuaIdade = new JLabel("Digite sua Idade");
		lblPanel1DigiteSuaIdade.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPanel1DigiteSuaIdade.setBounds(10, 61, 114, 24);
		panel_1.add(lblPanel1DigiteSuaIdade);
		
		JLabel lblPanel1DigiteNota1 = new JLabel("Digite a 1\u00AA Nota");
		lblPanel1DigiteNota1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPanel1DigiteNota1.setBounds(10, 96, 151, 14);
		panel_1.add(lblPanel1DigiteNota1);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(192, 30, 192, 20);
		panel_1.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(192, 63, 51, 20);
		panel_1.add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		textFieldNota1 = new JTextField();
		textFieldNota1.setBounds(192, 95, 51, 20);
		panel_1.add(textFieldNota1);
		textFieldNota1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite a 2\u00BA Nota");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 143, 114, 14);
		panel_1.add(lblNewLabel);
		
		textFieldNota2 = new JTextField();
		textFieldNota2.setBounds(192, 142, 51, 20);
		panel_1.add(textFieldNota2);
		textFieldNota2.setColumns(10);
		
		
		
		JLabel lblPanel2Nome = new JLabel("Dados: ");
		lblPanel2Nome.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPanel2Nome.setBounds(36, 37, 95, 31);
		panel_2.add(lblPanel2Nome);
		
		JLabel lblPanel2Retorno = new JLabel("Nome, Apelido e Idade");
		lblPanel2Retorno.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPanel2Retorno.setBounds(153, 37, 182, 31);
		panel_2.add(lblPanel2Retorno);
		
		JButton btnVoltar = new JButton("Voltar"); // botão retorno label 2
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_1.setVisible(true);
				
				
				
			}
		});
		btnVoltar.setBounds(36, 185, 89, 23);
		panel_2.add(btnVoltar);
		
		JButton btnPrincipal = new JButton("Principal"); // botão da panel2 
		btnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrincipal.setBounds(220, 185, 89, 23);
		panel_2.add(btnPrincipal);
		
		JLabel lblNewLabelResult = new JLabel("Resultado");
		lblNewLabelResult.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabelResult.setBounds(36, 99, 95, 14);
		panel_2.add(lblNewLabelResult);
		
		JButton Verifica = new JButton("Verifica"); // botão verifica panel 2
		Verifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(total >= 10) {
					lblNewLabelResult.setText("Aprovado");
					
				}
				else {
					
					lblNewLabelResult.setText("Reprovado");
				}
				
				lblPanel2Retorno.setText( nome+ " Idade "+ idade + "Anos");
					
				
				
				
			}
		});
		Verifica.setFont(new Font("Verdana", Font.PLAIN, 14));
		Verifica.setBounds(286, 107, 89, 23);
		panel_2.add(Verifica);
		
	
		
		JLabel lblPanel3Aluno = new JLabel("Aluno:");
		lblPanel3Aluno.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPanel3Aluno.setBounds(28, 56, 57, 26);
		panel_3.add(lblPanel3Aluno);
		
		JLabel lblPanel3Retorno = new JLabel("Nome e a Nota");
		lblPanel3Retorno.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPanel3Retorno.setBounds(95, 64, 277, 14);
		panel_3.add(lblPanel3Retorno);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnAnterior.setBounds(28, 206, 89, 23);
		panel_3.add(btnAnterior);
		
		JButton btnPrincipal_1 = new JButton("Principal");
		btnPrincipal_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPrincipal_1.setBounds(152, 206, 89, 23);
		panel_3.add(btnPrincipal_1);
	}
}
