package aula01Fundamentos;

import javax.swing.JOptionPane;
import java.util.*;

public class If_else_Switch {
static Scanner var = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jobC, jobD;
		float c, d;
		
		jobC = JOptionPane.showInputDialog(null, "Base do triangulo usando JOption");
		c = Float.parseFloat(jobC);
		
		jobD = JOptionPane.showInputDialog(null, "Altura do triangulo usando JOption");
		d = Float.parseFloat(jobD);
		
		System.out.println("A area do triangulo � "+  (c *d ) /2);
		
		if(c < d) {
			System.out.println("O numero da var D � o maior" + d);			
		}//
		else {
			System.out.println("O numero da var C � o maior" + c);
		}// fim se
		
		System.out.println(" com switch");
		char recebe;
		if(c < d) {
			recebe =(char) d;			
		}// fim if
		else {
			recebe = (char) c;
		
		}// else		
		
		switch (recebe) { // s� aceita INT ou CHAR
		case 'c': System.out.println("O numero da Var C � o maior ");break;
		case 'd': System.out.println("O numero da Var D � o maior ");break;

		default: System.out.println("Op��o errada" );
			break;
		}// fim do switch
		
		
		
		
		

	}

}
