package aula03Exercicios;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String snum10, snum20;
		int num10, num20;
		snum10 = JOptionPane.showInputDialog(null, "Digite um numero inteiro para Metodos");
		num10 = Integer.parseInt(snum10);
		snum20 = JOptionPane.showInputDialog(null, "Digite um numero inteiro para nosso Metodos");
		num20 = Integer.parseInt(snum20);
//		System.out.println(num20);
		
		
		ExerciciosMetodos exe = new ExerciciosMetodos();
		System.out.println("A soma � "+ exe.soma(num10, num20) );   
		System.out.println("A subtra��o � " + exe.subtracao(num10, num20));
		System.out.println("A divis�o � " + exe.divisao((double)num10, (double)num20));
		System.out.println("A multiplica��o  � "+  exe.multipicacao((double)num10, (double)num20));
		

	}

}
