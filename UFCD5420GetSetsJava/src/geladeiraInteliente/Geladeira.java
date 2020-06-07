package geladeiraInteliente;

public class Geladeira {
	
	public static double Agua = 5;
	 static double Leite = 5;
	 static double Cerveja = 5;
	
	
	
	
	
	
	public double getAgua() {
		return Agua;
		
	}
	public void setAgua(double agua) {
		this.Agua = agua;
		
	}
	public double getLeite() {
		return Leite;
		
	}
	public void setLeite(double leite) {
		this.Leite = leite;
		
	}
	public double getCerveja() {
		return Cerveja;
		
	}
	public void setCerveja(double cerveja) {
		this.Cerveja = cerveja;
		
	}
	
	

	

	public static  double mRetira(double quantidade) {
		double total = 1;
		if(quantidade <= 0) {
			System.out.println("Quantidade Zerada ");
		}
		else {
			total =  quantidade -total ;
		}
		
		return total;
	}
	
	public static int mAbastece(double quantidade) {
		int total = 0;
		if(quantidade >= 5) {
			System.out.println("Quantidade Max atiginda ");
		}
		else {
			total += quantidade;
		}
		
		
		return total;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	

}// fim da classe
