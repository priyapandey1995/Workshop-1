package com.Bridgelabz;

import java.util.Scanner;

public class TicTacToe {

	private static char[] board = new char[10];
	
	static private char player1;
	
	static Scanner sc = new Scanner(System.in);
	/**
	 *  UC-1 - This method is Assigning space to Board Array
	 */
	static void startGame() {
		for(int i = 1; i<= 9; i++) {
			board[i]= ' ';		
			}
		
	}
	/**
	 * UC-2 - Taking Playing symbol from the user either X or O
	 */
	
	static void playerInput() {
		System.out.println("Please Select the Symbol (X/0 :");
		player1 = sc.next().charAt(0);
		if(player1 == 'X' || player1 == 'O') {
			System.out.println("Player 1 Symbol :"+player1);
		}
		else {
			System.out.println("Invalid Symbol: Please Enter the valid symbol");
			playerInput();
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Simulation");
		
		startGame();
		playerInput();
		
	}

}
