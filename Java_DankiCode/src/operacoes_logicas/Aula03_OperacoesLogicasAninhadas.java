package operacoes_logicas;

public class Aula03_OperacoesLogicasAninhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 8;
		int n3 =7;
		int n4 = 10;
		int media = (n1 + n2 + n3 + n4 )/ 4	;
		/*Opera��es logicas aninhadas, s�o opera��es dentro de opera��es*/
		
		if(media > 5) {
			if(media >= 7) {
				System.out.println("Aluno Aprovado \n");
				
			}// end if alinhado
			else {
				System.out.println("Aluno em Recupera��o \n");				
			}// end else aninhado			
		}// end 1� if
		else {
			System.out.println("Aluno reprovado \n");
		}// end else final
		
		
		

	}

}
