package luizGetSet;

import java.util.Scanner;

public class Main {
	// dados gloabais 
	static final int MAX = 10;
	static ClasseCadastro funcionario [] = new ClasseCadastro[MAX];
	static Scanner var = new Scanner(System.in);
	static String MENU[] = {"0 - Abandonar Programa", "1 - Carregar Pessoas", "2 - Listar Pessoas", 
			"3 - Inserir Pessoas", "4 - Calcular Vencimentos", " Escolha : ",};
	static int escolha;
	static boolean acabou;
	static float salarioAno = 0;
	
	static Object INFO[][]= {
			{"Antonio", 918203784, 400.0f},	
			{"Debora",  918203780, 600.0f},
			{"Juan",    918203789, 500.0f},
			{"Luiz",    918203700, 300.0f},
			
	};// fim do Objeto
	
	static int Total = INFO.length;
	
	static String Perg[] = {
			"\n\tInsira o Nome      : ",
			"\n\tInsira o Telefone  : ",
			"\n\tInsira o Salario   : ",
			
	}; // fim do array perg
	
	static Object [] DtPss = new Object[3];
	//metodos
	
	// metodos DadosPessoa
	public static Object[] DadosPessoa(String [] st) {
		Object[] o = new Object[3];
		for (int i = 0; i < st.length; i++) {
			System.out.printf("\n\t%s", st[i]);
			o[i] = var.nextLine();	
		}
		return o;
	};// fim do dadospessoas
	
	//Metodo InserirPessoa
	public static int InserirPessoa(Object [] o, ClasseCadastro[] f, int q) {
		//dados locais
		int ttpss = q;
		f[ttpss] = new ClasseCadastro((String) o[0], Integer.valueOf((String) o[1]), 
				Float.valueOf((String) o[2]));
		ttpss +=1;
		return ttpss;		
	};// end do Inserior
	
	// metodo QuantosMesecalculo
	public static int QuantosMesesCalculo(String st) {
		// dados locais
		int qual = 0;
		System.out.printf("%s", st);
		qual = var.nextInt();		
		return qual;		
	}// end
	
	//metods carregarPessoas
	public static ClasseCadastro[] CarregarPessoas(Object[][] o) {
		ClasseCadastro f [] = new ClasseCadastro[MAX];
		for (int i = 0; i < o.length; i++) {
			f[i] = new ClasseCadastro((String) o[i][0], (Integer) o[i][1],(Float) o[i][2]);
		}	
		System.out.printf("\n\tPessoas carregadas : %d\n\n", o.length);
		return f;
	};// fim da carregarPessoas
	
	// metodo ListarPessoas
	public static void ListarPessoas(ClasseCadastro[] f) {
		//cabeçalho
		System.out.printf("\n\t%10s %15s %15s %15s", "Pasição", "Nome","Telefone", "Salario");
		
		//corpo da listagem
		for (int i = 0; i < f.length; i++) {
			if(f[i] != null) {
				System.out.printf("\n\t%10d %15s %15d %15.2f", i,f[i].getNome(),f[i].getTelefone(), f[i].getSalario());
				
			}
			//linha de separação
			System.out.printf("%s","\n\n");
			}		
	}// end 
	public static void ListarVencimentos(ClasseCadastro[] f, int x) {
		// cabeçalho
		System.out.printf("\n\t%10s %15s %15s %15s %15s", "Posição", "Nome", "telefone","Salario","Periodo");
		// corpo da listagem
		for (int i = 0; i < f.length; i++) {
			if(f[i] != null) {
				System.out.printf("\n\t%10d %15s %15d %15.2f %15.2f", i,f[i].getNome(),f[i].getTelefone(), f[i].getSalario(),
						f[i].getSalarioPeriodo(x));
				
			}
			//linha de separação
			System.out.printf("%s","\n\n");
		}		
	}// fim da listarveimento
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}// fim do void

}// fim da classe
