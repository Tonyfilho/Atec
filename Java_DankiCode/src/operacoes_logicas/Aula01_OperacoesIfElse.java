package operacoes_logicas;

public class Aula01_OperacoesIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mediaAluno = 70;
		String nome = "Antonio2";
		if(mediaAluno >= 70 && nome.equals("Antonio")) {
			System.out.println("Parab�ns vc foi aprovado " + nome);
			
		}// fim else
		else if (mediaAluno < 70){ 
			System.out.println("Vc foi reprovado "+ nome);
		}// fim else if	
		else {
			System.out.println("Aluno n�o encontrado ");
			
		}// fim do else
			
	}// fim do void

}// fim da classe
