package poo;

public class MainJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogador jog1 = new Jogador();
		Jogador jog2 = new Jogador();
		Inimigo ini = new Inimigo();
		
		System.out.println("Começamos a jogar \n");
		jog1.iniciarJogador();
		jog2.iniciarJogador();
		ini.iniciarInimigos();
		
		
		

	}

}
