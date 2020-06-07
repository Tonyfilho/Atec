package Prova;

public class ClasseSemMain {
	
	public static float vetor[]= {4,1,2,3,3,4};
	
	public static float Somar() {
		float total = 0;
		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}			
		return total;
	}// fim soma
	
	public static float Media() {
		float media = 0;
		media = Somar() / vetor.length;
		
		return media;
	}// fim media
	
	

}
