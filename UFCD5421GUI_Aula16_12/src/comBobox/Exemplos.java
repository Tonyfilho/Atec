package comBobox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Exemplos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplos window = new Exemplos();
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
	public Exemplos() {
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
		panel.setBounds(0, 80, 115, -70);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("NOme");
		lblNewLabel.setBounds(10, 21, 105, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBoxNome = new JComboBox();
		comboBoxNome.setModel(new DefaultComboBoxModel(new String[] {"Antonio", "Debora", "Juan", "Filho"}));
		comboBoxNome.setMaximumRowCount(4);
		comboBoxNome.setBounds(77, 21, 157, 20);
		frame.getContentPane().add(comboBoxNome);
		
		JCheckBox chckSobreNome = new JCheckBox("SobreNome");
		chckSobreNome.setBounds(108, 88, 97, 23);
		frame.getContentPane().add(chckSobreNome);
		
		JCheckBox chckIdade = new JCheckBox("Idade");
		chckIdade.setBounds(231, 88, 97, 23);
		frame.getContentPane().add(chckIdade);
		

		JCheckBox chckMasculino = new JCheckBox("Masculino");
		chckMasculino.setBounds(95, 131, 97, 23);
		frame.getContentPane().add(chckMasculino);
		
		JCheckBox chckFeminino = new JCheckBox("Feminino");
		chckFeminino.setBounds(194, 131, 97, 23);
		frame.getContentPane().add(chckFeminino);
	/*---------------------------------------------------------------CRIAÇÃO DE GRUPO DE BOTÕES --*/	
		/* -------------------------------------------Facilita a escolha de 1 ou outro */
		ButtonGroup chckGenero = new ButtonGroup();
		chckGenero.add(chckFeminino);
		chckGenero.add(chckMasculino);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxNome.getSelectedItem();
				JOptionPane.showMessageDialog(null, "Nomes: " + comboBoxNome.getSelectedItem());
				if(comboBoxNome.getSelectedItem() == "Antonio" && chckSobreNome.isSelected()  ) {
					JOptionPane.showMessageDialog(null, " TPSI ATEC ");
					if(comboBoxNome.getSelectedItem() == "Antonio" && chckSobreNome.isSelected() && chckIdade.isSelected()) {
						JOptionPane.showMessageDialog(null, "Antonio Mutiz Filho, tem 46 Anos ");			}				
					
				}
				else if (comboBoxNome.getSelectedItem() == "Debora") {
					JOptionPane.showMessageDialog(null, "TPSI ATEC 2");
					if(comboBoxNome.getSelectedItem() == "Debora" && chckSobreNome.isSelected() && chckIdade.isSelected()) {
						JOptionPane.showMessageDialog(null, "Debora Michio Mutiz , tem 39 Anos ");			}		
					
					
				}
				else if(comboBoxNome.getSelectedItem() == "Juan") {
					JOptionPane.showMessageDialog(null, "Filho de Antonio");
					if(comboBoxNome.getSelectedItem() == "Juan" && chckSobreNome.isSelected() && chckIdade.isSelected()) {
						JOptionPane.showMessageDialog(null, "Juan Victor M Mutiz , tem 12 Anos ");			}		
				}
				else if(comboBoxNome.getSelectedItem() == "Filho") {
					JOptionPane.showMessageDialog(null, "Antonio Filho Pai do Juan ");
					if(comboBoxNome.getSelectedItem() == "Filho" && chckSobreNome.isSelected() && chckIdade.isSelected()) {
						JOptionPane.showMessageDialog(null, "Antonio Mutiz Filho, tem 46 Anos, Esposa Debora M Mutiz");			}		
				}
				
				
			}
		});
		btnNewButton.setBounds(320, 17, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblIformacoes = new JLabel("Informa\u00E7\u00F5es");
		lblIformacoes.setBounds(10, 92, 73, 14);
		frame.getContentPane().add(lblIformacoes);
		
		JLabel lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setBounds(10, 135, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
	
	}
}
