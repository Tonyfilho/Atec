package getESetComArrayCasa;

import java.util.Scanner;

public class Main {
static Scanner var = new Scanner(System.in);
static Metodos metodos = new Metodos();
	public static void main(String[] args) {

		for (int i = 0; i < 3;  i++) {
			System.out.println("DIgite o nome do Cliente ");
			metodos.setNome(var.next());
			System.out.println("Digite o telefone do Cliente  " + metodos.getNome());
			metodos.setTel(var.nextInt());
			System.out.println("Digite o Valor do deposito do Cliente  " + metodos.getNome());
			metodos.setSal(var.nextFloat());
		}// fim for
		System.out.println("A media de deposito são " + metodos.Media());
		System.out.println("O total anual de deposito é " + metodos.TotalAnual());
		 
		 System.out.println("Digite o Mes que queira saber o Deposito ");
		 int num = var.nextInt();
		 metodos.MesSalario(num);
		 metodos.Imprime();
		
		
		
	}// fim void

}// fim class
