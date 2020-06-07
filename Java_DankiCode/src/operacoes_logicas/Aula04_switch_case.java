package operacoes_logicas;
import java.util.*;

public class Aula04_switch_case {
	static Scanner var = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o dia da semana de 1 há 7 \n");
		int dia = var.nextInt();
		switch (dia) {
		case 1:System.out.println("Hoje é Domingo \n");break;
		case 2:System.out.println("Hoje é Segunda-Feira \n");break;
		case 3:System.out.println("Hoje é Terça-Feira\n");break;
		case 4:System.out.println("Hoje é Quarta-Feira \n");break;
		case 5:System.out.println("Hoje é Quinta-Fiera \n");break;
		case 6:System.out.println("Hoje é Sexta-Feira \n");break;
		case 7:System.out.println("Hoje é Sabado \n");break;

		default:
			throw new IllegalArgumentException("Você digitou numero errada \n " + dia);
		}

	}

}
