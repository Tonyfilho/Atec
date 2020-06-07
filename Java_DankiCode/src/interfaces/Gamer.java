package interfaces;

public class Gamer {
	private Player player;  // var de  atributos
	private Inimigo inimigo; // var de atributos

	public Gamer () {
		player = new Player();
		inimigo = new Inimigo();
		
	}// sim construtor
	
	public Player getPlayer() { // o GET � usado para pegarmos INFORMA�AO do PRIVATE
		
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
