import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class Aula01 { //

	private JFrame frmAulagui; // cria por defaut  o frame
	private JTextField Caixa01;
	private JTextField Caixa2;
	private JLabel lblidade;
	private JLabel lblimagem;
	private JLabel lblretorno;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aula01 window = new Aula01();
					window.frmAulagui.setVisible(true); //permite aparece o frame por ser true
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aula01() {  // construtor vazio
		initialize(); // iniciando dentro do construtor
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { // nosso metodo q wsta inicializando dentro do construtor
		frmAulagui = new JFrame();
		frmAulagui.setResizable(false);
		frmAulagui.setTitle("Aula01_GUI");
		frmAulagui.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rfs\\Downloads\\transferir.png"));
		frmAulagui.getContentPane().setBackground(Color.YELLOW);
		frmAulagui.setBounds(100, 100, 730, 508); // temanho da cx do jframe
		frmAulagui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // aqui permite fechar a aplicação
		frmAulagui.getContentPane().setLayout(null);
		
		JLabel lblCabecalho = new JLabel("Nome");
		lblCabecalho.setOpaque(true);
		lblCabecalho.setForeground(Color.WHITE);
		lblCabecalho.setBackground(Color.BLUE);
		lblCabecalho.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCabecalho.setBounds(10, 11, 77, 39);
		frmAulagui.getContentPane().add(lblCabecalho);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(226, 72, 6, 20);
		frmAulagui.getContentPane().add(textPane);
		
		Caixa01 = new JTextField();
		Caixa01.setFont(new Font("Verdana", Font.PLAIN, 12));
		Caixa01.setBounds(97, 12, 195, 39);
		frmAulagui.getContentPane().add(Caixa01);
		Caixa01.setColumns(10);
		
		JButton btnEnviar = new JButton("enviar");// nome do botão
		btnEnviar.addActionListener(new ActionListener() { // AQUI começa o BOCLO  do BOTÃO ou evento do botão
			public void actionPerformed(ActionEvent arg0) {// escrevemos dentro desde bloco
				btnEnviar.setVisible(false); // fazer o botão sumir quando abertar o enviar
				JOptionPane.showMessageDialog(null, "Ola, Recebemos seu dados " +Caixa01.getText());/* chamando
				 nossa cx de texto pelo botão*/
				lblCabecalho.setVisible(true); // fazer o botão aparecer  quando abertar o OK da label
				JOptionPane.showMessageDialog(null, "Ola, Recebemos seu dados " +Caixa2.getText());
				
				lblretorno.setText("Dados Nome "  + Caixa01.getText()+ " Dados idade "+ Caixa2.getText()+ " inseridos com sucesso:" );
				
				Caixa01.setText(null); // limpando a tela
				Caixa2.setText(null); // limpando a tela
				
				//lblretorno.setText("");
				btnEnviar.setVisible(true); // fazer o botão aparecer quando abertar o enviar
			
				
			}
		});
		btnEnviar.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnEnviar.setBackground(Color.GRAY);
		btnEnviar.setBounds(413, 39, 89, 39);
		frmAulagui.getContentPane().add(btnEnviar);
		
		lblidade = new JLabel("Idade");
		lblidade.setForeground(Color.WHITE);
		lblidade.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblidade.setOpaque(true);
		lblidade.setBackground(Color.BLUE);
		lblidade.setBounds(10, 61, 77, 39);
		frmAulagui.getContentPane().add(lblidade);
		
		Caixa2 = new JTextField();
		Caixa2.setBounds(97, 62, 195, 39);
		frmAulagui.getContentPane().add(Caixa2);
		Caixa2.setColumns(10);
		
		lblimagem = new JLabel("New label");
		lblimagem.setToolTipText("clique Aqui");
		lblimagem.setIcon(new ImageIcon("C:\\Users\\rfs\\Downloads\\transferir.png"));
		lblimagem.setBounds(474, 239, 226, 168);
		frmAulagui.getContentPane().add(lblimagem);
		
		lblretorno = new JLabel((String) null);
		lblretorno.setBounds(20, 266, 419, 54);
		frmAulagui.getContentPane().add(lblretorno);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnSair.setBounds(366, 413, 89, 23);
		frmAulagui.getContentPane().add(btnSair);
	}
}
