package aula01Fundamentos;
import java.util.*;
import javax.swing.JOptionPane;

public class EntradaDados {
 static Scanner var = new Scanner(System. in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a, b, c, d;
		String jobC, jobD;
		System.out.println("Base do triangulo ");
		b = var.nextFloat();
		System.out.println("Altura do triangulo ");
		a =  var.nextFloat();
		System.out.println("Area do triangulo : " + (a  * b)/ 2);
		
		
		jobC = JOptionPane.showInputDialog(null, "Base do triangulo usando JOption");
		c = Float.parseFloat(jobC);
		
		jobD = JOptionPane.showInputDialog(null, "Altura do triangulo usando JOption");
		d = Float.parseFloat(jobD);
		
		System.out.println("A area do triangulo é "+  (c *d ) /2);
		
		
		
		
		
		

	}

}
