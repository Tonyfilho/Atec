package aula04ExercicioFolha01;

public class Metodos {
	
	
      public static  float MetodoMaior (float[] n) {
		float maior = 0;

	for(int i = 0; i <= n.length -1; i++) {

	  if(n[i] >  maior) {
		maior= n[i];
	}// fim else if				
	}
	return maior;
				
	} // fim do metodo
      
      public static float MetodoMenos (float[] x) {
    	  float menor = x[0];
    	  for(int y = 0; y <= x.length -1; y ++) {    	
       	     if(menor > x[y]) {
        		  menor = x [y];
        	  }// fim elseif 
    	  }
    	
    	  return menor;
      }// fim do metodomenor	
      
      public static float MetodoSoma (float[] x) {
    	  float soma = 0;
    	  for(int i = 0; i <= x.length -1; i ++) {
    		  soma += x[i];
    	  }// fim for
    	  
    	  return soma;
      }// fim do metodo
      
      public static float MetodoMedia(float[] x) {
    	  float media = 0;
    	  for(int i = 0; i <= x.length-1 ; i ++) {
    		  media += (x[i] ) / x.length;    		
    	  }// fim for 	     
    	  
    	  return media;
      }// fim do metodos media
      
      public static float MetodoDiferenca (float x, float y) {
    	  float  diferenca = 0;
    
    	  return diferenca =  x - y;
      }// fim metodo diferença     
      
	}// fim da classe metodos
    
