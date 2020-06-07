package Prova;

import java.util.Scanner;

public class MainN4 {
 public static Scanner var= new Scanner(System.in);
	public static void main(String[] args) {
		Numero4 valor = new Numero4();
		 int num1, num2;
		 
		 System.out.println("digite o valor de num1 ");
		 num1 = var.nextInt();
		 System.out.println("digite o valor de num2 ");
		 num2 = var.nextInt();
		 
		 System.out.println("Chamando os metodos ");
		 System.out.println(" A soma dos valores são " + valor.soma(num1, num1));
		 System.out.println("O verifica dos valores são "+ valor.verificaValor(valor.soma(num1, num1)));
		

	}

}
