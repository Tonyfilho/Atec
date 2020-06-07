package exercicio2;

import java.util.Scanner;

public class Main {
	
	public static Scanner var  = new Scanner(System.in);
	public static ClasseAgenda agenda [] = new ClasseAgenda[2];
	public static String menu [] = {"1 Inserir dados", "2 Alterar Dados", "3 Ver Dados", "4 Ver Gastos", "5 Sair do Programa"};
	static int op ;
	
	public static float Somar() {
		float total = 0;
		for (int i = 0; i < agenda.length; i++) {
			total = agenda[i].getGastos();
		}		
		return total;
	}// fim do metodo Somar
	
	public static float Media() {
		float total = 0;
		total = Somar() / agenda.length;
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			System.out.println("Digite uma das opções abaixo: ");
			for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}
			op = var.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite as Informações da Agenda: ");
				for (int j = 0; j < agenda.length; j++) {
					agenda[j] = new ClasseAgenda();
					System.out.println("Digite o " + (j +1) +" º Nome da Agenda: ");
					agenda[j].setNome(var.next());
					System.out.println("Digite o Telefone de " + agenda[j].getNome()+ " na " + (j +1) +" º Memoria da Agenda: ");
					agenda[j].setTelefone(var.nextInt());
					System.out.println("Digite os Gastos de " + agenda[j].getNome()+ " na " + (j +1) +" º Memoria da Agenda: ");
					agenda[j].setGastos(var.nextFloat());
				}// fim do for				
				break;
			case 2: 
				System.out.println("Altere as Informações da Agenda, Digite a Posição da Memória: ");
				int a = var.nextInt();
				if(a != 0 && a <=agenda.length) {
				for (int i = 0; i < agenda.length; i++) {
					agenda[i] = new ClasseAgenda();
				}// fim for
				System.out.println("Digite o " + (a) +" º Nome da Agenda: ");
				agenda[a-1].setNome(var.next());
				System.out.println("Digite o Telefone de " + agenda[a-1].getNome()+ " na " + (a) +" º Memoria da Agenda: ");
				agenda[a-1].setTelefone(var.nextInt());
				System.out.println("Digite os Gastos de " + agenda[a-1].getNome()+ " na " + (a) +" º Memoria da Agenda: ");
				agenda[a-1].setGastos(var.nextFloat());				
				
				}// fim do if
				else {
					System.out.println("Numero da Agenda Errado");
				}// fim do else				
				break;
			case 3: 
				System.out.println(" Digite qual Numero da agenda que queira mostrar ");
				int x = var.nextInt();
				if(x != 0 && x <= agenda.length) {
					System.out.println("O " + (x) +" º Nome da Agenda: "+ agenda[x-1].getNome());
					
					System.out.println("Digite o Telefone de " + agenda[x-1].getNome()+ " na " + (x) +" º Memoria da Agenda é : "+ agenda[x-1].getTelefone());
					
					System.out.println("Digite os Gastos de " + agenda[x-1].getNome()+ " na " + (x) +" º Memoria da Agenda: é " +	agenda[x-1].getGastos());
								
				}// fim do if
				else {
					System.out.println("Numero da Agenda Errado");
				}// fim do else				
				break; /*fim do Case 3**/
			case 4:
				System.out.println("A Soma gastos totais são " + Somar());
				System.out.println("A Media dos Gasto são " + Media());		
				
				break;

			default:
				break;
			}
			
		}// fim do DO
		while(op != 0 && op < 4);
		System.out.println("Fim do Programa ");
	}// fim da void

}// fim da class
