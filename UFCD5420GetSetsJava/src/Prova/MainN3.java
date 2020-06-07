package Prova;

import java.util.Scanner;

public class MainN3 {
	public static  String MENU[] = {"1 - INSERIR", "2 - ALTERAR", "3 - IMPRIMIR", "4 - SOMAR valores de ESTOQUE", };
	public static int op;
	public static Scanner var = new Scanner(System.in);
	static ClasseN3 [] nome = new ClasseN3[3];
	static float [] estoque = new float [3];
	static float [] preco = new float [3];
	static float preco2 = 0;
	static float estoque2 = 0;

	public static float somar( float [] x,  float [] y) {
		float total = 0;
		for (int i = 0; i < y.length; i++) {
			total += x[i] * y [i];
		}
		
		
		return total;
	}// fim somar
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			do {
				System.out.println("Digite 1 das  opções do MENU: ");
				
				for (int i = 0; i < MENU.length; i++) {
					System.out.println(MENU[i]);
				}// fim for
				op = var.nextInt();
				
				switch (op) {
				case 1:
					System.out.println("Insira os Dados do nomeProd: ");
					for (int i = 0; i < nome.length; i++) {
						nome[i] = new ClasseN3();
						System.out.println("Digite o nome do produto ");
						nome[i].setNome(var.next());
						for (int j = 0; j < 1; j++) {
							System.out.println("Digite a quantidade do produto ");
							nome[j].setQuantidade(var.nextFloat());
							System.out.println("Digite o preço do produto ");
							nome[j].setValor(var.nextFloat());							
						}// fim do for pegadados
						preco[i] = nome[i].getValor();
						estoque[i] = nome[i].getQuantidade();
						preco2 += preco[1] * estoque [i];
			
					}// fim do for						
				
					break;/** fim do case 1*/
				case 2: 
					System.out.println("Alterar nome e valores ");
					for (int i = 0; i < nome.length; i++) {
						nome[i] = new ClasseN3();
						System.out.println("Digite o nome do produto para ser alterado ");
						nome[i].setNome(var.next());
						for (int j = 0; j < 1; j++) {
							System.out.println("Digite a quantidade do produto para ser alterado ");
							nome[j].setQuantidade(var.nextFloat());
							System.out.println("Digite o preço do produto para ser alterado  ");
							nome[j].setValor(var.nextFloat());							
						}// fim do for pegadados
						preco[i] = nome[i].getValor();
						estoque[i] = nome[i].getQuantidade();
						preco2 = preco[i] * estoque[i];
			
					}// fim do for				
					
					break;/** fim do case 2*/
				case 3: 
					System.out.println(" visualizar programa ");
					System.out.println("Digite o numero de 1 a 3 para visualizar ");
					int a = var.nextInt();
					if(a != 0 && a <= nome.length) {
						System.out.println("NOme do produto " + nome[a-1].getNome());
						System.out.println("NOme do Quantidade " + nome[a-1].getQuantidade());
						System.out.println("NOme do produto " + nome[a-1].getValor());
											
					}
					else {
						System.out.println(" Numero do produto errado ");
					}	
					
					break; // fim do case 3
				case 4: 
					System.out.println(" Metodo somar estoque ");
					for (int i = 0; i < nome.length; i++) {
						
						for (int j = 0; j < nome.length; j++) {
	//						System.out.println(" A soma dos valores são " + somar(preco[i], estoque[i]));
						}
						
						System.out.println(" A soma do estoque é " + preco2);
					}
					
					
					
					break; // fim do case 4

				default:
					break;
				}
				
				
			}// fim do DO
			while(op != 0 && op <= 4);
			System.out.println("Fim do programa");
		}// fim void

	}// fim class
		
		

