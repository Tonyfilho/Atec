package aula02;

import java.util.Scanner;

public class Matriz_exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		 double dados[][] = new double [3][2];
		 double media = 0, soma = 0;
		 String nome[] = new String[3];
		
		 for (int i = 0; i < dados.length; i++) {
			 System.out.println("Digite o nome do funcionario ");
//			 System.out.println("Debug do scanner "+ nome.hashCode());
			 nome[i]=var.nextLine();
			 
			 System.out.println("Digite Mes e o Vencimento");
			 for (int j = 0; j < dados.length-1; j++) {
				 dados[i][j]= var.nextDouble();
				 
				 
				 
				 
				
			}// fim 2 for
			
		}// fim do 1º for

	}

}
