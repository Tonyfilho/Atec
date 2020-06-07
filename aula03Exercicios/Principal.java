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
		System.out.println("A soma é "+ exe.soma(num10, num20) );   
		System.out.println("A subtração é " + exe.subtracao(num10, num20));
		System.out.println("A divisão é " + exe.divisao((double)num10, (double)num20));
		System.out.println("A multiplicação  é "+  exe.multipicacao((double)num10, (double)num20));
		

	}

}
