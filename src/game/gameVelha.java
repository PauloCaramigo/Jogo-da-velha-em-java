package game;

import java.util.Random;
import java.util.Scanner;

public class gameVelha {
	static String[] game = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
	static Scanner scn = new Scanner(System.in);
	static Random numRandom = new Random();
	static boolean cont;
	
	public static void Velha() {
		
		System.out.println("\n " + game[0] + " | " + game[1] + " | " + game[2] + " \n"
						 + "---+---+---\n"
						 + " " + game[3] + " | " + game[4] + " | " + game[5] + " \n"
						 + "---+---+---\n"
						 + " " + game[6] + " | " + game[7] + " | " + game[8] + " \n");
	}
	
	public static void game() {
		System.out.println("Deseja começar o jogo?\n1- Sim | 2- Não");
		int res = scn.nextInt();
		
		
		if (res == 1) {
			cont = true;
			while (cont == true) {
				Velha();
				System.out.println("\nEm qual posição deseja jogar?\nPosições marcadas de 1 a 9");
				int escolha = scn.nextInt();
				
				if(escolha > 0 && escolha < 10 && game[escolha - 1] == " ") {
					game[escolha-1] = "x" ;
					W_L();
						
					// BOT jogando
					if(cont == true) {
						int sort = numRandom.nextInt(9);
						while (game[sort] != " ") {
							sort = numRandom.nextInt(9);
						}
						game[sort] = "o";
						System.out.println("\nBot jogou!\n");
						W_L();
					}
						
				} else {
					System.out.println("Escolha uma posição correta!");
				}
			}
		} else if (res == 2) {
			System.out.println("Fechando programa...");
			System.exit(0);
		} else {
			System.out.println("\nResposta invalida!!!\nTente novamente.");
			game();
		}
	}
	public static void W_L() {
		if(game[0] != " " && game[0] == game[1] && game[1] == game[2]) {
			if(game[0]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		} else if(game[3] != " " && game[3] == game[4] && game[4] == game[5]) {
			if(game[3]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		} else if(game[6] != " " && game[6] == game[7] && game[7] == game[8]) {
			if(game[6]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		} else if(game[0] != " " && game[0] == game[3] && game[3] == game[6]) {
			if(game[0]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		} else if(game[1] != " " && game[1] == game[4] && game[4] == game[7]) {
			if(game[1]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		} else if(game[2] != " " && game[2] == game[5] && game[5] == game[8]) {
			if(game[2]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		} else if(game[0] != " " && game[0] == game[4] && game[4] == game[8]) {
			if(game[0]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		} else if(game[2] != " " && game[2] == game[4] && game[4] == game[6]) {
			if(game[2]=="x") {
				Velha();
				System.out.println("Parabéns, você ganhou!");
				cont = false;
				game();
			} else {
				Velha();
				System.out.println("Você perdeu!");
				cont = false;
				game();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game();
	}

}
