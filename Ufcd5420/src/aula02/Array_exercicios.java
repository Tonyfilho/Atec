package aula02;

import java.util.Scanner;

public class Array_exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario [] = new double [12];
		double media =0, somatorio = 0;
		
		Scanner var = new Scanner(System.in);
		System.out.println("Digite o valor dos 12 vencimentos ");
		for (int i = 0; i < salario.length; i++) {
			salario [i]= var.nextDouble();	
			media += salario[i] /12;
			somatorio += salario[i];
			
			
		}// fim for 
		System.out.println("A media salarial é "+ media);
		System.out.println("somatorio salarial  é "+ somatorio);
		
		double meses = 0;
		meses = salario[7] + salario[11];
		System.out.println("A a soma  dos 2 salarios agosto e dezembro  são  "+ meses);
		
		

	}

}
