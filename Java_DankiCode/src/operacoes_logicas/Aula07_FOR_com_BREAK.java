package operacoes_logicas;

public class Aula07_FOR_com_BREAK {
	/**EXTRUTURA COM FOR + BREAK */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 0; i < 10; ++i) {
			if(i == 8) {
				num = i;
				System.out.println("\nParou no numero : " + num);
				break;				
			}// fim if	
			else {
				System.out.println("\nImprimindo o numero "+ i);
			}// fim else
		}// for

	}

}
