package getESeterComArrays;

public class Classe {
	
	public Classe() {
		
		
	}
	
	public Classe(String nome, int data, float salario ) {
		Total();
		Mes();
		SalariosAno();
		
		
	}// fim do construtor
	
	
	
	
	
	private float[] Venc = new float[12];
	private int[] Data = new int[12];
	private String[] Nome = new String[12];
	private int i = 0;
	
	
	
	public float[] getVenc() {
		return Venc;
	}
	public void setVenc(float vencimento) {
		this.Venc[i] = vencimento;
		i++;
	}
	public int[] getData() {
		return Data;
	}
	public void setData(int data) {
		this.Data[i] = data;
		i++;
	}
	public String[] getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome[i] = nome;
		i++;
	}
	
	public float Total() {
		float total = 0;
		for (int i = 0; i < Venc.length; i++) {
			total += Venc[i];
		}		
		return total;
	}
	
	public int Mes() {
		int mes = 0;
		for (int i = 0; i < Data.length; i++) {
			mes= Data[i];		
		}		
		return mes;
	}// fim do datas
	
	public void SalariosAno() {
		float salarios;
		for (int i = 0; i < Data.length; i++) {
			salarios = Venc[i];
			System.out.println("O vencimento do Mês é" + Mes() + " é "+ salarios);
		}		
		
	}// fim do metodo
	
	
	
	

}// fim da class
