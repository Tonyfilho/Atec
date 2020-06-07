package aula06_01_20;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Componentes {

	private JFrame frame;
	private JTextField textFieldDesc;
	private JTextField textFieldQuant;
	private JTextField textFieldPreco;
	private JTable tablesestoque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Componentes window = new Componentes();
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
	public Componentes() {
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
		frame.getContentPane().add(tabbedPane, "name_2627392063949");
		
		JPanel panelJtable = new JPanel();
		panelJtable.setBackground(Color.GRAY);
		tabbedPane.addTab("Jtable", null, panelJtable, null);
		panelJtable.setLayout(null);
		
		JLabel lblDesc = new JLabel("Desc");
		lblDesc.setBounds(10, 21, 46, 14);
		panelJtable.add(lblDesc);
		
		JLabel lblQuant = new JLabel("Quant");
		lblQuant.setBounds(186, 21, 46, 14);
		panelJtable.add(lblQuant);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setBounds(355, 21, 46, 14);
		panelJtable.add(lblPreo);
		
		textFieldDesc = new JTextField();
		textFieldDesc.setBounds(10, 54, 128, 20);
		panelJtable.add(textFieldDesc);
		textFieldDesc.setColumns(10);
		
		textFieldQuant = new JTextField();
		textFieldQuant.setBounds(165, 54, 86, 20);
		panelJtable.add(textFieldQuant);
		textFieldQuant.setColumns(10);
		
		textFieldPreco = new JTextField();
		textFieldPreco.setBounds(315, 54, 86, 20);
		panelJtable.add(textFieldPreco);
		textFieldPreco.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 123, 409, 99);
		scrollPane.setBackground(Color.YELLOW);
		panelJtable.add(scrollPane);
		
		tablesestoque = new JTable();
		tablesestoque.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Descricao", "quantidade", "Valor"
			}
		));
		tablesestoque.setBackground(Color.PINK);
		scrollPane.setViewportView(tablesestoque);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel estoqueProdutos = (DefaultTableModel)tablesestoque.getModel();
				Object[] dados = {textFieldDesc.getText(), textFieldQuant.getText(), textFieldQuant.getText()}; // fim do object
				estoqueProdutos.addRow(dados);
				textFieldDesc.setText("");
				textFieldQuant.setText("");
				textFieldPreco.setText("");
				
				
			}//fim do enviar
		});
		btnEnviar.setBounds(315, 85, 89, 23);
		panelJtable.add(btnEnviar);
	}
}
