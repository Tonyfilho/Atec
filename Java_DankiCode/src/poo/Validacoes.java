package poo;

import java.util.*;

public class Validacoes {
	static Scanner var = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = rand.nextInt(100);
		String nome, opcao, escolha;
		System.out.println("Digite o seu nome \n");
		nome = var.nextLine();
		System.out.println("\n\tBenvindo " + nome);
		System.out.println("Digite a op��o do Jogo caso queira avan�ar"
				+ "\n(w) avan�ar, \n(a) virar a esquerda, \n(d) Virar a Direita"
				+ "\n(s) Recuar ");
		opcao = var.nextLine();
		if (opcao.equalsIgnoreCase("w")) {
			System.out.println("Vc escolheu Avan�ar \n");
			System.out.println("Apareceu um inimigo, escolha (a) Atacar ou (r) Correr \n ");
			escolha = var.nextLine();
			switch (escolha) {
			case "a":
			case "A": System.out.println("vc escolheu atacar \n");
			if (num < 75) {
				System.out.println("Vc ganhou \n");					
			}
			else {
				System.out.println("Vc perdeu \n");
			}
			break;
			case "r":
			case "R": System.out.println("Vc escolheu correr \n");
			if (num < 75) {
				System.out.println("Vc fugiu e sobre viveu \n");				
			}
			else {
				System.out.println("Vc perdeu fim do jogo \n");
			}break;		

			default:
				throw new IllegalArgumentException("Vc escolheu op��o errada \n" + escolha);
			}// fim do switch
	//******************************fim do 1 stage*******************************
		}
		else if (opcao.equalsIgnoreCase("a")) {
			System.out.println("Vc escolheu Virar a Esquerda \n");
			System.out.println("Apareceu um inimigo, escolha (a) Atacar ou (r) Correr \n ");
			escolha = var.nextLine();
			switch (escolha) {
			case "a":
			case "A": System.out.println("vc escolheu atacar \n");
			if (num < 75) {
				System.out.println("Vc ganhou \n");					
			}
			else {
				System.out.println("Vc perdeu  fim do jogo \n");
			}
			break;
			case "r":
			case "R": System.out.println("Vc escolheu correr \n");
			if (num < 75) {
				System.out.println("Vc fugiu e sobre viveu \n");				
			}
			else {
				System.out.println("Vc perdeu fim do jogo \n");
			}break;		

			default:
				throw new IllegalArgumentException("Vc escolheu op��o errada \n" + escolha);
			}// fim do switch			
		}// fim 1� else if
//******************************fim do 1 stage********************************************
		else if (opcao.equalsIgnoreCase("d")) {
			System.out.println("Vc escolheu Virar a Direita \n");
			System.out.println("Apareceu um inimigo, escolha (a) Atacar ou (r) Correr \n ");
			escolha = var.nextLine();
			switch (escolha) {
			case "a":
			case "A": System.out.println("vc escolheu atacar \n");
			if (num < 75) {
				System.out.println("Vc ganhou \n");					
			}
			else {
				System.out.println("Vc perdeu  fim do jogo \n");
			}
			break;
			case "r":
			case "R": System.out.println("Vc escolheu correr \n");
			if (num < 75) {
				System.out.println("Vc fugiu e sobre viveu \n");				
			}
			else {
				System.out.println("Vc perdeu fim do jogo \n");
			}break;		

			default:
				throw new IllegalArgumentException("Vc escolheu op��o errada \n" + escolha);
			}// fim do switch	
			
				
			}// fim 2� else if
		//******************************fim do 2 stage********************************************		
		else  if (opcao.equalsIgnoreCase("s")) {
			System.out.println("Vc escolheu Virar a Voltar \n");
			System.out.println("Apareceu um inimigo, escolha (a) Atacar ou (r) Correr \n ");
			escolha = var.nextLine();
			switch (escolha) {
			case "a":
			case "A": System.out.println("vc escolheu atacar \n");
			if (num < 75) {
				System.out.println("Vc ganhou \n");					
			}
			else {
				System.out.println("Vc perdeu  fim do jogo \n");
			}
			break;
			case "r":
			case "R": System.out.println("Vc escolheu correr \n");
			if (num < 75) {
				System.out.println("Vc fugiu e sobre viveu \n");				
			}
			else {
				System.out.println("Vc perdeu fim do jogo \n");
			}
			break;
			default:
				throw new IllegalArgumentException("Vc escolheu op��o errada \n" + escolha);	
			
			}// fim do switch		
			
		}// fim 3� else if
		else {
			System.out.println(" Op��o errada, fim do Jogo \n ");
		}// fim do else geral

	}// fim do main

}// fim da classe
