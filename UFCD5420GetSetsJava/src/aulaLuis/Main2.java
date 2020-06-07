package aulaLuis;

public class Main2 {
	static Object[][] DATA=  {
			{"Leite", 10, 0.8f},
			{"Manteiga", 1, 1.8f},
			{"Cerveja", 6, 0.85f}
		
	};
 
	
 static Produtos p[] = new Produtos[100];
 static Produtos m = new Produtos();
	public static void main(String[] args) {
		float total = 0;
		float totalGeral = 0;		
		p = Produtos.CarregarArcas(DATA);
//		Produtos.MImprime(m.CarregarArca(DATA));
		total = Produtos.MValor(p);		
		totalGeral = Produtos.MGtotal(p);
		
		
		m.Mimprime2(total);
		m.Mimprime2(totalGeral);
	    
		
		
		
		

	}// fim do void
}// fim da class
