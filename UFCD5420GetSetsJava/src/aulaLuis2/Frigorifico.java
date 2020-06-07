package aulaLuis2;

public class Frigorifico {
	
	private   float Preco;
	private  float Quant;
	private  String Nome;
	
	public Frigorifico() {
		
		
	}// fim do contrutor vazio
	
	public Frigorifico(String nome, float quant, float preco) {
		this.Preco = preco;
		this.Quant = quant;
		this.Nome = nome;
	
	}// fim do construtor com 3 paramentros

	public  void setPreco(float preco) { this.Preco = preco; }

	public void setQuant(float quant) { this.Quant = quant;	}

	public  void setNome(String nome) { this.Nome = nome;	}

	public  float getPreco() { return this.Preco;	}

	public  float getQuant() { return this.Quant;	}

	public  String getNome() { return this.Nome; 	}
	
	// metodo FrigoficoQuant
	
	public static  Frigorifico[] MFrigorifico(Object[][] m) {
		Frigorifico x[] = new  Frigorifico[100];
		int i = 0;
		for (Object[] objects : m) {
			x[i]= new Frigorifico((String) objects[0], (Float) objects[1], (Float) objects[2]);
			
			i ++;
		}
		return x;
	}
public static void  MImprime(Frigorifico [] x) {
	System.out.printf("\n\t%5s %15s  %8s %8s", "POSIÇÂO", "NOME", "QUANTIDADE", "VALOR");
	int i = 0;
	 for (Frigorifico frigorifico : x) {
		 if(frigorifico != null) {
		System.out.printf("\n\t%5d %15s %8.2f %4.2f", i, frigorifico.getNome(), frigorifico.Quant, frigorifico.Preco );
		 }// fim if
		i++;
	 }// fim for	
	}// fim do MImprime
public static void MimprimeTotais(float x) {
	System.out.println("O total é " + x);
	
}// fim do MimprimeTotais

public static float MTotProduto(Frigorifico[] x) {
	float total = 0;
	int i = 0;
	for (Frigorifico frigorifico : x) {
//		total = frigorifico[1] * frigorifico[2];
//		total = x[1] * x[2];
		total = frigorifico.getPreco() * frigorifico.getQuant();
	}
	return total;
}// fim do MTotProduto
public static float MGeral(Frigorifico x[]) {
	float total = 0;
	for (Frigorifico frigorifico : x) {
		total += frigorifico.getPreco() * frigorifico.getQuant();
	}
	
	return total;
}// fim do Mgeral
	
	
	

	
	
	
	
	

}// fim da class
