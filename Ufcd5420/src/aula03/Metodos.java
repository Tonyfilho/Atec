package aula03;

public class Metodos {

		/**               metodos são pequenos blocos de codigo
		 * 
		 * 1 metodo pode  invocar outro metos, isto  é o que metodo1, pode executar o metodo2,
		 *  é este por sua vez pode execultar o metodo3.
		 *  >todo os metodos tem que ter OBRIGATORIAMENTE um qualificador 
		 *  PUBLIC, PRIVADO OU PROTECT 
		 *  pode ou não ter paramentros */
	
	/*tipo de METODOS */
	public  void imprime() {
		System.out.println("Ola, o primeiro metodo em java");
		
		
	}// fim do metodo
	

		/*                         *QUALIFICADOR :
		 * PUBLIC visivel em qualquer parte
		 * PRIVATE visivel apenas na propria classe
		 * PROTECT visivel pela propria class, por suas subclasses, e pela classe do
		 * mesmo pacote.	 * 
		 * 
		 * */
		/*                      TIPO DE RETORNO
		 * 
		 * É obrigatorio definir SEMPRE o tipo de RETORNO, referente ao tipo de dados
		 * METODOS que não retornam valores devem passoir a palavra VOID
		 * METODO pode ter como retorno qualquer tipo de primitivo
		 * RETURN é o comando usando para retornar
		 * */
		
			/*                    NOME DO METODO 
			 * Pode ser qualquer palavra ou frase , desde que inicie cor letra e termine ()
			 * Se for Frase, Não pode ter ESPAÇO em BRANCO.
			 * EX:
			 * public void imprime()
			 * private void imprimeFrase()
			 * protected void graveFicheiroTexto()	**/
	
		/*                        LISTA DE PARAMENTROS
		 * Trata se de  um lista de variaveis opcionais, que podem ser recebida pelo metos para
		 * tratamento.
		 * Quanto um metodo é invocado, este deve receber valores de quem o chamou.
		 * Um metodo pode ter 0,1, 2... ou mais paramentros
		 * Um mesmo metodo pode receber diferentes tipo de variaveis */
	
			/*                   MODIFICADOR
			 * O Modificador do Metodo permite espeficicar como a classe derivadas pode ou não
			 * redefinir ou alterar o metodo, e de que forma esse metodo será visivel.
			 * 
			 * 
			 * PUBLIC: O metod declarado com este moderador é publico e pode ser chamando a parti
			 * de metodos contidos wm qualquer outra classe.Esta é a condição menor de RESTRIÇÃO
			 * POSSIVEL
			 * 
			 * STATIC É usado para criação de uma VARIAVEL que poderá ser acedida por todas as 
			 * instancias de um OBJETO desta classe como variavel comum, ou seja, a VARIAVEL 
			 * criada será a mesma em todas AS INTANCIAS, a modificação ocorre em todas.
			 * 
			 * OBS: NAS DECLARAÇÕES DE METODOS AJUDAM NO ACESSO DIRETO.	
			 * sSomente é possivel acede outros metodosvariaveis que também sejam STATIC
			 * Dentro do Metodo pode definir qulquer tipo de variavel, STATIC ou não
			 * 
			 * Caso seja necessario  aceder algum metodo ou membro NÃO STATIC, é necessario
			 * criar um INSTANCIA da classe e então chamar o que quiser.
			 * **/
			
		
	

}// fim do class
