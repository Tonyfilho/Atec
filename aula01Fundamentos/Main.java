package aula01Fundamentos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10, y = 20; //declaração de variaveis  inteiro
		double dolar = 2.62;
		System.out.println(x);
		System.out.println(y);
		System.out.println(dolar);
		String valor = JOptionPane.INPUT_VALUE_PROPERTY;
		JOptionPane.showMessageDialog(null, dolar);
		
		String s = JOptionPane.showInputDialog(null, "Uma palavra: ");
		System.out.println("String " + s);
		System.out.println("String em maiusculas " + s.toUpperCase());
		System.out.println("String em minuscula  " + s.toLowerCase());
		System.out.println("comprimento String " + s.length());
		System.out.println("primeiro caracter String "+ s.charAt(0));
		System.out.println("Segundo caracter String + " + s.charAt(2));
		System.out.println("terceiro caracter String " + s.charAt(3));
		
		
		
		
		

	}

}
