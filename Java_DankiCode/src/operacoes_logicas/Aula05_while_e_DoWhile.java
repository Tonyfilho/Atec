package operacoes_logicas;

public class Aula05_while_e_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		while (num <= 10) {
			System.out.printf("o numero é %d\n", num);
			num ++;
			
		}// fim do while
		
		do {
			System.out.println("O numero é "+ num);
			num ++;
			
		} while (num < 20);
		
		
	}

}
