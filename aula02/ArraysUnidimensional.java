package aula02;

public class ArraysUnidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[3];  // decçaração do array
		/*
		 * NOmedo array:              A
		 * Tipo de dados que guarda: INT
		 * Tamanho do array:         12*/
		a[0]= 1;
		a[0]= 2;
		a[0]= 3;
		System.out.println("a[0]= "+ a[0]);
		System.out.println("a[1]= "+ a[1]);
		System.out.println("a[2]= "+ a[1]);
		System.out.println("O comprimento do array a:  "+ a.length);
		
		String mes[]= {"Janeiro","fevereiro", "Março","Abril","Maio","Junho","Julho","Agosto"
				,"Setembro", "Outubro" ,"novembro ","Dezembro"};// fim do array
		
		System.out.println();
		for (int i = 0; i < mes.length; i++) {
			String string = mes[i];
			System.out.println(mes[i]);		
			
		}// fim for
		System.out.println("O comprimento array é mes "+ mes.length);
		
		
		
	
		}// fim void
		

	}// fim da classe


