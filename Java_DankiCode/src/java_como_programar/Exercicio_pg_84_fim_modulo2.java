package java_como_programar;
import java.util.Scanner;

public class Exercicio_pg_84_fim_modulo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		int x,y,z,result,mult;
		
		System.out.printf("Digite o 1� numero %n");
		x = var.nextInt();
		System.out.printf("Digite o 2� numero %n");
		y = var.nextInt();
		System.out.printf("Digite o 3� numero %n");
		z = var.nextInt();
		result = x + y + z;
		System.out.printf("O resultado � %d%n", result);
		mult = x * y * z;
		System.out.printf("A Multiplica��o � %d%n", mult);
		
		
		
	}// fim do main 

}// fim do public
