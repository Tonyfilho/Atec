package InstanceOf;

import InstanceOf.Gamer;
import InstanceOf.Inimigo;
import InstanceOf.Player;

public class Gamer {
	private Player player;  // var de  atributos
	private Inimigo inimigo; // var de atributos

	public Gamer () {
		player = new Tipo01();/* estamos dizendo que é do tipo PLAYER, mas INTANCIANDO o tipo01
		 é por causa do EXTENDS na classe tipo01, que herdou tudo da classe PLAYER */
		if (player instanceof Tipo01) { /**Instanceof serve para verificarmos se um
		OBJETO foi atribuido */		
			System.out.println("O Objeto TIPO01 foi iniciado com sucesso");
		}
		else if(player instanceof Player) {
			System.out.println("O Objeto Player foi iniciado com sucesso");
		}
		inimigo = new Inimigo();
		
	}// sim construtor
	
	public Player getPlayer() { // o GET é usado para pegarmos INFORMAÇAO do PRIVATE
		
		return player;
	}// fim do get

	public Inimigo getInimigo() {
		
		return inimigo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer();
		 Player player =  gamer.getPlayer();
		 player.AtacarInimigo(gamer.getInimigo());
		 System.out.println(gamer.getInimigo().life);

	}// fim pub

}// fim do class gamer
