package operacoes_logicas;
import java.util.*;

public class Aula04_switch_case {
	static Scanner var = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o dia da semana de 1 h� 7 \n");
		int dia = var.nextInt();
		switch (dia) {
		case 1:System.out.println("Hoje � Domingo \n");break;
		case 2:System.out.println("Hoje � Segunda-Feira \n");break;
		case 3:System.out.println("Hoje � Ter�a-Feira\n");break;
		case 4:System.out.println("Hoje � Quarta-Feira \n");break;
		case 5:System.out.println("Hoje � Quinta-Fiera \n");break;
		case 6:System.out.println("Hoje � Sexta-Feira \n");break;
		case 7:System.out.println("Hoje � Sabado \n");break;

		default:
			throw new IllegalArgumentException("Voc� digitou numero errada \n " + dia);
		}

	}

}
