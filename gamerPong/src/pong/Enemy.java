package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {
	public double x, y;
	public int width;
	public int height;
	
	public  Enemy(int x, int y) {
		this.x= x;
		this.y = y;
		this.width = 40;
		this.height = 5;
		
	}// fim do construtor
	
	public void tick() {
		x+= (Game.ball.x - x  -6 )*0.7; // inteligencia do inimigo
//		Rectangle rec1 = new Rectangle((int)x, (int)y,width, hight);
		
	}// fim do tick
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x,(int) y, width, height);// temos que por o catch aqui, para parar com erro, pois este MEtodo só usa INTEIRO
		
		
	}// fim do render

}// fim da class
