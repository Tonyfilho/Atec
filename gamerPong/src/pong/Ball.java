package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {

	public double x, y;
	public int width;
	public int height;
	public double dx, dy;
	public double speed = 1.5; // velocidade da bola
	
	public  Ball(int x, int y) {
		this.x= x;
		this.y = y;
		this.width = 4;
		this.height = 4;
		
		dx = new Random().nextGaussian();// direção aleátoria da bola
		dy = new Random().nextGaussian();// direção aleátoria da bola
		
	}// fim do construtor
	
	public void tick() {
	 if(x+(dx*speed)+ width >= Game.WIDTH)	// teste de colisão do lado direito no X
		 dx*= -1;
	 else if(x+(dx*speed) <0) // teste de colisão do lado esquerdo no X
		  dx*= -1;
	 
	 if(y >= Game.HEIGHT)	{	 
		 System.out.println("Ponto do Computador "); 
		 new Game(); // fazendo o joga começar, caso o computador ganhe
		 return;// para resetar o jogo, basta Intanciar a classe principal,e retorna lá
		 
	 }// fim do if
		 
	 else if(y < 0) {
		 System.out.println("Ponto do Jogador "); 
		 new Game(); // fazendo o joga começar, caso o computador ganhe
		 return; // para resetar o jogo, basta Intanciar a classe principal,e retorna lá
	 } // fim else if
	 
	 Rectangle bounds = new Rectangle((int)(x + (dx*speed)),(int)(y+ (dy*speed)), width,height);
	 /*RECTANGLE é uma classa nativa do java, e pemite teste de COLISÂO **/
	 Rectangle boundsPlayer = new Rectangle(Game.player.x, Game.player.y,Game.player.width,Game.player.height);
	 Rectangle boundsEnemy = new Rectangle((int) Game.enemy.x,(int)Game.enemy.y,Game.enemy.width, Game.enemy.height);
	 
	 if(bounds.intersects(boundsPlayer)) {
		 dy*= -1;
	 }// fim do if
	 else if(bounds.intersects(boundsEnemy)) {
		 dy*= -1;
	 }// fim do else if
	
	x+= dx*speed;
	y+= dy*speed;
		
	}// fim do tick
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int)x,(int) y, width, height);// temos que por o catch aqui, para parar com erro, pois este MEtodo só usa INTEIRO
	
}// fim do render
}// fim da class
