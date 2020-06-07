package exerciciosFolha2;

import java.util.Scanner;

public class MetodosFolha2 {
	static Scanner var = new Scanner(System.in);
	public static float altura = 0;
	public static float  peso = 0;
	
	public static void pegaValores () {
		System.out.println("Digite a sua Altura: ");
		altura = var.nextFloat();
		System.out.println("Digite a seu Peso: ");
		peso = var.nextFloat();
		
	}// fim do metodo pegaValores

	public static float RespostaImc(float x ) {
		float imc = x;
		if(imc < 18.5) {
			System.out.println( x + " Abaixo do peso ideal:");
			return imc;
			}
		else if (imc == 18.5 && imc <= 24.9) {
			System.out.println( x + " Parabéns — peso normal! ");
			return imc;
		}
		else if (imc >= 25 && imc <= 29.9) {
			System.out.println( x + " Acima de seu peso (sobrepeso)");
			return imc;
		}
		else if (imc >= 30 && imc <= 34.9) {
			System.out.println( x + " Obesidade grau I ");
			return imc;
		}
		else if (imc >= 35 && imc <= 39.9) {
			System.out.println( x + " Obesidade grau II ");
			return imc;
		}
		else {
			System.out.println( x + " Obesidade grau III ");
			return imc;
		}		
	
	}// fim do met
	public static float imc(float peso, float altura) {
		float total = peso /(altura * altura);
		return total;
	}// fim do metodo
	
	
}
