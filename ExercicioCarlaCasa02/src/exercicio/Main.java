package exercicio;

import java.util.Scanner;

public class Main {
	static Scanner var = new Scanner(System.in);
	static String vetorMenu[] = {"1 Inserir" , "2 Atualizar", "3 Mostrar", "4 Mostrar Gastos", "5 Sair"};
	static int opcao;
	static int tam = 2;
	static Agenda  agenda [] = new Agenda[tam];

	
	public static float SalarioAnual() {	
		float total= 0;	
		for (int i = 0; i < agenda.length; i++) {
			total += agenda[i].getSalario();
		}	
		return total;
	}// fim do SalarioAnual
	
	public static float MediaSalarial() {
		float total = 0;
		total = SalarioAnual() / agenda.length;
		return total;
	}// fim do media

	public static void main(String[] args) {
		
	  	 
		  do {
			  for(int i = 0; i < vetorMenu.length; i++) {		  
				  System.out.println(vetorMenu[i]);  		 
				  }// fim do for
			  System.out.println(" Digite uma das opções do Menu: ");
			  opcao = var.nextInt();
			  switch (opcao) {
			case 1:System.out.println(" Digite o dados da Agenda ");
			for (int i = 0; i < agenda.length; i++) {
				agenda [i] = new Agenda();
				System.out.println("Digite o Nome da "+ (i +1) + "º Memoria da Agenda ");
				agenda[i].setNome(var.next());
				System.out.println("Digite o Telefone de  " + agenda[i].getNome()+ " na "+ (i +1) + "º Memoria da Agenda ");
				agenda[i].setTel(var.nextInt());
				System.out.println("Digite o Salario de  " + agenda[i].getNome()+ " na "+ (i +1) + "º Memoria da Agenda ");
				agenda[i].setSalario(var.nextFloat());
				System.out.println("");
			}// fim for
/*			for (int i = 0; i < agenda.length; i++) {
			System.out.println(agenda[i].getNome());
			System.out.println(agenda[i].getTel());
			System.out.println(agenda[i].getSalario());
			
			}*/	break; /* FIM DO CASE 1*/
			case 2: System.out.println("Alterar dados da agenda, digite numero da Memoria da Agenda ");
			int w = var.nextInt();
		
			if(w != 0 && w <= agenda.length) {
				for (int i = 0; i < agenda.length; i++) {
					agenda [i] = new Agenda();	
				}				
				System.out.println("Digite o nome novo usuário ");
				agenda[w-1].setNome(var.next());
				System.out.println("Digite o Telefone do novo usuário ");
				agenda[w-1].setTel(var.nextInt());
				System.out.println("Digite o Salario novo usuário ");
				agenda[w-1].setSalario(var.nextFloat());
				
			}// fim do if
			else {
				System.out.println(" Numero da Agenda errado, fv tente novamente ");				
				
			}// fim else 
			break; /* FIM DO CASE 2*/	
			
			case 3:	System.out.println("Imprimindo Agenda ");	
			for (int i = 0; i < agenda.length; i++) {
				System.out.println("Digite o Nome da "+ (i +1) + "º Memoria da Agenda ");
				System.out.println(agenda[i].getNome());
				System.out.println("Digite o Telefone de  " + agenda[i].getNome()+ " na "+ (i +1) + "º Memoria da Agenda ");
				System.out.println(agenda[i].getTel());
				System.out.println("Digite o Salario de  " + agenda[i].getNome()+ " na "+ (i +1) + "º Memoria da Agenda ");				
				System.out.println(agenda[i].getSalario());
				
				};
				 break;	/* FIM DO CASE 3*/
			case 4: 
				System.out.println("A Soma do gasto total é ");
				System.out.println(SalarioAnual());
				System.out.println();
				System.out.println("A Media do Salario Anual é ");
				System.out.println(MediaSalarial());
				System.out.println();
				
				
				break;
			default: System.out.println("Opção errada, comece novamente ");
				break;
			}
		
		  }// fim do do
		  while(opcao != 0 && opcao <=4);
		  System.out.println( "Fim do programa ");
	}// fim da classe void
	

}// fim da Main
