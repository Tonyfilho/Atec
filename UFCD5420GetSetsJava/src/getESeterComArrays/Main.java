package getESeterComArrays;

import java.util.Scanner;

public class Main {
	static Scanner var = new Scanner(System.in);
	static Classe classe = new Classe();
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {		
		System.out.println("Digite o Nome do Funcionario");
		classe.setNome(var.next());
		System.out.println("Digite o Mes do Salario ");
		classe.setData(var.nextInt());
		System.out.println("Digite o Valor do Salario");
		classe.setVenc(var.nextFloat());
		}
		
		classe.SalariosAno();
		classe.Total();
		
		
		
	}// fim void

}// fim class
