package aula04ExercicioFolha01;

import javax.swing.JOptionPane;

public class Folha01 {
	static	Metodos metodo = new Metodos();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quant = 6;
		String snum ;
		float [] num = new float[quant];
	
		for(int i = 0; i <= quant -1; i ++) {
			snum = JOptionPane.showInputDialog(null, "Digite 6 numeros para nosso Vetor");
			num[i]= Float.parseFloat(snum);			
			
		}// fim do for	
		

		
		System.out.println("O valor maior � " + Metodos.MetodoMaior(num));
		System.out.println("O valor menor � " + Metodos.MetodoMenos(num));
		System.out.println("o valor maior � " + Metodos.MetodoSoma(num));
		System.out.println("O valor da media  � " + Metodos.MetodoMedia(num));
		System.out.println("A diferen�a entre o Maior e o Menor � "+ Metodos.MetodoDiferenca(Metodos.MetodoMaior(num), Metodos.MetodoMenos(num)));
		

	}//fim do void

}// fim do class
