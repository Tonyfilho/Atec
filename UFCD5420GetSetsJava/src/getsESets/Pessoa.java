package getsESets;

public class Pessoa {
	
	 private int Altura;
     private float[] Venc = new float[12];
     private int a = 0;

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}

	public float[] getVenc() {
		return Venc;
	}

	public void setVenc(float vencimento) {
		
		this.Venc[a] = vencimento;
		a++;
	}

	public float Somar() {
		float total = 0;
		for (int i = 0; i < Venc.length; i++) {
			total += Venc[i];	
			
		}
		
		return total;
	}// fim do imprime
	
	
	
	

}// fim da classe
