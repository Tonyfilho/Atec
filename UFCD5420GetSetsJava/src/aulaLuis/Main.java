package aulaLuis;
import java.lang.System.*;
import java.util.*;


public class Main {
 static Produtos leite, cerveja, manteiga;
 
	
	
	public static void main(String[] args) {
		//reserva em memoria espa�opara 1 produto semd ados
		leite = new Produtos();
		// abstecer os dados
		leite.setNome("leite");
		leite.setQuant(10);
		leite.setCusto(0.80f);
		
		//mostrar os dados
		
		System.out.println("O nome � " + leite.getNome());
		System.out.println("O nome � " + leite.getQuant());
		System.out.println("O nome � " + leite.getCusto());
		

	}// vo
}// fim class
