package exerciciosFolha2Codigo;

import java.util.Scanner; 

public class Pergunta3 {  static int num1, num2, a;  static Scanner sc = new Scanner(System.in);  


	public static void main(String[] args) {   // TODO Auto-generated method stub  
		
		         int  a = 2;   
		         Le_Valores();   
		         Calcula(a, num1, num2);   
		         Mostra_Resultado();  
		         sc.close();  
}// fim do void
	public static void Le_Valores() 
	{   
		num1 = Le_Numero();   
	    num2 = Le_Numero();  
	} // fim do metodo
	
	 public static int Le_Numero() { 
	int numero;   System.out.print("Introduza um número ");   
	numero = sc.nextInt();  
	return numero; 
	}// fm do metodos
	 public static void Calcula(int a1, int n1, int n2) {
		 if (n2 >= 0) {    n2 = n2 - 1;    n1 = n2 + 2;   }   
		 else {    
			 n2 = n2 + 1;    n1 = n2 - 2;   }   
		 num2 = n2;  
		 }// fim do metodos calcula
	 public static void Mostra_Resultado() { 
		 System.out.print("num1 = " + num1 + " num2 = " + num2);
		 } /// fim do metodo Mostra
	
}// fim da classe