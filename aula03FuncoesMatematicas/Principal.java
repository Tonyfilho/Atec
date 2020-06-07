package aula03FuncoesMatematicas;

import javax.swing.JOptionPane;
import java.math.*;

public class Principal {
	static 	MetodoMath metodos = new MetodoMath();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**FUNÇÕES ,ETEMATICAS MATH
		 * 
		 * Math.ceil() -arredonda tipo double para inteiro
		 * Math.sqrl() -calcula a raiz quadrada
		 * Math.pow() - eleva um numero a outro 
		 * Math.random() -gera numero entre 0.0 e 1.0
		 * Math.max() - retorna maior de 2 valores
		 * Math.min() - retorna o menor valor de  2*/
		
		String snum1, snum2;
		double num1, num2;
		double num10 = 0;
		snum1 = JOptionPane.showInputDialog(null, "Digite o 1º numero ");
		snum2 = JOptionPane.showInputDialog(null, "Digite o 2º Numero ");
		num1 = Double.parseDouble(snum1);
		num2 = Double.parseDouble(snum2);
	
		
		System.out.println("O metodo Math Raiz é "+ metodos.mathRaizQuadrada(num1));
		System.out.println("O metodo Math Random é " + metodos.mathRandom(num1));
		System.out.println("O metodo Math Potencia " + metodos.mathPotencia(num1, num2));
		num10 = metodos.mathRaizQuadrada(metodos.mathRandom(metodos.mathPotencia(num1, num2)));
		
	    System.out.println("O resultado é " +num10);
		
	}// fim do main

}// fim da class
