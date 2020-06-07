package exerciciosFolha1;

import java.util.Scanner;

public class Metodos {
	static Scanner var = new Scanner(System.in);
	
	public static float num1 = 0;
	public static float num2 = 0;
	

   public static void mostra() {
	   System.out.println("\nO Valores são: ");
	   
   }// fim do motrs
	
	public static float maior (float[] x) {
		float maior = x[0];
		for(int i = 0; i < x.length; i++) {
			if(maior < x[i]) {
				maior = x[i];
			}// fim do if
		}// fim do for	
		
		return  maior;		
	}// fim do metodo maior
	
	public static float menor(float[] x) {
		float menor = x[0];
		for(int i = 0; i < x.length; i++) {
			if(menor > x[i]) {
			menor = x[i];	
			}// fim do if			
		}// fim do for	
		return menor;
	}// fim do metodo menor
	public static float soma(float[] x) {
		float total = 0;
		for(int i = 0; i < x.length; i++) {
			total += x[i];
		}// fim do for		
		return total;
	}// fim do metodo soma
	public static float media(float[] x) {
		float totalM = 0;
		for(int i = 0; i < x.length; i++) {
			totalM += x[i] / x.length;
		}// fim do for		
		return totalM;
	}// fim do metodo media
	public static  float diferenca(float x, float y) {
		float total = 0;
		return total = x - y;
	}// fim do metodo diferença
	

}// fim da classe
