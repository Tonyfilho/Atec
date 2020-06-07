package excecoesJava;

public class Main {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 0;
		
		
		
		
		try {
			int r = a / b;
			System.out.println("O resultado  é " + r);
		} catch (Exception e) {
			System.out.println("Erro ao dividir numero por ZERO");
		}
		finally {
			System.out.println("Mesmo com Erro o Finally Imprime");
		}
		
		
		
		
	}// fim do void

}// fim da class
