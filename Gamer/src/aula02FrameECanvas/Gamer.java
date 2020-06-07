package aula02FrameECanvas;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**Canvas não é ajanela do JOGO, mas contem as propriedades que RUNNABLE usa*/
public class Gamer extends Canvas implements Runnable  { /** importarmos a classe Canvas
e implementamos o metodo runnable*/
	public static JFrame jframe; // importamos Jframe
	private final int WIDTH = 160; // largura da nossa Janela
	private final int HEIGHT = 120; // altura da janela
	private final int SCALE = 5; //a escala da janela que multiplica  o tamanho
	
	public Gamer() { // nosso construtor da classe GAMER
		this.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT* SCALE));/* importamos o 
		DIMENSION do java criando nosso OBJETO janela*/
		jframe = new JFrame("Gamer 1º Jogo"); // criamos nosso OBJETO jframe
		jframe.add(this); // Criando nosso OBJETO CANVAS, chamando pelo THIS da linha 16
		jframe.setResizable(false); // impedido que o usuario mude o tamanho da tela
		jframe.pack(); // metodo que configura  o canvas , é obrigario
		jframe.setLocationRelativeTo(null);//Isto faz com a Janela fique no centro
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /* fazendo a janela fechar quando clicarmos
		desta forma quando chamamos o METODO JFRAME.EXIT..., assim que fecharmos o programa pára, 
		este atrubuto tem um valor NUMERICO  */
		jframe.setVisible(true); // fazer a janela ficar VISÍVEL assim que começar 
		
		
	}// fim do metodo construtor
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(); // chamando nosso jogo
		
		

	}// fim da public main	
	public void run() { // metodo runnable implementado
		// TODO Auto-generated method stub
		
	}// fim metodo runnable
}// fim da class gamer
