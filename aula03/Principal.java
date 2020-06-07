package aula03;

import java.util.Scanner;

import javax.swing.JOptionPane;

import aula03Exercicios.ExerciciosMetodos;

public class Principal {
 static Scanner var = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num2;
		Metodos novo = new Metodos();
		MetodoVoidComParamentro novo2= new MetodoVoidComParamentro();
		MetodoComRetorno metodoretorno = new MetodoComRetorno();
		
		novo.imprime();
		
		System.out.println("Digite a quantidade de ASTERISCOS ");
		num= var.nextInt();
		novo2.imprimeParamentro(num -1);
		
		System.out.println("Teste dos metodos com retorno");
		System.out.println("Digite o 2º Numero ");
		
		num2= var.nextInt();
		metodoretorno.aereaTriangulo(num, num2);
		metodoretorno.soma(num, num2);
		System.out.println("A soma é " + metodoretorno.soma(num, num2) + "\n A área é " + metodoretorno.aereaTriangulo(num, num2));
		
		
		double [] v= new double[20];
		for(int i = 0; i <= v.length -1; i ++) {
			v[i] = i +1;
			System.out.println("O numeros são" + v[i]);
		}
		
		
	}

}

