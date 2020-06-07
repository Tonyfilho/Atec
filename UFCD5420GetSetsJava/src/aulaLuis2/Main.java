package aulaLuis2;

import java.util.Scanner;

public class Main {
	public static Scanner var = new Scanner(System.in);
//	public static Object[][] geladeira = new Object[3][3];
	public static Object[][] geladeira = {{"Peixe", 2f, 5.50f},{"Carne", 5f , 8.5f}, {"Leite", 3f , 0.5f} };
	public static Frigorifico[] p = new Frigorifico[100];
	public static void main(String[] args) {
//		geladeira = {{"Peixe", 2f, 5.50f},{"Carne", 5f , 8.5f}, {"Leite", 3f , 0.5f} };
		
	p = Frigorifico.MFrigorifico(geladeira);
	
	Frigorifico.MImprime(p);
		
		
		
		
		

	}// fim void

}// fim class
