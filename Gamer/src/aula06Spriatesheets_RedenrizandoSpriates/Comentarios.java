package aula06Spriatesheets_RedenrizandoSpriates;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Comentarios {
	
	/**Conceito de SPRITES e SPRITESHEETS*/
	/*Vmos no paint.net criaremos uma GRID 16x 16 , e estaremos aprendendo a carregar
	 * imagem no nossos jogos. Dentro de EFEITO/render/grid*/
	/**o QUE É SPRITESHEETS, é uma GRID que contem todas as imagens do nosso JOGO
	 * e SPRINTEs são as imagens que ficam dentro desta GRID*/
	
	/*Normalmente o programador carrega 1 imagem por VEZ na MEMORIA, mas isto não é profissional
	 * o que devevemos fazer é uma SPRITESHEETS e carregar parte das imagens que estão dentro
	 * da SPRITESHEETS */
	
	/*na classe SpriteSheet
	 * 
	 * spritesheet = ImageIO.read(getClass().getResourceAsStream(path));
	 * oGETCLASS é um metodo padrão que toda classe tem, 
	 * o getResourseAsStream(path) é para passarmos a nossa imagem, o getResourseAsStream busca
	 * o que tiver na pasta RES. 
	 * o Path é  a var que iremos instanciar nosso objeto imagem
	 * 
	 * */
  /**Na classe STRITESHEEt  linha 21
   * public BufferedImage getSprite(int x, int y, int width, int height)
   * return  spritesheet.getSubimage(x, y, width, height);
   *  temos 
   * X posição no eixo X
   * Y posição no Eixo Y
   * Width tamanho em largura
   * Height tamanho em altura   * 
   * 
   * o RETORNO é nosso objeto que é uma BUFFEEDIMAGEM somado há um metodo que nossa dar as
   * coordenadas para a nossa imagemcom oas medidas 
   * 
   * */
	
	/*na classe gamer
	 * linha 86
	 * g.dispose();// este metodo padrão, serve para OTIMIZAÇÃO DO NOSSO GAMER, é classe java
	 * ele LIMPA da memoria as IMAGENS não USADAs, com isto nosso gamer fica mais leve
	 * 
	 * */
}
