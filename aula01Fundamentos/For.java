package aula01Fundamentos;
import java.util.*;

public class For {
	static Scanner var = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for (int i = 10; i > 0; i--) {
		System.out.println("O numero do for é " + i);
		
	}// fim for
	
	int tab, res;
	System.out.println("digite um numero para tabuada ");
	tab = var.nextInt();
	
	for (int i = 0; i <= 10; i++) {
	
		res = tab * i;

		System.out.println("A tabuada é " + res  );
	
		
	}// fim for

	}

}
