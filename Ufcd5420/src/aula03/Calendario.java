package aula03;

import java.util.Calendar;
import java.util.Scanner;

public class Calendario {
 static Scanner var= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------CALENDAR-----------------------");
		int ano_nasc, ano_atual, retornoNasc, RetornoAtual;
		String anoNascJoption, anoAtualJotion;
		
		
		Calendar data= Calendar.getInstance();
		System.out.println("Ano de Nascimento");
		ano_nasc= var.nextInt();
		ano_atual= data.get(Calendar.YEAR);
		System.out.println(data.getTime());
		System.out.println("Tem "+ (ano_atual -ano_nasc)+ "Anos");
		if(ano_atual - ano_nasc > 18)
			System.out.println("Vc é de maior");
		else
			System.out.println("vc é de menor ");
		System.out.println("------------------------CALENDAR-----------------------");	
		
		
		
		
	}// fim do main

}// fim do class
