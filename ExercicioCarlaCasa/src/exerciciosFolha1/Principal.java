package exerciciosFolha1;

import java.util.Scanner;

public class Principal {
  static Scanner var = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float a = 0, b = 0;
      int tamanho = 5;
      float [] vetor = new float[tamanho];
      Metodos folha1 = new Metodos();
      MetodosFolha2 folha2 = new MetodosFolha2();
      System.out.println("Digite os valores do Vetor ");
      for(int i = 0; i < vetor.length; i++) {
    	  vetor[i] = var.nextFloat();    	  
      }// fim do for
      Metodos.mostra();
      System.out.printf("%f", Metodos.maior(vetor));  
      Metodos.mostra();
      System.out.printf("%f", Metodos.menor(vetor));
      Metodos.mostra();   
      System.out.println(Metodos.media(vetor));
      Metodos.mostra();
      System.out.println(Metodos.diferenca(Metodos.maior(vetor), Metodos.menor(vetor)));
   
      
      
      
      
      
	}// fim do void

}// fim da classe
