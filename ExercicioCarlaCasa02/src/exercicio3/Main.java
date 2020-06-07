package exercicio3;

import java.util.Scanner;



public class Main {
	public static int func = 2;
	public static  int mes = 3;
	public static ClasseCadastro funcionario [] = new ClasseCadastro[func];	
	public static ClasseCadastro salario [] = new ClasseCadastro[mes];
	public static String menu[]= {"1 Cadastro", "2 Gastos"};
	public static int op;
	public static float salarioAno  = 0;
	public static String vetor[][] = new String[func][mes];
	 static Scanner var = new Scanner(System.in);
	
	
	public static float  Salario() {
		float total= 0;
		total = salarioAno;
		
		return total;
		}			
	
	public static float Media() {
		float total= Salario() / mes;
		return total;
	}// fim Media
	
	
	

	public static void main(String[] args) {
		
		do {
			System.out.println("Digite 1 das opções do Menu ");
			for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}
			op = var.nextInt();
			switch (op) {
			case 1:
				for (int i = 0; i < funcionario.length; i++) {
					salarioAno = 0;
					funcionario[i] = new ClasseCadastro();
					System.out.println(" Digite o nome do "+ (i+1) +" º Funcionario");
					var.nextLine();
					funcionario[i].setNome(var.nextLine());
					for (int j = 0; j < salario.length; j++) {
						salario[j] = new ClasseCadastro();
						System.out.println(" Digite o " + (j+1) +" º  Salario");
						salario[j].setSalario(var.nextFloat());
						salarioAno+= salario[j].getSalario();
						vetor[i][j]= funcionario[i].getNome();
						vetor[i][j]= Float.toString(salario[j].getSalario());
						
				}// fim do 2º for
				}// fim do 1º for
				
				break; //*           fim case  1*/
			case 2: System.out.println("Digite o  Numero do funcionario que queira saber o salario anual e a media ");
				int num = var.nextInt();
				if(num != 0 && num <= funcionario.length ) {
					for (int i = 0; i < funcionario.length; i++) {
						System.out.println("O funcionario "+ funcionario[i].getNome() + " tem o salario Anual de:  " + Salario());
						System.out.println(" A media salarial é de:  "+ Media());
						System.out.println();
					}
					
					
					
					
				}// fim do if
				else { 
					System.out.println(" Numero Errado ");
				}
				
				break;/* fim                      do case 2*/
			default: System.out.println(" Opção errada" );
				break;
			}
			
			
			
		}// fim do DO
		while(op != 0 && op < 3);
		System.out.println("Fim do programa ");
		
		

	}// fim do void

}// fim da classe 
