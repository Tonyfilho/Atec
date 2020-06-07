package exercicio;

public class Calculo {
	private float Div;
	private  float Mult;
	private float Soma;
	private  float Sub;
	
	
	
	public void setDiv(float div) { 	this.Div = div;}
	public  void setMult(float mult) {this. Mult = mult;}
	public  void setSoma(float soma) { this.Soma = soma; }
	public  void setSub(float sub) { this.Sub = sub; }
	
	public  float getDiv() { return this.Div; 	}
	public  float getMult() { return this.Mult; }
	public  float getSoma() { return this.Soma; }
	public  float getSub() { return this.Sub; }
	
	public float MSoma(float n1, float n2) {
		float total = n1 + n2;		
		return total;
	}
	public static float Msub(float n1, float n2) {
		float total = n1 - n2;
		
		return total;
	}
	public static float Mdiv(float n1, float n2) {
		float total = n1 / n2;
		
		return total;
	}
	public static float MMult(float n1,  Float n2) {
		float total = n1 * n2;
		return total;
	}
	
	
	
	
	
	
	

}// fim class
