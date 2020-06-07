package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	public int x, y; // são o eixos X e Y
	public int width; 
	public int height; 
   public boolean right, left;
   public Player(int x, int y) {
	   this.x = x;
	   this.y = y;
	   this.width = 40;
	   this.height = 5;
   }// fim do nosso construtor jogador

	public void tick() {
		if(right) {
			x++;
		}// fim do if
		else if(left) {
			x--;
		}// fim do else if
		if(x+width > Game.WIDTH) // sistema de  colisão da direita
			x = Game.WIDTH -width;
		else if(x <0) // sistema de  colisão da esquerda
			x = 0;
		
		
	}// fim da classe tick
	
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
		
	}// fim da cclasse render

}
