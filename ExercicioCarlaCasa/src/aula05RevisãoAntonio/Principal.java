package aula05RevisãoAntonio;

import java.util.Scanner;

public class Principal {
	public static int a = 2; //tamanho da agenda
	static  MetodosNovos [] agenda = new MetodosNovos[a];
	public static Scanner var = new Scanner(System.in);
	public static String menu [] = {"1 - Inserir", "2 - Alterar", "3 - Visualizar", "4 - Soma e Media", "5 - Sair"};
	public static int opcao = 0;
	
	
	public static float soma() {
		float total = 0;
		for(int i = 0; i < agenda.length; i++)
			total += agenda[i].getValor();		
		return total;
	}// fim do soma
	public static float media() {
		float total = 0;
		total = soma() / agenda.length;
		
		return total;
	}//	
	public static void main(String[] args) {
		do {
			
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);			
		}// fim do for
		System.out.println("Digite a opção do menu");
		opcao = var.nextInt();	
		switch (opcao) {
		case 1: 
			for (int i = 0; i < agenda.length; i++) {
				
				agenda[i] = new MetodosNovos();
				var.nextLine();
				System.out.println("Insirar nome");
				agenda[i].setNome(var.nextLine());
				System.out.println("Insirar Telefone");
				agenda[i].setTel(var.nextInt());
				System.out.println("Insirar Valores do Salario");
				agenda[i].setValor(var.nextFloat());
			
			}//* fim do for
			for (int i = 0; i < agenda.length; i++) {
				System.out.println("A agenda impressa é " + agenda[i].getNome() );
				System.out.println("A agenda impressa é " + agenda[i].getTel() );
				System.out.println("A agenda impressa é " + agenda[i].getValor() );
				
			}
			
			break;
		case 2: 
			System.out.println("Alteração de dados");
			System.out.println("Digite o numero do cliente, 1 ou 2");
			int a = var.nextInt();		
		
			if(a <= agenda.length) {
				
				agenda[a-1] = new MetodosNovos();
				System.out.println("Digite o novo nome do cliente da agenda ");
				agenda[a-1].setNome(var.next());
				System.out.println("Digite novo telefone do cliente da agenda ");
				agenda[a-1].setTel(var.nextInt());
				System.out.println("Digite novo salario do cliente da agenda ");
				agenda[a-1].setValor(var.nextFloat());
				
			}// fim if
				
			else {
				System.out.println(" Numero errado ");
			}// fim do else
	
			break;/* fim do case 2**/
			
		case 3:System.out.println("Digite o Numero da Agenda que quer Visualiazar");
		int b  = var.nextInt();
		if(b != 0 && b < agenda.length  ) {
			for (int i = 0; i < agenda.length; i++) {
				System.out.println("A agenda impressa é " + agenda[i].getNome() );
				System.out.println("A agenda impressa é " + agenda[i].getTel() );
				System.out.println("A agenda impressa é " + agenda[i].getValor() );
				
			}// fim for			
						
		}// fim do if
		else {
			System.out.println("Numero de agenda  errada escolha novamente");
		}// fim do else				
			break;/*            FIM DO CASE 3*/
		case 4: System.out.println("A soma dos gastos e a Média dos Gastos ");
			 System.out.println("A soma dos Gastos são:  "+ soma());
			 System.out.println("A Media dos Gastos são: " + media());
			
			break;
		default: System.out.println("Opção errada tente novamente");
			break;
		}// fim do switch		
		}// fim while
		while(opcao < 4) ;
		System.out.println("Opção errada , fim do programa ");
	}// fim do void

}// fim da class
