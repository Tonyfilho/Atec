package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import gamerZelta.Gamer;
import world.Camera;

public class Entities {
	
	 public static BufferedImage LIFEPACK_EN = Gamer.spritesheet.getSpriteSheet(6*16, 0, 16, 16);
	 public static BufferedImage WEAPON_EN = Gamer.spritesheet.getSpriteSheet(7*16, 0, 16, 16);
	 public static BufferedImage BULLET_EN = Gamer.spritesheet.getSpriteSheet(6*16, 16, 16, 16);
	 public static BufferedImage ENEMY_EN = Gamer.spritesheet.getSpriteSheet(7*16, 16, 16, 16);
	 
	protected int width, height;
	protected double  x, y;
	protected BufferedImage sprite;
	
	public Entities(int x, int y, int width, int height, BufferedImage sprite) {
		
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.sprite = sprite;	
	
		
	}// fim do metodo entities
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public void tick() {/*metodo da LOgica do gamer*/
		
		
	}// fim do metodo tick

	

	
	public void render(Graphics g) {	/*metodo de redenrizar*/
		g.drawImage(sprite, (int)this.getX() - Camera.x, (int)this.getY() - Camera.y, null);
		
	}// fim do metodo render
	
	
}
