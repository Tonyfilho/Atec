package aula06Spriatesheets_RedenrizandoSpriates;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	private BufferedImage spritesheet; // nosso objeto
	public SpriteSheet(String path) {
		try {
			spritesheet = ImageIO.read(getClass().getResourceAsStream(path));
		} catch (IOException e) {//temos que por um TRY/catch por causa de erro
			
			e.printStackTrace();
		}
		
	}// end construtor
	
	public BufferedImage getSprite(int x, int y, int width, int height) {
		
		return  spritesheet.getSubimage(x, y, width, height);
		
	}// fim do metoso bufferedImage
	

}
