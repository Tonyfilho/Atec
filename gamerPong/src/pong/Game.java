package pong;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener {
		
	private static final long serialVersionUID = 1L;
	public static  int WIDTH = 240;
	public static int HEIGHT = 120;
	public static int SCALE = 3; 
	public BufferedImage layer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
	
	public static Player player;
	public static Enemy enemy;
	public static Ball ball;
	
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		this.addKeyListener(this);
		enemy = new Enemy(100,0);// (100 POSIÇÃO em X), (0 POSIÇÃO em Y)
		player = new Player(100, HEIGHT-10);
		ball = new Ball(100, (HEIGHT / 2)-2);
		
		
	}// fim do construtor

	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame("Jogo Pong");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(game);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		new Thread(game).start();
				
		
	}// fim do main
	
	public void tick () {
		player.tick();
		enemy.tick();
		ball.tick();
		
	}// fim do metodo tick
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}// fim do if
		Graphics g = layer.getGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		player.render(g);
		enemy.render(g);
		ball.render(g);
		
		g = bs.getDrawGraphics();
		g.drawImage(layer, 0, 0, WIDTH*SCALE, HEIGHT*SCALE, null);
		bs.show();
	}// fim do metodo render
	

	public void run() {
		while (true) {
			tick();
			render();
			try {
				Thread.sleep(1000/ 60);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}// fim do construtor run		
	}// fim public run


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			player.right=true;
		else if(e.getKeyCode()==KeyEvent.VK_LEFT);
			player.left=true;
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			player.right=false;
		else if(e.getKeyCode()==KeyEvent.VK_LEFT);
		    player.left=false;
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}	

}// fimd a classe 
