package aula06Spriatesheets_RedenrizandoSpriates;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Comentarios {
	
	/**Conceito de SPRITES e SPRITESHEETS*/
	/*Vmos no paint.net criaremos uma GRID 16x 16 , e estaremos aprendendo a carregar
	 * imagem no nossos jogos. Dentro de EFEITO/render/grid*/
	/**o QUE � SPRITESHEETS, � uma GRID que contem todas as imagens do nosso JOGO
	 * e SPRINTEs s�o as imagens que ficam dentro desta GRID*/
	
	/*Normalmente o programador carrega 1 imagem por VEZ na MEMORIA, mas isto n�o � profissional
	 * o que devevemos fazer � uma SPRITESHEETS e carregar parte das imagens que est�o dentro
	 * da SPRITESHEETS */
	
	/*na classe SpriteSheet
	 * 
	 * spritesheet = ImageIO.read(getClass().getResourceAsStream(path));
	 * oGETCLASS � um metodo padr�o que toda classe tem, 
	 * o getResourseAsStream(path) � para passarmos a nossa imagem, o getResourseAsStream busca
	 * o que tiver na pasta RES. 
	 * o Path �  a var que iremos instanciar nosso objeto imagem
	 * 
	 * */
  /**Na classe STRITESHEEt  linha 21
   * public BufferedImage getSprite(int x, int y, int width, int height)
   * return  spritesheet.getSubimage(x, y, width, height);
   *  temos 
   * X posi��o no eixo X
   * Y posi��o no Eixo Y
   * Width tamanho em largura
   * Height tamanho em altura   * 
   * 
   * o RETORNO � nosso objeto que � uma BUFFEEDIMAGEM somado h� um metodo que nossa dar as
   * coordenadas para a nossa imagemcom oas medidas 
   * 
   * */
	
	/*na classe gamer
	 * linha 86
	 * g.dispose();// este metodo padr�o, serve para OTIMIZA��O DO NOSSO GAMER, � classe java
	 * ele LIMPA da memoria as IMAGENS n�o USADAs, com isto nosso gamer fica mais leve
	 * 
	 * */
}
