package aula04ExercicioFolha02;

import javax.swing.JOptionPane;

public class Metodo {
	public static float total, n1 , n2 ;
	public static float pegaNumero() {
		String snum;
		float  num = 0;	
		snum = JOptionPane.showInputDialog(null, "Digite o 1º numeros para nosso Vetor");
		num = Float.parseFloat(snum);
		return 0;	
	}// fim do metodo
	
	public static float CalculoNumero(float x, float y) {
		
		if(n1 >= n2) {
			total = n1 + n2;
		return total; }
		else {
			total = n1 * n2;		
		return total;}
	}// fim do metodo
	
	public static void Printe() {
	System.out.println(" O valor é : "+ total );
		
	}// fim do metodo printe
	
	
	
	
	
	
	
}// fim da class
