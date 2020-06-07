package operacoes_logicas;

public class Aula02_OperadoresTernarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**operadores ternarios são para micro validação e
		 * com somente 1 linha , e ele é usado INDICADO somente para 2
		 * condições, VERDADEIRO OU FALSO, FORA DISTO MELHOR USAR O IF E ELSE IF*/
		int mediaAluno = 71;
		String resultado;
		resultado = mediaAluno > 70? "Caso MEDIA for mais que 70 Aprovado \n": 
			"Caso MEDIA seja menos que 70 reprovado \n";
		System.out.println(resultado);
		
		/** exemplo usando  INTEIROS,TEMOS QUE POR OS () */
		int subTotal = 0;
		
		int valor = mediaAluno > 70? (valor = mediaAluno ): (subTotal = mediaAluno);
		
		System.out.println(valor+ "\n");
		System.out.println(subTotal+ "\n");

	}

}
