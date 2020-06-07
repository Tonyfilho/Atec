package world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import gamerZelta.Gamer;

public class Tile {

	public static BufferedImage TILE_FLOOR = Gamer.spritesheet.getSpriteSheet(0, 0, 16, 16);
	public static BufferedImage TILE_WALL = Gamer.spritesheet.getSpriteSheet(16, 0, 16, 16);
	private BufferedImage sprite;
	private int x, y;
	 
	public Tile(int x, int y, BufferedImage sprite) {
		this.x = x;
		this.y= y;
		this.sprite = sprite;
		
		
	}// fim do construtor
	
	public void render(Graphics g) {
		g.drawImage(sprite, x - Camera.x, y - Camera.y,null);
		
	}// fim do render
	
}
