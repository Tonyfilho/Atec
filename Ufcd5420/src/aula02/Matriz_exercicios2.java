package aula02;

import java.util.Random;

public class Matriz_exercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeluno = 1;
		double aluno[][]= new double [15][2];
		double media []= new double [15];
		Random ran = new Random();
		for (int i = 0; i < aluno.length; i++) {
			for (int j = 0; j < 2; j++) {
				aluno[i][j]= ran.nextInt(20);
				
				System.out.println("O numero " + (i+1) + " Valor de nota random "+ aluno[i][j]);
				media[i] = aluno[i][j] /2;
				System.out.println("A media é " + media[i]);
			if (media[i] < 10) {
					System.out.println("Reprovado");
					System.out.println(media[i]);
					
			}
			else {
				System.out.println("Aprovado");
				System.out.println(media[i]);
			}
			
			}		
			
		}
		System.out.println("A media do  aluno[7] é  " + media[6]);			
		

	}// fim void

}// fim class
