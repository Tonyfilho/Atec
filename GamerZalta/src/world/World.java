package world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import entities.*;

import gamerZelta.Gamer;

public class World {
	public static Tile [] tiles ;
	public static int WIDTH,  HEIGHT;
	public static final int TYLE_SIZE = 16;

	public World(String path) {
		try {			
			BufferedImage map = ImageIO.read(getClass().getResource(path));
			int[] pixels = new int[map.getHeight() * map.getWidth()];// tem o array com tamanho do mapa
			tiles = new Tile[map.getHeight() * map.getWidth()];
			 WIDTH = map.getWidth();
			 HEIGHT = map.getHeight();
			map.getRGB(0, 0,WIDTH, HEIGHT, pixels, 0, WIDTH);// metodo do java para pegar pixels e por o array
			for (int xx = 0; xx < map.getWidth(); xx++) {
				for (int yy = 0; yy < map.getHeight(); yy++) {
					int pixelAtual = pixels[xx +(yy*WIDTH)];
					tiles[xx + (yy *WIDTH)] = new  FloorTile(xx*16, yy*16, Tile.TILE_FLOOR);
					if(pixelAtual == 0xFF000000) {// no hexdecimal  cor preta
						// if do FLOOR
						tiles[xx + (yy *WIDTH)] = new  FloorTile(xx*16, yy*16, Tile.TILE_FLOOR);
				}//		
					else if(pixelAtual == 0xFFFFFFFF) {
						// parede
						tiles[xx + (yy *WIDTH)] = new  WallTile(xx*16, yy*16, Tile.TILE_WALL);							
					}// fim do else if
					else if(pixelAtual == 0xFF0026FF) {
						// player
						Gamer.player.setX(xx*16);
						Gamer.player.setY(yy*16);
						
					}
					else if(pixelAtual == 0XFFFF0000) {
						// enemy
						Enemy en = new Enemy(xx * 16, yy *16, 16, 16, Entities.ENEMY_EN);
						Gamer.entities.add(en);
						Gamer.enemies.add(en);
						
					}
					else if(pixelAtual == 0XFFFF6A00) {
						//weapon
						Gamer.entities.add(new Weapon(xx * 16, yy *16, 16, 16, Entities.WEAPON_EN));
					}
					else if(pixelAtual == 0XFFFF7F7F) {
						// lifepack
						Gamer.entities.add(new Lifepack(xx * 16, yy *16, 16, 16, Entities.LIFEPACK_EN));
					}
					else if(pixelAtual == 0XFFFFD800) {
						// bullet
						Gamer.entities.add(new Bullet(xx * 16, yy *16, 16, 16, Entities.BULLET_EN));
					}
		
				}//fim do for				
			}
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}
	
	public static boolean  isFree(int xNext, int yNext) {
		int x1 = xNext / TYLE_SIZE;
		int y1 = yNext /TYLE_SIZE;
		
		int x2 = (xNext + TYLE_SIZE -1) / TYLE_SIZE;
		int y2 = yNext /TYLE_SIZE;
		
		int x3 = xNext / TYLE_SIZE;
		int y3 = (yNext + TYLE_SIZE -1) / TYLE_SIZE;
		
		int x4 = (xNext + TYLE_SIZE -1) / TYLE_SIZE;
		int y4 = (yNext + TYLE_SIZE -1) / TYLE_SIZE;
		
		return !((tiles[x1 +(y1 * World.WIDTH)] instanceof WallTile) ||
				( tiles[x2 +(y2 * World.WIDTH)] instanceof WallTile) ||
				 (tiles[x3 +(y3 * World.WIDTH)] instanceof WallTile) ||
				(tiles[x4 +(y4 * World.WIDTH)] instanceof WallTile));
	}
	
	public void render(Graphics g){
		int xstart = Camera.x >> 4; // Var para esconder a parte do mapa não usado em X
		int ystart = Camera.y >> 4; // Var para esconder a parte do mapa não usado em X
		int xfinal = xstart + (Gamer.WIDTH >> 4);
		int yfinal = ystart + (Gamer.HEIGHT >> 4);
		
		for (int xx = xstart; xx <= xfinal; xx++) {
			for (int yy = ystart; yy <= yfinal; yy++) {
				if(xx < 0 || yy < 0 || xx >= WIDTH || yy >= HEIGHT)
					continue;
				Tile tile = tiles[xx+(yy*WIDTH)];
				tile.render(g);
				
				
			}
			
			
			
		}
		
	}// fim do render
	
	

}
