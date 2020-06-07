package aulaLuis3;

public class Carro {

	private String Nome;
	private float Quant;
	private float Preco;
	// construtores
	public Carro() {		
		
	} // fim do vazio
	
	public Carro(String nome, float quant, float preco) {
		this.Nome=nome;
		this.Quant=quant;
		this.Preco=preco;
		
	}// fim do construtor com 3 paramentros
	
	
	// sets
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public void setQuant(float quant) {
		this.Quant = quant;
	}
	public void setPreco(float preco) {
		this.Preco = preco;
	}
	//gets
	public String getNome() {
		return this.Nome;
	}
	public float getQuant() {
		return this.Quant;
	}
	public float getPreco() {
		return this.Preco;
	}
	
	// metodos
	public static Carro[] Valorcarro(Object[][] x) {
		Carro [] y = new Carro [100];
		int i = 0;
	for(Object[] object: x) {
		y[i]= new Carro((String)object[0], (Float)object[1], (Float)object[2]);
		i++;
	}
		return y;
	}// fim do metodo carro
	
	public static float MtotalProduto(Carro[] x) {
		float total=0;
		for (Carro carro : x) {
			total = carro.getQuant() * carro.getPreco();
			
		}		
		return total;
	}// Mtotal;
	
	public static float MtotalGeral(Carro[] x) {
		float total =0;
		for (Carro carro : x) {
			total += carro.Preco * carro.Quant;
			
		}
		
		return total;
	}// fim do Mtotalgeral
	
	
	
	
	
	
	
	
	
	
}// fim da class
