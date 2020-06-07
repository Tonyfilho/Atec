package entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

import gamerZelta.Gamer;
import world.Camera;
import world.World;

public class Enemy extends Entities {
	private double speed = 0.7;
	private int maskx = 8, masky = 8, maskh = 10, maskw = 10;
	private int frames = 0, maxFrames = 20, index = 0, maxIndex = 1;
	private BufferedImage[] sprites;

	public Enemy(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, null);	
		sprites = new BufferedImage[2];
		sprites[0] = Gamer.spritesheet.getSpriteSheet(112, 16, 16, 16);
		sprites[1] = Gamer.spritesheet.getSpriteSheet(112+16, 16, 16, 16);
	}// fim  construtor
	
	public void tick() {
	//	if(Gamer.rand.nextInt(100) < 40) { //fazendo os inimigos terem movimento aleatorios de forma simples
		if(this.isColliddingWithPlayer() == false) {
		if((int)x < Gamer.player.getX() && World.isFree((int)(x + speed), (int)this.getY())
				&& !isCollidding((int)(x + speed), (int)this.getY())) {
			x+= speed;			
		}
		else if((int)x > Gamer.player.getX() && World.isFree((int)(x - speed), (int)this.getY())
				&& !isCollidding((int)(x - speed), (int)this.getY())) {
			x-= speed;
		}
		
		 if((int)y < Gamer.player.getY() && World.isFree((int)this.getY(), (int)( y + speed )) 
				 && !isCollidding((int)this.getX(), (int)( y + speed ))) {
			y+= speed;			
		}
		else if((int)y> Gamer.player.getY() && World.isFree((int)this.getY(), (int)( y - speed )) 
				&& !isCollidding((int)this.getX(), (int)( y - speed ))) {
			y-= speed;
		}		 
		}// fim do if this.iscollingWithPlayer
		else{
			// estamos tirando vida do player			
			if(Gamer.rand.nextInt(100) < 10) {// criando probabilidade de 10% em tirar vida
			Gamer.player.life--;
			System.out.println("Vida Perdida " + Gamer.player.life);
			}
/*			if(Gamer.player.life <= 0) {
				System.exit(1);
				System.out.println("Vida Perdida " + Gamer.player.life);
				
			}// fechando o jogo caso a vida do player acabe
*/		
			
		}// fim do else this.iscollingWithPlayer
		 
		  /* aqui é o nosso sistema de animação, com isto ele caminha com animação*/
				frames++;
			if(frames == maxFrames) {
				frames = 0;
				index++;
				if(index > maxIndex) { /*fim do sistema de animação*/
						index = 0;
				}// fim 3º if
				}// fim 2 if			
		// fim if moded
		 
		 
		
	//	}// fim do if		
	}// fim do tick
	
	public boolean isColliddingWithPlayer() {
		Rectangle enemyCurrent = new Rectangle((int)this.getX() + maskx,(int) this.getY() + masky, maskh, maskw);
		Rectangle player = new Rectangle((int)Gamer.player.getX(),(int)Gamer.player.getY(), 16,16);
		return enemyCurrent.intersects(player);
	}// fim do iscolliddingWithPlayer
	
	
	public boolean isCollidding(int xnext, int ynext) {
		Rectangle enemyCurrent = new Rectangle(xnext + maskx, ynext + masky, maskh, maskw); // permite criar retangulos invisiveis para testarmos colisões
		for (int i = 0; i < Gamer.enemies.size(); i++) {
			Enemy e = Gamer.enemies.get(i);
			if(e == this) {// estou dizendo, que se o OBJETO "e" for iqual ao atual "this"  continue
				continue;			
			}// fim if
			Rectangle targetEnemy = new Rectangle((int)e.getX() + maskx,(int)e.getY() + masky, maskh, maskw);
			if(enemyCurrent.intersects(targetEnemy)) {
				return true;
			}
			
		}// fim for
		
		return false;
	}// fim do iscollidding
	public void render(Graphics g) {
		g.drawImage(sprites[index],(int) this.getX() - Camera.x,(int) this.getY() - Camera.y, null);
		
	//	g.setColor(Color.blue);
	//	g.fillRect((int)this.getX() + maskx - Camera.x, (int)this.getY() + masky - Camera.y, maskh, maskw);
		
	}// fim do render
	

}// fim class
