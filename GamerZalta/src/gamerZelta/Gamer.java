package gamerZelta;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;// classe de eventos do teclado
import java.awt.event.KeyListener;// classe de eventos do teclado
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

import entities.Enemy;
import entities.Entities;
import entities.Player;
import graficos.SpriteSheet;
import world.World;

/**Canvas não é ajanela do JOGO, mas contem as propriedades que RUNNABLE usa*/
public class Gamer extends Canvas implements Runnable, KeyListener { /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame jframe; // importamos Jframe
	private Thread thread;
	private boolean isRunning = true;
	public static final int WIDTH = 240; // largura da nossa Janela
	public static final int HEIGHT = 160; // altura da janela
	private final int SCALE = 3; //a escala da janela que multiplica  o tamanho
	private BufferedImage image;
	public static World world;
	public static Player player;
	
	public static List<Entities> entities;
	public static List<Enemy> enemies;
	public static SpriteSheet spritesheet;
	public static Random rand;
	
	
	public Gamer() { // nosso construtor da classe GAMER
		rand = new Random();
		addKeyListener(this); // chamando nosso keylistener na propria classe (THIS)
		setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT* SCALE));/* importamos o 
		DIMENSION do java criando nosso OBJETO janela*/
		initFrame();
		/*inicializando os objetos */		
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB); // fundo da nossa tela
		entities = new ArrayList<Entities>(); // iniciando o objeto ARRALIST, em um lista, pois teremos varios objetos, desde inimigos e o jogador
		enemies = new ArrayList<Enemy>();
		spritesheet = new SpriteSheet("/spriteSheet.png");// nosso spriteSheet do >Res
		player  =  new Player(0,0,16,16,spritesheet.getSpriteSheet(32, 0, 16, 16));
		entities.add(player); // add nosso jogador no jogo
		world =  new World("/level1.png");
		
	}// fim do metodo construtor
	public void initFrame() {
		jframe = new JFrame(); // criamos nosso OBJETO jframe
		jframe.add(this); // Criando nosso OBJETO CANVAS, chamando pelo THIS da linha 16
		jframe.setResizable(false); // impedido que o usuario mude o tamanho da tela
		jframe.pack(); // metodo que configura  o canvas , é obrigario
		jframe.setLocationRelativeTo(null);//Isto faz com a Janela fique no centro
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* fazendo a janela fechar quando clicarmos
		desta forma quando chamamos o METODO JFRAME.EXIT..., assim que fecharmos o programa pára, 
		este atributo tem um valor NUMERICO  */
		jframe.setVisible(true); // fazer a janela ficar VIZÍVEL assim que começar 
		
	}//fim do metodo initFrame
	/****metodo de sincronização****/
	public synchronized void start() { // metodo de su«yncronização
		thread = new Thread(this);
		isRunning = true;
		thread.start();		
	}// fim do metodo synchronized start
	public synchronized  void stop() {
		isRunning = false; // em caso de erro o progrma pára
		try { // em caso de erro  o programa da uma mensagem, um TRY
			thread.join(); 	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}// fim do catch		
	}// do metodo synchronized stop
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(); // chamando nosso jogo
		gamer.start();
	}// fim da public main	
	public void tick() {/*aqui cuida da logica*/		
		for(int i = 0; i < entities.size(); i ++) {
			Entities e = entities.get(i);
			if(e instanceof Player) {
				// estou dando tick no player
				
				
			}
			e.tick();          
		}// fim do for			
	}// metodo de tick do jogo	
	public void render() {
		/*aqui cuida dos graficos do jogo*/
		BufferStrategy bs = this.getBufferStrategy();/** isto é um seguencia de buffer que
		usamos na nossa tela para rendezirar e otimizar a tela*/
		if(bs == null) {
			this.createBufferStrategy(3);/*é indicado usar 2 ou 3 aqui como otimização*/
			return;
		}// fim do if
		Graphics g = image.getGraphics();
		g.setColor(new Color(0,0,0));
		g.fillRect(0, 0, WIDTH,HEIGHT);/*os 2 primeiros são a posição Y e X, e os 2 ultimo largura e altura*/
		world.render(g); // redenrizando nosso world
		for(int i = 0; i < entities.size(); i ++) {
			Entities e = entities.get(i);
			e.render(g);         
		}// fim do for	
//		g = bs.getDrawGraphics();
		g.setColor(Color.GREEN); // a cor da nossa letra na tela
		g.setFont(new Font ("Arial", Font.BOLD, 9)); // criando uma fonte importada
		g.drawString("1º Gamer", 200, 10);
		g = bs.getDrawGraphics();		
		
		g.drawImage(image,0,0, WIDTH*SCALE, HEIGHT*SCALE, null);//0,0 são ref aos eixo X e Y
		bs.show();
	}// fim metodo render
	public void run() { // metodo runnable implementado
		long lastTime = System.nanoTime();// pega o tempo atual do pc e tranforma em NANOSEGUNDOS,desta forma temos precisão
		double amountOfTicks = 60.0; // será igual a 60 segundos
		double ns = 1000000000 / amountOfTicks;// tempo em NANO dividido por 60 segundos
		double delta = 0;
		double frame = 0; // fazendo um debugador de tempo, em formato menos preciso, mas leve para a nossa maquina
		double time = System.currentTimeMillis();// debugador de tempo, desta forma teremos como saber se estamos rodando a 60 frames  por segundo
		requestFocus(); // fazer o  o jogo começar  sem clicar na tela
		while (isRunning) {
			long now = System.nanoTime();
			delta+= (now -lastTime) /ns; // isto vai controlar, quando teremos o 
			//intervalo para execultar a var tick, assim que der o valor de 1segundo ele execultará
			lastTime = now;
			if(delta >= 1) {
				tick();/*na logica de gamer se diz, sempre atualize antes de renderizar*/
				render();
				frame++;
				delta--;
			}// fim do if	
			if(System.currentTimeMillis() - time >= 1000) {
				System.out.println(" Fps " + frame);
				frame = 0;
				time += 1000;//System.currentTimeMillis(); // é a mesma coisa que,  time = 1000 ; milisegundos
				
			}// fim do if
		}
		stop(); // em caso de erro o programa saie do LOOP eterno, desta forma todas as THREADS irão ser paradas.
	}// fim metodo runnable
	@Override
	public void keyTyped(KeyEvent e) {
			
	}// fim keyTyped
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			// execulte o evento do teclado		
			player.right = true;
			
		}// fim do if
		else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			player.left = true;
			
		} // fim else if 
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			player.up = true;
		}// fim if
		else if(e.getKeyCode() == KeyEvent.VK_DOWN ||  e.getKeyCode() == KeyEvent.VK_S) {
			player.down = true;
			
		}// fim do else  if
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
			// execulte o evento do teclado		
			player.right = false;
			
		}// fim do if
		else if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
			player.left = false;
			
		} // fim else if 
		if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
			player.up = false;
		}// fim if
		else if(e.getKeyCode() == KeyEvent.VK_DOWN ||  e.getKeyCode() == KeyEvent.VK_S) {
			player.down = false;
			
		}// fim do else  if
		
	}
}// fim da class gamer