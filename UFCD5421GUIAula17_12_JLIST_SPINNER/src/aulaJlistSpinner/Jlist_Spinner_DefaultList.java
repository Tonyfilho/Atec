package aulaJlistSpinner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.plaf.ProgressBarUI;

public class Jlist_Spinner_DefaultList {

	private JFrame frame;
	private JTextField textFieldNOME;
	private JTextField textFieldIDADE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jlist_Spinner_DefaultList window = new Jlist_Spinner_DefaultList();
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
	public Jlist_Spinner_DefaultList() {
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
		panel.setBackground(Color.RED);
		frame.getContentPane().add(panel, "name_4722712808699");
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(10, 24, 46, 14);
		panel.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setBounds(10, 55, 46, 14);
		panel.add(lblIdade);
		
		textFieldNOME = new JTextField();
		textFieldNOME.setBounds(106, 23, 151, 20);
		panel.add(textFieldNOME);
		textFieldNOME.setColumns(10);
		
		textFieldIDADE = new JTextField();
		textFieldIDADE.setBounds(106, 54, 60, 20);
		panel.add(textFieldIDADE);
		textFieldIDADE.setColumns(10);
		
		JRadioButton rdbtnNOME = new JRadioButton("NOME");
		rdbtnNOME.setBounds(27, 114, 109, 23);
		panel.add(rdbtnNOME);
		
		JRadioButton rdbtnIdade = new JRadioButton("IDADE");
		rdbtnIdade.setBounds(220, 114, 109, 23);
		panel.add(rdbtnIdade);
		
		ButtonGroup rdbEscolha = new ButtonGroup();
		rdbEscolha.add(rdbtnIdade);
		rdbEscolha.add(rdbtnNOME);
		
		DefaultListModel ListN = new DefaultListModel();
		JList listNOME = new JList(ListN);
		listNOME.setBounds(30, 157, 106, 72);
		panel.add(listNOME);
		
		DefaultListModel ListID = new DefaultListModel();
		JList listIDADE = new JList(ListID);
		listIDADE.setBounds(223, 157, 106, 72);
		panel.add(listIDADE);
		
		JProgressBar progressBarNome = new JProgressBar();
		progressBarNome.setBounds(20, 240, 146, 14);
		panel.add(progressBarNome);
		
		JProgressBar progressBarIdade = new JProgressBar();
		progressBarIdade.setBounds(209, 240, 146, 14);
		panel.add(progressBarIdade);
		
		JButton btnIserir = new JButton("Inserir");
		btnIserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				int i = btnIserir.le);
//				int x = Integer.parseUnsignedInt(textFieldIDADE.getText());
				if(rdbtnIdade.isSelected() /*|| x > 3*/) {					
					ListID.add(0, textFieldIDADE.getText());
					progressBarIdade.setValue(100);
					progressBarIdade.setForeground(Color.BLUE);
					
				
					
				}
				if(rdbtnNOME.isSelected() /*|| x > 3*/) {
					ListN.add(0, textFieldNOME.getText());	
					progressBarNome.setValue(100);
					progressBarNome.setForeground(Color.red);
					
					
				}
								
			}
		});
		btnIserir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIserir.setBounds(335, 198, 89, 23);
		panel.add(btnIserir);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									
					ListID.add(0, "");
			
					ListN.add(0, "");			
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(335, 22, 89, 23);
		panel.add(btnClear);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel2, "name_6356485428882");
		panel2.setLayout(null);
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel2.setVisible(true);
				
				
			}
		});
		btnProximo.setBounds(335, 81, 89, 23);
		panel.add(btnProximo);
		

		

		
	
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(32, 169, 146, 28);
		panel2.add(progressBar);
		
		JSpinner spinnerDATA = new JSpinner();
		spinnerDATA.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinnerDATA.setBounds(32, 115, 146, 20);
		panel2.add(spinnerDATA);
		
		JButton btnDate = new JButton("Date");
		btnDate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = (int) spinnerDATA.getValue();
				if(i >= 9){
					progressBar.setValue(100);
					progressBar.setForeground(Color.blue);
				}				
				else if(i >=7) {
					progressBar.setValue(80);
					progressBar.setForeground(Color.DARK_GRAY);
					
				}
				else if(i >= 5) {
					progressBar.setValue(60);
					progressBar.setForeground(Color.cyan);
					
				}
				else if(i >= 3) {
					progressBar.setValue(40);
					progressBar.setForeground(Color.MAGENTA);
					
				}
				
				else {
					progressBar.setValue(20);
					progressBar.setForeground(Color.red);
					
				}
				
				
				
				
			}
		});
		btnDate.setBounds(70, 213, 89, 23);
		panel2.add(btnDate);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnVoltar.setBounds(315, 213, 89, 23);
		panel2.add(btnVoltar);
		
	
	}
}
