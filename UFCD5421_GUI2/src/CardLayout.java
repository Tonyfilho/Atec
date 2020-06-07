import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;

public class CardLayout {

	private JFrame frame;
	private JTextField textPainel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayout window = new CardLayout();
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
	public CardLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setLayout(new java.awt.CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		frame.getContentPane().add(panel, "name_9083054861809");
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		frame.getContentPane().add(panel_1, "name_9106526933665");
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_3, "name_9122654653482");
		
		
		JButton btnNewButton = new JButton("entrar");// botão entrar do 1º painel
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(288, 42, 63, 23);
		panel.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("voltar");// painel 2 botão voltar
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
				
				
				
			}
		});
		btnNewButton_1.setBounds(28, 119, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("seguinte");
		btnNewButton_2.addActionListener(new ActionListener() { // conf do painel 2 botão seguinte
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_3.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(187, 119, 89, 23);
		panel_1.add(btnNewButton_2);
		
		textPainel2 = new JTextField();
		textPainel2.setBounds(56, 38, 177, 20);
		panel_1.add(textPainel2);
		textPainel2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(10, 41, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblpanel3 = new JLabel("retorno");
		lblpanel3.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblpanel3.setForeground(Color.WHITE);
		lblpanel3.setBounds(189, 35, 196, 14);
		panel_3.add(lblpanel3);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnOk = new JButton("OK"); // botão ok da label 2
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPainel2.getText();
				lblpanel3.setText("Bem Vindo " + textPainel2.getText());
				panel_1.setVisible(false);
				panel_3.setVisible(true);
			
				
				
				
				
			}
		});
		btnOk.setBounds(260, 37, 89, 23);
		panel_1.add(btnOk);
		
	
		
		JButton btnNewButton_4 = new JButton("voltar");
		btnNewButton_4.setBounds(132, 139, 61, 29);
		btnNewButton_4.addActionListener(new ActionListener() {// conf do painel 3 botão voltar
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		panel_3.setLayout(null);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("principal");
		btnNewButton_3.setBounds(259, 139, 71, 34);
		btnNewButton_3.addActionListener(new ActionListener() { // conf do painel 3 botão menu principal
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		panel_3.add(btnNewButton_3);
		
		JLabel lbllable3 = new JLabel((String) null);
		lbllable3.setBackground(Color.WHITE);
		lbllable3.setOpaque(true);
		lbllable3.setIcon(new ImageIcon("C:\\Users\\rfs\\Downloads\\fundo.jpg"));
		lbllable3.setBounds(0, 0, 444, 261);
		panel_3.add(lbllable3);
		
		
	}

}
