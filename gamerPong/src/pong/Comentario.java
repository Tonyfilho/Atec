package pong;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Comentario {
	/*
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyListener; implementa os eventos do teclado
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;*/
	
	
/**public class Game extends Canvas implements Runnable, KeyListener {
 *  public class Game extends Canvas implements  Runnable , como estamos usando
 * mais de um THREAD, precisamos usar o EXTEND RUNNABLE do JAVA
		
	private static final long serialVersionUID = 1L;
	public static  int WIDTH = 240; // largura da janela
	public static int HEIGHT = 120; // altura da janela
	public static int SCALE = 3; // a escala do jogo
	public BufferedImage layer = new BufferedImage(WIDTH*SCALE, HEIGHT*SCALE, BufferedImage.TYPE_INT_RGB);
	cria a nossa LAYER para renderizamos.
	
	public Player player;  // instanciando o nosso objeto player da classe Player
	
	public Game() { NOsso construtor
		this.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		player = new Player(); // iniciando no objeto Player dentro do Construtor
		
		
	}// fim do construtor

	public static void main(String[] args) {
		Game game = new Game(); instanciando a classe game
		JFrame frame = new JFrame("Jogo Pong"); é o OBJETO do java para criar JANELAS
		frame.setResizable(false); é para quando fecharmos o programa no X, eele párar o jogo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	Faz parte para fechar o programa	
		frame.add(game);
		frame.pack();
		frame.setVisible(true); o Metodo de janela, por padrão é FALSE, e por isto ele não aparece
		frame.setLocationRelativeTo(null); para janela ficar no CENTRO da TELA
		
		new Thread(game).start(); // chamando nossa THREAD que fica dentro dentro do GAME
				
		
	}// fim do main
	
	public void tick () {
		
	}// fim do metodo tick
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy(); fazendo com que seja checado se há um BufferStrategy
		if (bs == null) { // temos que criar o BufferStrategy, checar se EXITE e somente, depois ....
			this.createBufferStrategy(3); darmos um RETURN no nosso metodo, é assim que funciona
			return;
		}// fim do if // depois de feito, ele passa a funcionar.
		Graphics g = layer.getGraphics();instaciando nosso grafica, instanciando nosso objeto grafico, da nossa LAYER
		player.render(g);  mostrando o jogador
		g = bs.getDrawGraphics();
		g.drawImage(layer, 0, 0, WIDTH*SCALE, HEIGHT*SCALE, null); // chamando nossa layer
		
		bs.show();// serve para MOSTRAR na tela o que foi redenrizado
	}// fim do metodo render
	

	public void run() { inicio do nosso GAMER LOOPING simples
		while (true) {
			tick(); // chamando o metodo tick
			render();// chamando o metoso render
			try {     try /catch é obrigadorio em caso de erro de execução 
				Thread.sleep(1000/ 60); // colocando um time na redenrização 60FPS
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}// fim do construtor run	
		
	}	
	@Override
	public void keyTyped(KeyEvent e) { // metodo implementados pelo KEYLISTENERS
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {  // metodo implementados pelo KEYLISTENERS
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {  // metodo implementados pelo KEYLISTENERS
		// TODO Auto-generated method stub
		
	}	
}// fimd a classe 


////////////******************************************//////////////////////////////	
	/** na classe GAMER 
	 * 
	 * 
public class Player {
	
	public void tick() {
	Este metodo serve para cuidar da logica do jogo
		
	}// fim da classe tick
	
	public void render(Graphics g) {
	este metodo serve para manipular o render
	o Objeto Graphics é da classe AWT, é para controlarmos o nosso Grafico, e o g é a varriável
		public int x, y; // são o eixos X e Y
   public boolean right, left; // variaveis booleanas
	public void tick() {
		if(right) {
			x++;
		}// fim do if
		else if(left) {
			x--;
		}// fim do else if
		
	}// fim da classe tick
	
	public void render(Graphics g) {
		g.setColor(Color.blue);   caracteristicas de cor do nosso jogador
		g.fillRect(200, 120-10, 40, 10); caracteristicas de localização do nosso jogador
		
		
	}// fim da cclasse render
	 * */
	
	
	
	
}