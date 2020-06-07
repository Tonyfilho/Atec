import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Event;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Cafeteria {

	private JFrame frame;
	private JTextField textFieldTela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafeteria window = new Cafeteria();
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
	
	public static double bolos = 0;
	public static double cafe = 0;
	public static double total = bolos + cafe;
	
	public Cafeteria() {
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
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, "name_7687683372208");
		panel.setLayout(null);
		
		JPanel panelCafe = new JPanel();
		panelCafe.setBackground(Color.BLUE);
		frame.getContentPane().add(panelCafe, "name_7693706598434");
		panelCafe.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(39, 38, 89, 25);
		panelCafe.add(lblMenu);
		
		JRadioButton rdbtnCafe = new JRadioButton("Cafe");
		rdbtnCafe.setBounds(19, 70, 109, 23);
		panelCafe.add(rdbtnCafe);
		
		JRadioButton rdbtnCapuccino = new JRadioButton("Capuccino");
		rdbtnCapuccino.setBounds(19, 115, 109, 23);
		panelCafe.add(rdbtnCapuccino);
		
		JRadioButton rdbtnCha = new JRadioButton("Ch\u00E1");
		rdbtnCha.setBounds(19, 172, 109, 23);
		panelCafe.add(rdbtnCha);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCafe.setVisible(false);
				panel.setVisible(true);
				
				
				
			}
		});
		btnMenu.setBounds(298, 172, 89, 23);
		panelCafe.add(btnMenu);
		
		JPanel panelBolos = new JPanel();
		panelBolos.setBackground(Color.GREEN);
		frame.getContentPane().add(panelBolos, "name_7699580108038");
		panelBolos.setLayout(null);
		
		JRadioButton rdbtnBolaBerlim = new JRadioButton("Bola Berlim");
		rdbtnBolaBerlim.setBounds(26, 80, 109, 23);
		panelBolos.add(rdbtnBolaBerlim);
		
		JRadioButton rdbtnPastelNatas = new JRadioButton("Pastel Natas");
		rdbtnPastelNatas.setBounds(26, 119, 109, 23);
		panelBolos.add(rdbtnPastelNatas);
		
		JRadioButton rdbtnPiramede = new JRadioButton("Piramede");
		rdbtnPiramede.setBounds(26, 162, 109, 23);
		panelBolos.add(rdbtnPiramede);
		
		JLabel lblBolos = new JLabel("Bolos");
		lblBolos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBolos.setBounds(26, 34, 120, 14);
		panelBolos.add(lblBolos);
		  /*                                       GRUPO  DO CAFE                      */
		ButtonGroup lblCafe = new ButtonGroup();
		lblCafe.add(rdbtnCafe);
		lblCafe.add(rdbtnCha);
		lblCafe.add(rdbtnCapuccino);
		
		ButtonGroup lblBolos1 = new ButtonGroup();
		lblBolos1.add(rdbtnPiramede);
		lblBolos1.add(rdbtnPastelNatas);
		lblBolos1.add(rdbtnBolaBerlim);
		
		JButton btnMenuBolos = new JButton("Menu");
		btnMenuBolos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelBolos.setVisible(false);
				panel.setVisible(true);
				
				
			}
		});
		btnMenuBolos.setBounds(291, 162, 89, 23);
		panelBolos.add(btnMenuBolos);
		
		JButton btnCafe = new JButton("Cafe");
		btnCafe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCafe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panelCafe.setVisible(true);
			
				
				
			}
		});
		btnCafe.setBounds(46, 33, 89, 23);
		panel.add(btnCafe);
		

		
		textFieldTela = new JTextField();
		textFieldTela.setBounds(67, 115, 255, 66);
		panel.add(textFieldTela);
		textFieldTela.setColumns(10);
		
		JButton btnBolos = new JButton("Bolos");
		btnBolos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelBolos.setVisible(true);
				
				
			}
		});
		btnBolos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBolos.setBounds(253, 33, 89, 23);
		panel.add(btnBolos);
		
		JCheckBox chckIva = new JCheckBox("Pre\u00E7o  IVA");
		chckIva.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckIva.setBounds(85, 213, 97, 23);
		panel.add(chckIva);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (lblCafe.getSelection() !=null) {
					textFieldTela.setText("");

					if(rdbtnCafe.isSelected() || rdbtnCapuccino.isSelected() || rdbtnCha.isSelected()) {
						cafe = 0.60;
						textFieldTela.setText(textFieldTela.getText()+" O valores  Bebida são:  " + String.valueOf(cafe));					
						
						
						 if(chckIva.isSelected()) {
							 textFieldTela.setText(null);
							 cafe = (0.60 * 0.23) + 0.60;
							textFieldTela.setText(textFieldTela.getText()+" Valor com IVa são:  " + String.valueOf(cafe));	
								
						}
					}// fim if				
					
				}// fim do 1 º if
				
				 if(lblBolos1.getSelection() !=null) {
					textFieldTela.setText("");
					if(rdbtnPiramede.isSelected() || rdbtnPastelNatas.isSelected() || rdbtnBolaBerlim.isSelected()) {
						bolos = 0.70;
						textFieldTela.setText(textFieldTela.getText()+" O valores Bolos são:  " + String.valueOf(bolos));							
						
						 if(chckIva.isSelected()) {
							 textFieldTela.setText("");
							bolos = (0.70 * 0.23) + 0.70;
							textFieldTela.setText(textFieldTela.getText()+" Valor com IVa são:  " + String.valueOf(bolos));	
								
						}
					}// fim if						
					
				}// else if
				
				  if(lblBolos1.getSelection() !=null && lblCafe.getSelection() != null) {
					textFieldTela.setText("");					

					  total =  0.70 +  0.60;
						textFieldTela.setText(textFieldTela.getText()+" O valores são:  " + String.valueOf(total));							
						
						 if(chckIva.isSelected()) {
							 textFieldTela.setText(null);
							total = ((0.70 * 0.23) + 0.70) + ((0.60 * 0.23) + 0.60);
							textFieldTela.setText(textFieldTela.getText()+" Valor com IVa são:  " + String.valueOf(total));	
								
						}

					
					
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTotal.setBounds(296, 213, 89, 23);
		panel.add(btnTotal);
		
		JButton btnLimpa = new JButton("Limpa");
		btnLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cafe = 0;
				bolos = 0;
				textFieldTela.setText("");
			
				
				
				
			}
		});
		btnLimpa.setBounds(365, 35, 59, 23);
		panel.add(btnLimpa);
		
		
		
		
	}
}
