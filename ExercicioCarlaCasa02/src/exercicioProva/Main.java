package exercicioProva;

import java.util.Scanner;

public class Main {
	static Scanner var = new Scanner(System.in);
	public static String MENU[] = {"1 - Inserir ", "2 - Mostrar Gastos", "3 - Sair"};
	public final static int NUM = 2;
	public final static int QUANTSAL = 3;
	public static int op = 0;
	public static  ClasseFuncionario funcionario[] = new ClasseFuncionario[NUM];
	public static ClasseFuncionario salario[]= new ClasseFuncionario[QUANTSAL];
	public static float salarioMed[] = new float[NUM];
	public static float salarioAno[][] = new float[NUM][QUANTSAL];
	public static void main(String[] args) {
		do {
			System.out.println("Digite 1 das  opções do MENU: ");
			
			for (int i = 0; i < MENU.length; i++) {
				System.out.println(MENU[i]);
			}// fim for
			op = var.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Insira os Dados do Funcionario: ");
				
				for (int i = 0; i < funcionario.length; i++) {
					funcionario[i] = new ClasseFuncionario();
					System.out.println("Digite o Nome do Funcionario :");
					funcionario[i].setNome(var.next());					
					for (int j = 0; j < salario.length; j++) {
						salario[j] = new ClasseFuncionario();
						System.out.println("Digite o Salario  do "+ (i+1)+"º Funcionario :" + funcionario[i].getNome());
						salario[j].setSalario(var.nextFloat());
						salarioAno[i][j] = salario[j].getSalario();
						salarioMed[i]+= salarioAno[i][j];				
						
					}// fim do 2º for
					
				}// fim 1º for
				
				break;/** fim do case 1*/
			case 2: 
				System.out.println("Imprimindo Salario anual e media Salarial");
				for (int i = 0; i < funcionario.length; i++) {
					for (int j = 0; j < salario.length; j++) {
						System.out.println("O salario  do " + (j+1)+ "º Mês do Funcionario "+funcionario[i].getNome()+ " é: " + salarioAno[i][j]);
						
					}
					System.out.println(" A media Salarial do funcionario " + funcionario[i].getNome()+ "é " + salarioMed[i] / QUANTSAL);
					System.out.println();
				}
				
				break;/** fim do case 1*/

			default:
				break;
			}
			
			
		}// fim do DO
		while(op != 0 && op < 4);
		System.out.println("Fim do programa");
	}// fim void

}// fim class
