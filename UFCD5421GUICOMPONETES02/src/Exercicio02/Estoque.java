package Exercicio02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Estoque {

	private JFrame frame;
	private JTextField textFieldProduto;
	private JTextField textFieldQuant;
	private JTextField textFieldPreco;
	private JTable tableEstoque;
	private JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoque window = new Estoque();
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
	public Estoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 138);
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblProduto = new JLabel("produto");
		lblProduto.setBounds(10, 11, 46, 14);
		panel.add(lblProduto);
		
		JLabel lblQuant = new JLabel("quant");
		lblQuant.setBounds(163, 11, 46, 14);
		panel.add(lblQuant);
		
		JLabel lblPreo = new JLabel("pre\u00E7o");
		lblPreo.setBounds(347, 11, 46, 14);
		panel.add(lblPreo);
		
		textFieldProduto = new JTextField();
		textFieldProduto.setBounds(0, 36, 122, 20);
		panel.add(textFieldProduto);
		textFieldProduto.setColumns(10);
		
		textFieldQuant = new JTextField();
		textFieldQuant.setBounds(145, 36, 86, 20);
		panel.add(textFieldQuant);
		textFieldQuant.setColumns(10);
		
		textFieldPreco = new JTextField();
		textFieldPreco.setBounds(307, 36, 86, 20);
		panel.add(textFieldPreco);
		textFieldPreco.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = 0;
				DefaultTableModel estoque = (DefaultTableModel)tableEstoque.getModel();
				Object[] est = {textFieldProduto.getText(), textFieldQuant.getText(), textFieldPreco.getText() };
				estoque.addRow(est);
				
				
				
			}
		});
		btnEnviar.setBounds(307, 92, 89, 23);
		panel.add(btnEnviar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 138, 434, 123);
		scrollPane.setBackground(Color.MAGENTA);
		frame.getContentPane().add(scrollPane);
		
		tableEstoque = new JTable();
		tableEstoque.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produto", "Quantidade", "Preço"
			}
		));
		scrollPane.setViewportView(tableEstoque);
	}
}
