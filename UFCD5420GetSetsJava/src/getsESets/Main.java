package getsESets;

import java.util.Scanner;

public class Main {
	static Scanner var = new Scanner(System.in);

  static Inicializar inicilizar = new Inicializar();
	public static void main(String[] args) {
		
		Inicializar n = new Inicializar();
		Pessoa pessoa = new Pessoa();
		float somar = 0;

		
		pessoa.setAltura(160);		
		System.out.println(pessoa.getAltura());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o vencimento");
			pessoa.setVenc(var.nextFloat());
			System.out.println("O valor do set é " + pessoa.getVenc());
			

			
			
		}
		
		System.out.println("A soma é " + pessoa.Somar());
		

		
		
		
		

	}// fim do void
}// class
