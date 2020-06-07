package exerciciosFolha2;

import java.util.Scanner;

public class Principal {
 static Scanner var = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, p ;
		
	
		
		MetodosFolha2 folha = new MetodosFolha2();
	
		
		MetodosFolha2.pegaValores();
		a = MetodosFolha2.altura;
		p = MetodosFolha2.peso;
		MetodosFolha2.imc(p, a);
		System.out.println(MetodosFolha2.imc(p, a));
		MetodosFolha2.RespostaImc(MetodosFolha2.imc(p, a));
	
		
		
		

	}

}
