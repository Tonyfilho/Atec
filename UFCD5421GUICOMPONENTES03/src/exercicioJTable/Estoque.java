package exercicioJTable;

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
	private JTextField textFieldQuantidade;
	private JTextField textFieldValor;
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
		panel.setBounds(0, 0, 434, 136);
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblProdutto = new JLabel("produtto");
		lblProdutto.setBounds(10, 11, 46, 14);
		panel.add(lblProdutto);
		
		JLabel lblQuantidade = new JLabel("quantidade");
		lblQuantidade.setBounds(172, 11, 77, 14);
		panel.add(lblQuantidade);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(340, 11, 46, 14);
		panel.add(lblValor);
		
		textFieldProduto = new JTextField();
		textFieldProduto.setBounds(10, 47, 121, 20);
		panel.add(textFieldProduto);
		textFieldProduto.setColumns(10);
		
		textFieldQuantidade = new JTextField();
		textFieldQuantidade.setBounds(155, 47, 86, 20);
		panel.add(textFieldQuantidade);
		textFieldQuantidade.setColumns(10);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(319, 47, 86, 20);
		panel.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        DefaultTableModel estoque = (DefaultTableModel) tableEstoque.getModel();
		      
		        /* Object [][] DATA = new Object[][] {{textFieldProduto.getText(), textFieldQuantidade.getText(), textFieldValor.getText()}};
		         */
		        Object [] DATA = {textFieldProduto.getText(), textFieldQuantidade.getText(), textFieldValor.getText()};
		        estoque.addRow(DATA);
		        estoque.addRow(DATA);
		        
		       
		       
				
				textFieldProduto.setText("");
				textFieldQuantidade.setText("");
				textFieldValor.setText("");
				
				
			}
		});
		btnEnviar.setBounds(319, 102, 89, 23);
		panel.add(btnEnviar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 135, 434, 115);
		frame.getContentPane().add(scrollPane);
		
		tableEstoque = new JTable();
		tableEstoque.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produto", "Quantidade", "Pre\u00E7o"
			}
		));
		scrollPane.setViewportView(tableEstoque);
	}

}
