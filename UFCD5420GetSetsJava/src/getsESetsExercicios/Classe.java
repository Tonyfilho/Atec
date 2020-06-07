package getsESetsExercicios;
import java.util.Random;
public class Classe {
	Random random = new Random();
	
	String[] premio = {"Casa de Ferias", "Viagem", "Concerto"};
	
	
	public Classe() {
		for (int i = 0; i < premio.length; i++) {
			System.out.println(premio[i]);
		}	
		
	}// fim do construtor
	
	public String sorteiaPremio() {// metodo de chamar
		int posicao = random.nextInt(3);
		
		return premio[posicao];
	}
	

}
