package aula05exercioRevisao3;

import java.util.Scanner;

import aula04ExercicioFolha02.Metodo;

public class Principal {
  static Scanner var = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int pessoa = 2;
		 int dados = 3;
		 int op= 0, posicao = 0;
		String agenda [][] = new String [pessoa][dados];
		float teste [][] = {{2,4, 4}, {2, 4, 4} };

		Scanner var = new Scanner(System.in);
		while(op <= 3) {
		System.out.println("Digite a opção do menu abaixo ");
		System.out.println("1 Inserir ");
		System.out.println("2 Alterar ");
		System.out.println("3 Visualizar");
		op = var.nextInt();
		switch (op) {
		case 1: System.out.println("1 Inserir ");
			for (int i = 0; i < agenda.length; i++) {				
				for (int j = 0; j < agenda.length +1; j++) {
	//		System.out.println(j);
					if(j == 0) {
						System.out.println("Digite o seu nome ");
						agenda[i][j] = var.next(); 
						}// fim do if
					else if(j == 1) {
						System.out.println("Digite o seu telefone ");
						agenda[i][j] = var.next();						
					}// fim do else if
					else if(j == 2) {
						System.out.println("Digite o seu gasto ");
						agenda[i][j] = var.next();
					}// fim else if		
					
				}// fim for 2			
			}// fim for
			
			break; //////////////************** fim do case 1***************/////////////////
		case 2: 
			System.out.println("Digite 1 para alterar nome, 2 para alterar telefone, 3 para alterar valores");
			int opcao = var.nextInt();
			switch (opcao) {
			case 1: System.out.println("Digite o nome para alterarmos");			
					System.out.println("Qual cliente vai alterar  do 1 ou  2");
					 posicao = var.nextInt();
					if(posicao == 1) {
						agenda[0][0] = var.next();
					}// fim do if
					else if (posicao == 2) 
					agenda[1][0] = var.next();				
				break; // fim do altera nome
			case 2:	 System.out.println("Digite telefone para alterarmos");			
					 System.out.println("Qual a cliente deseja alterar o telefone do  1 ou 2");
					 posicao = var.nextInt();
					 if(posicao == 1) {
						 agenda[0][1] = var.next();
			}// fim do if
					 else if (posicao == 2) 
						 agenda[1][1] = var.next();
			
					 break; // fim do altera telefone
			case 3: System.out.println("Digite o gasto para alterarmos");			
			        System.out.println("Qual a cliente deseja alterar o gasto do  1 ou 2");
					 posicao = var.nextInt();
					 if(posicao == 1) {
						 agenda[0][2] = var.next();
			}// fim do if
					 else if (posicao == 2) 
						 agenda[1][2] = var.next();					
				break;

			default: System.out.println("Opção errada ");
				break;
			}// fim switch interno 
			
			
			break; //***/////////// fim  do case 2//////////////
		case 3: System.out.println("Visualização da nossa Agenda, 1 agenda Completa "
				+ "2 Somente  ver nome, 3  Somente ver Numeros, 4 Somente ver gastos ");
			opcao = var.nextInt();
			switch (opcao) {
			case 1: System.out.println(" Visualizar a Agenda completa ");
			 for (int k = 0; k < agenda.length; k++) {
				 for (int i = 0; i < agenda.length +1; i++) {
					 System.out.println(" Os dados da Agenda são : "+ agenda[k][i]);				
				}// fim for				
			}// fim for				
				break;
			case 2: System.out.println(" Visualizar Nome da Agenda ");
			    for (int i = 0; i < agenda.length; i++) {
					System.out.println("Os nomes são " + agenda[i][0]);
				}
			    
			case 3: System.out.println(" Visualizar Numero da Agenda "); 
			for (int i = 0; i < agenda.length; i++) {
				System.out.println("Os nomes são " + agenda[i][1]);
		     	}	break;
			case 4: System.out.println(" Visualizar Gastos da Agenda ");
			for (int i = 0; i < agenda.length; i++) {
				System.out.println("Os nomes são " + agenda[i][2]);
		     	} break;		
			default: System.out.println(" Opcão errada ");
				break;
			}// fim do switch interno
			
			break; /** ******** FIM DO CASE 3    */
			case 4:
				
				
				break;                        

		default: break;
		}// fim do switch		
		}// fim while
		if(op >3) {
			System.out.println("Fim do programa ");
		}
		Metodos2 metodo = new Metodos2();
		System.out.println("A media " + Metodos2.metodoMedia(teste));
		
	}// fim do void

}// fim da class
