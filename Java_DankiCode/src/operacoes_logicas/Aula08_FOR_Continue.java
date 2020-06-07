package operacoes_logicas;

import java.util.Iterator;
/**FOR COM CONTINUE	 muito usado em lista de produtos, quando se acha algo e,
 *  *continua o condigo, imagine buscar um produto que tenha desconto em um
 *  lista, pois toda a vez que achar algo, ele continue, faz o faço VOLTAR PARA FOR
 *  SEM EXECULTAR o que tem a baixo, isto é visto quando usamos o DEBUG*/
public class Aula08_FOR_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i ;
		for (i = 0; i < 10; i ++) {
			if (i == 3 || i == 6 || i == 9) {
				num = i;
				System.out.println("\n\tO continue foi ate o numero "+ num);
				continue;			
			}// fim if
//			else {
				System.out.println("\nO Numero sem o Continue é " + i);
				
//			}// fim else			
		}// fim for

	}

}
