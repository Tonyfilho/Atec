package geladeiraInteliente;

import java.util.Scanner;

public class Main {
 public static  Scanner  var = new Scanner(System.in);
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Geladeira geladeira = new Geladeira();
		 String [] menu = {"segue as opções do Menus ", "1 Quantidade no Frigorifico", "2 Quantidade Consulmida ", "3 Quantidade para Comprar2 " };
		 int opcao = 0;
		 
		 for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);				
			}// fim do for
		 
		 do { 
			 System.out.println("Digite a opção 1 mostrar, 2 consulmir , 3 usar metodos  ");
			 opcao = var.nextInt();
			 switch (opcao) {
			case 1:
				 System.out.println("Mostre  a quantidade atual na geladeira  ");
				 System.out.println("Quantidade de Leite é " + geladeira.getLeite());
				 System.out.println("Quantidade de Leite é " + geladeira.getAgua());
				 System.out.println("Quantidade de Leite é " + geladeira.getCerveja());			
				
				break;
				
			case 2: 
				 System.out.println("Escolha o produto para consulmo, 1 Agua, 2 Leite , 3 Cerveja");
				 double  total =0;
				 opcao = var.nextInt();
				 switch (opcao) {
				case 1: System.out.println(" digite a quantidade a Retirar de  Agua ");
				 total = geladeira.Agua;
				 geladeira.setAgua(var.nextDouble());
				 total -=  geladeira.getAgua() ;
				 System.out.println("A quantidade de agua é " +total);
				 geladeira.setAgua(total);
					 
					break;
				case 2: System.out.println("digite a quantidade a Retirar de Leite "); 
				total = geladeira.Leite;
				geladeira.setLeite(var.nextDouble());
				total -=  geladeira.getLeite() ;
				System.out.println("A quantidade de Leite é " +total);
				geladeira.setLeite(total);
				
				break;
				 				
				case 3: System.out.println("digite a quantidade a Retirar de Cerveja ");
				total = geladeira.Cerveja;
				geladeira.setCerveja(var.nextDouble());
				total -=  geladeira.getCerveja() ;
				System.out.println("A quantidade de Cerveja é " +total);
				geladeira.setCerveja(total);
				
				;break;

				default: System.out.println("Opção errada");
					break;
				}// fim do switch interno
				 
				
				break;
			
			case 3: System.out.println("Chamando os metodos , 1 para retirar da geladeira e 2 para adcionar na Geladeira ");
			opcao = var.nextInt();	
			switch (opcao) {			
			 case 1: System.out.println(" vc escolheu a opcao Remover, digite 1 para Agua, 2 para Leite, 3 para Cerveja ");
			 opcao = var.nextInt();
			 if(opcao == 1) {
				 System.out.println(geladeira.mRetira(geladeira.getAgua()));
			 }
			 else if(opcao == 2) {
				 System.out.println(geladeira.mRetira(geladeira.getLeite()));
			 }
			 else if(opcao == 3) {
				 System.out.println(geladeira.mRetira(geladeira.getCerveja()));
			 }
			 
				break;
			 case 2:  System.out.println("Vc escolheu a opção Adcionar ");
			  if(opcao == 1) {
				 System.out.println(geladeira.mAbastece(geladeira.getAgua()));
			 }
			 else if(opcao == 2) {
				 System.out.println(geladeira.mAbastece(geladeira.getLeite()));
			 }
			 else if(opcao == 3) {
				 System.out.println(geladeira.mAbastece(geladeira.getCerveja()));
			 }
			 
			 break; // fim do case 2 interno do adcionar
			 default: System.out.println(" Opcao errada, digite somente 1 ou 2 ");break;
					
		
			
			 
			 
			 
			}// fim do case 3
				break;

			default: System.out.println("Opção errada");
				break;
			}
			 
			 
			 
			 
			 
			
		 }// fim do do
		while(opcao != 0 && opcao <4);
		System.out.println(" fim do programa ");

	}// fim do void

}// fim da class
