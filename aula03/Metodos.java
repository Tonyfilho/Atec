package aula03;

public class Metodos {

		/**               metodos s�o pequenos blocos de codigo
		 * 
		 * 1 metodo pode  invocar outro metos, isto  � o que metodo1, pode executar o metodo2,
		 *  � este por sua vez pode execultar o metodo3.
		 *  >todo os metodos tem que ter OBRIGATORIAMENTE um qualificador 
		 *  PUBLIC, PRIVADO OU PROTECT 
		 *  pode ou n�o ter paramentros */
	
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
		 * � obrigatorio definir SEMPRE o tipo de RETORNO, referente ao tipo de dados
		 * METODOS que n�o retornam valores devem passoir a palavra VOID
		 * METODO pode ter como retorno qualquer tipo de primitivo
		 * RETURN � o comando usando para retornar
		 * */
		
			/*                    NOME DO METODO 
			 * Pode ser qualquer palavra ou frase , desde que inicie cor letra e termine ()
			 * Se for Frase, N�o pode ter ESPA�O em BRANCO.
			 * EX:
			 * public void imprime()
			 * private void imprimeFrase()
			 * protected void graveFicheiroTexto()	**/
	
		/*                        LISTA DE PARAMENTROS
		 * Trata se de  um lista de variaveis opcionais, que podem ser recebida pelo metos para
		 * tratamento.
		 * Quanto um metodo � invocado, este deve receber valores de quem o chamou.
		 * Um metodo pode ter 0,1, 2... ou mais paramentros
		 * Um mesmo metodo pode receber diferentes tipo de variaveis */
	
			/*                   MODIFICADOR
			 * O Modificador do Metodo permite espeficicar como a classe derivadas pode ou n�o
			 * redefinir ou alterar o metodo, e de que forma esse metodo ser� visivel.
			 * 
			 * 
			 * PUBLIC: O metod declarado com este moderador � publico e pode ser chamando a parti
			 * de metodos contidos wm qualquer outra classe.Esta � a condi��o menor de RESTRI��O
			 * POSSIVEL
			 * 
			 * STATIC � usado para cria��o de uma VARIAVEL que poder� ser acedida por todas as 
			 * instancias de um OBJETO desta classe como variavel comum, ou seja, a VARIAVEL 
			 * criada ser� a mesma em todas AS INTANCIAS, a modifica��o ocorre em todas.
			 * 
			 * OBS: NAS DECLARA��ES DE METODOS AJUDAM NO ACESSO DIRETO.	
			 * sSomente � possivel acede outros metodosvariaveis que tamb�m sejam STATIC
			 * Dentro do Metodo pode definir qulquer tipo de variavel, STATIC ou n�o
			 * 
			 * Caso seja necessario  aceder algum metodo ou membro N�O STATIC, � necessario
			 * criar um INSTANCIA da classe e ent�o chamar o que quiser.
			 * **/
			
		
	

}// fim do class
