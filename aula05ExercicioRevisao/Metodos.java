package aula05ExercicioRevisao;

public class Metodos {
	
	public static int somaVetor(int[] x) {
		int soma = 0;
		for(int i = 0; i < x.length; i++) {
			soma += x[i];			
		}// fim do for		
		return soma;
	}// fim do metodo somavetor
	
	public static int mediaVetor(int [] x) {
		int media = 0, total = 0;
		for(int i = 0; i < x.length; i++) {
			total+= (x[i] );
			
		}// fim do for
		    media = total / x.length;
		return media;
	}// fim do metodo MediaVetor
	
	
  
}// fim da class
