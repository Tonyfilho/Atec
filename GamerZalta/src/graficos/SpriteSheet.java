package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	private BufferedImage spriteSheet;
	
	public SpriteSheet(String path) {
		try {
			setSpriteSheet(ImageIO.read(getClass().getResource(path)));
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}// fim do try/catch		
	}// fim do metodo Spritesheet
	
	

	public BufferedImage getSpriteSheet(int x, int y, int width, int height) {
		return spriteSheet.getSubimage(x, y, width, height);
	}

	public void setSpriteSheet(BufferedImage spriteSheet) {
		this.spriteSheet = spriteSheet;
	}

}
