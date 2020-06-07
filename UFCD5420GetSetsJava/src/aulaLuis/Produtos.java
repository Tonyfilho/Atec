package aulaLuis;

public class Produtos {
	// atributos
static	String Nome;
static 	int Quant;
static 	float Custo;

	
	
	// contrutores
	public Produtos() {
		
		
	}

	public Produtos(String nome, int quant, float custo ) {

		this.Nome = nome;
		this.Quant = quant;
		this.Custo = custo;
		
	}// fim do construtos com 3

	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setQuant(int quant) {
		this.Quant = quant;
	}
	public void setCusto(float custo) {
		this.Custo = custo;
	}

	public String getNome() {
		return Nome;
	}
	public static int getQuant() {
		return Quant;
	}
	public static float getCusto() {
		return Custo;
	}

	
	// metodo luis
	public static Produtos[]  CarregarArca(Object[][] o) {
		Produtos[] y = new Produtos[100];
		int ct = 0;
		for (Object[]x : o) {
			y[ct] = new Produtos((String) x[0],//Nome
			                    (Integer)x[1],//Quantidade,
			                    (Float)x[2]);//Float
			ct++;
		}

		//Total de produtos carregados
		System.out.printf("\n\tExistencias : %d\n",o.length);
		return y;
		}//end

	// metodo carregar a arca
	public static Produtos[] CarregarArcas(Object[][]o) {
		Produtos[] y = new Produtos[100];
		int i = 0;
		for (Object[] x: o) {
			y[i]= new Produtos((String) x[0], (Integer) x[1],(Float) x[2]);
		i++;
		}// fim for
		
		System.out.printf("\n\tExistencias : %d\n",o.length);
		return y;
	}
	
	public static void MImprime(Produtos[] x) {	
		int i = 0;

		System.out.printf("\n\t%5s  %15s %8s %8s","Pos", "Nome","Quant","Custo");
		for (Produtos y: x) {
			if(y != null) {
			System.out.printf("\n\t%5d %15s %8d %8.2f", i, y.getNome(),y.getQuant(),y.getCusto());	
			i++;	
			}// fim do if
//			System.out.println("");
		}		
	}// fim do Mimprime
	public static void Mimprime2(float x ) {
						
		System.out.println("O valor é " + x);

	}// fim ImprimeMetodo
	
		@SuppressWarnings("static-access")
		public static float MValor(Produtos[] x ) {
			float total = 0;			
			for (Produtos y : x) {
				if(y != null) {
				total = y.getQuant() * y.getCusto();
				}
		}// fim for		
		return total;
	}
		@SuppressWarnings("static-access")
		public static float MGtotal(Produtos[] x) {
			float total = 0;
			for (Produtos y : x) {
				if(y!= null) {
				total += y.getCusto() * y.getQuant();
				}
			}
			
			return total;
		}
	

		
	


}// fim da class
