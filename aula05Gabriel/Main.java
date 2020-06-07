package aula05Gabriel;

import java.util.Scanner;

class pessoa
{
	private String nome;
	private int tel;
	private float gastos;
	
	public String getnome() {return nome;}
	public int gettel() {return tel;}
	public float getgastos() {return gastos;}
	
	public void setnome (String n) {this.nome = n;}
	public void settel (int n) {this.tel = n;}
	public void setgastos (float n) {this.gastos = n;}
		
}


public class Main 
{
	public static String menu[] = {"1 - Inserir", "2 - Alterar", "3 - Visualizar", "4 - Soma e Media", "5 - Sair"};
	public static Scanner sc = new Scanner(System.in);
	public static int op;
	
	static pessoa[] pessoas = new pessoa[2];
	
	public static float somar()
	{
		  float soma = 0;
		  
		  for (int ct = 0; ct < pessoas.length; ct++)
		  {
			  soma = soma + pessoas[ct].getgastos();
		  }
		  
		  return soma;
	}
	
	public static float media()
	  {
		float media = 0;
		
	    for (int ct = 0; ct < pessoas.length; ct++)
	    {
	      media = media + pessoas[ct].getgastos();
	    }
	    
	    media = media / pessoas.length;
	    
	    return media;
	  }
	
	public static void main(String[] args)
	{
		do
		{
			for(int ct = 0; ct < menu.length; ct++)
			{
				System.out.println(menu[ct]);
			}
			op = sc.nextInt();
			
			switch(op)
			{
			case 1:
				
				for(int ct = 0; ct < pessoas.length; ct++)
				{
					pessoas[ct] = new pessoa();
					sc.nextLine();
					System.out.printf("\nInsira o seu nome: ");
					pessoas[ct].setnome(sc.nextLine());
					
					System.out.printf("Insira o seu telefone: ");
					pessoas[ct].settel(sc.nextInt());
					
					System.out.printf("Insira os seus gastos: ");
					pessoas[ct].setgastos(sc.nextFloat());
					
					System.out.printf("\n");
				}
				
				break;
				
			case 2:
				int a;
				
				System.out.printf("Introduza o numero da pessoa que deseja alterar informacao: ");
				a = sc.nextInt();
				
				if (a < pessoas.length)
				{
					sc.nextLine();
					System.out.printf("Introduza o nome da pessoa: ");
					pessoas[a-1].setnome(sc.nextLine());
					
					System.out.printf("Introduza o telefone da pessoa: ");
					pessoas[a-1].settel(sc.nextInt());
					
					System.out.printf("Introduza os gastos da pessoa: ");
					pessoas[a-1].setgastos(sc.nextFloat());
				}
				else
				{
					System.out.printf("Esse numero de pessoa nao existe!!\n\n");
				}
				break;
				
			case 3:
				for (int ct = 0; ct < pessoas.length; ct++)
				{
					System.out.printf("\nPessoa %d", ct+1 ,":");
					System.out.printf("\nO nome da pessoa: " + pessoas[ct].getnome());
					System.out.printf("\nO telefone da pessoa: " + pessoas[ct].gettel());
					System.out.printf("\nOs gastos da pessoa e: " + pessoas[ct].getgastos());
					System.out.printf("\n\n");
					
				}
				break;
			case 4:
				System.out.printf("A soma dos gastos de todas as pessoas e: " + somar());
				System.out.printf("\nA media dos gastos de todas as pessoas e: " + media());
				System.out.printf("\n\n");
				break;
			
			default: System.out.printf("Insira um numero valido!!\n");
			}
		}while(op != 5);
		
	}
}