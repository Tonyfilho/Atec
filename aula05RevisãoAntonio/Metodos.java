package aula05RevisãoAntonio;

public class Metodos {
	
	private String Nome;
	private int Tel;
	private float Valor;
	static int a = 10;
	static public int vetor[] = new int[a];
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		this.Tel = tel;
	}
	public float getValor() {
		return Valor;
	}
	public void setValor(float valor) {
		this.Valor = valor;
	}
	
	public static int soma() {
		int soma = 0;
		for (int i = 0; i < a ; i++) {
			soma+= vetor[i];			
		}	
		return soma;
	}// fim do metodo soma
	public static float media() {
		float media = 0;
		media = soma();
			
		
		
		return media;
	}// fim do metodo media
	

}// fim da classe
