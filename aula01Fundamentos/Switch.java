

package aula01Fundamentos;
import java.util.*;

public class Switch {
	static Scanner var = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c;
		System.out.println("Digite uma letra ");
		c = var.nextLine().charAt(0);
		switch (c) {
		case 'A':
		case 'a': System.out.println("Alfa");break;
		case 'B':
		case 'b': System.out.println("Beta");break;
		case 'C':
		case 'c': System.out.println("Charlie");break;
		case 'D':
		case 'd': System.out.println("Delta");break;			
		default: System.out.println("opção errada");
			break;
		}// fim do switch

	}

}
