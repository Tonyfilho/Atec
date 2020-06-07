package aula02GameLoopProfissional;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**Canvas não é ajanela do JOGO, mas contem as propriedades que RUNNABLE usa*/
public class Gamer extends Canvas implements Runnable  { /** importarmos a classe Canvas
e implementamos o metodo runnable*/
	public static JFrame jframe; // importamos Jframe
	private Thread thread;
	private boolean isRunning = true;
	private final int WIDTH = 160; // largura da nossa Janela
	private final int HEIGHT = 120; // altura da janela
	private final int SCALE = 5; //a escala da janela que multiplica  o tamanho
	
	public Gamer() { // nosso construtor da classe GAMER
		setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT* SCALE));/* importamos o 
		DIMENSION do java criando nosso OBJETO janela*/
		initFrame();
		
	}// fim do metodo construtor
	public void initFrame() {
		jframe = new JFrame("Gamer 1º Jogo"); // criamos nosso OBJETO jframe
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
		
	}// do metodo synchronized stop
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(); // chamando nosso jogo
		gamer.start();
	}// fim da public main	
	public void update() {
		/*aqui cuida da logica*/
		
	}// metodo de update do jogo	
	public void render() {
		/*aqui cuida dos graficos do jogo*/
		
	}// fim metodo render
	public void run() { // metodo runnable implementado
		long lastTime = System.nanoTime();// pega o tempo atual do pc e tranforma em NANOSEGUNDOS,desta forma temos precisão
		double amountOfTicks = 60.0; // será igual a 60 segundos
		double ns = 1000000000 / amountOfTicks;// tempo em NANO dividido por 60 segundos
		double delta = 0;
		double frame = 0; // fazendo um debugador de tempo, em formato menos preciso, mas leve para a nossa maquina
		double time = System.currentTimeMillis();// debugador de tempo, desta forma teremos como saber se estamos rodando a 60 frames  por segundo
		
		while (isRunning) {
			long now = System.nanoTime();
			delta+= (now -lastTime) /ns; // isto vai controlar, quando teremos o 
			//intervalo para execultar a var tick, assim que der o valor de 1segundo ele execultará
			lastTime = now;
			if(delta >= 1) {
				update();/*na logica de gamer se diz, sempre atualize antes de renderizar*/
				render();
				frame++;
				delta--;
			}// fim do if	
			if(System.currentTimeMillis() - time >= 1000) {
				System.out.println(" Fps " + frame);
				frame = 0;
				time = System.currentTimeMillis(); // é a mesma coisa que,  time = 1000 ; milisegundos
				
			}// fim do if
		}
		
	}// fim metodo runnable
}// fim da class gamer
