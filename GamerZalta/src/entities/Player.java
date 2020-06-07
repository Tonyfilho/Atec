package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;



import gamerZelta.Gamer;
import world.Camera;
import world.World;

public class Player extends Entities { // POr ser uma Extends, precisasmos fazer um construtor
	
	public boolean right, left, up, down;
	public double speed = 0.9;
	public int dir_right = 0;
	public int dir_left = 1;
	public int dir = dir_right;
	
	private int frames = 0, maxFrames = 5, index = 0, maxIndex = 3;
	private boolean moved = false;
	private BufferedImage[] rightPlayer;
	private BufferedImage[] leftPlayer;
	public int life = 100;
	
	public Player(int x, int y, int width, int height, BufferedImage sprite) { // nosso construtor
		super(x, y, width, height, sprite); // nosso super
		 
		rightPlayer = new  BufferedImage[4];
		leftPlayer = new  BufferedImage[4];
		for (int i = 0; i < rightPlayer.length; i++) {
			rightPlayer[i]= Gamer.spritesheet.getSpriteSheet(32 +(i*16), 0, 16, 16);
		}
		for (int i = 0; i < leftPlayer.length; i++) {
			leftPlayer[i]= Gamer.spritesheet.getSpriteSheet(32 +(i*16), 16, 16, 16);
		}
		
		
	}//  fim do nosso construtor
	
	public void tick() {
		moved = false;
		if(right && World.isFree((int)(x+ speed), (int)this.getY())) {
			moved = true;
			dir = dir_right ;
			x+=speed;
		}// fim if
		else if(left && World.isFree((int)(x - speed), (int)this.getY())) {
			moved = true;
			dir = dir_left ;
			x-=speed;
		}// fim else if
		if(up && World.isFree((int)this.getX(),  (int)(y- speed))){
			moved = true;
			y-=speed;
		}// fim if
		else if(down && World.isFree((int)this.getX(),  (int)(y+ speed))) {
			moved = true;
			y+=speed;
		}// fim do else if	
		if(moved) { /* aqui é o nosso sistema de animação, com isto ele caminha com animação*/
			frames++;
			if(frames == maxFrames) {
				frames = 0;
				index++;
				if(index > maxIndex) { /*fim do sistema de animação*/
					index = 0;
				}// fim 3º if
			}// fim 2 if			
		}// fim if moded
		
		Camera.x = Camera.clamp((int) (this.getX() - (Gamer.WIDTH /2)), 0, World.WIDTH * 16 - Gamer.WIDTH); /*Fazendo a camera andar com o jogador em X**/
		Camera.y =  Camera.clamp((int) (this.getY() - (Gamer.HEIGHT /2)), 0, World.HEIGHT * 16- Gamer.HEIGHT); /*Fazendo a camera andar com o jogador em Y**/
		
		
	}// fim do tick
	
	
	
	public void render(Graphics g) {
		if(dir == dir_right) {
		g.drawImage(rightPlayer[index],(int) this.getX() - Camera.x, (int)this.getY() - Camera.y,null);
		}
		else if(dir == dir_left) {
		g.drawImage(leftPlayer[index],(int) this.getX() - Camera.x, (int)this.getY() - Camera.y,null);
		}
		
		
		
	}// metodo render do player
	
}// fim da classe
