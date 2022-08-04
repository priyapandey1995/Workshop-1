package com.Bridgelabz;

public class TicTacToe {

	private static char[] board = new char[10];
	
	/**
	 *  UC-1 - This method is Assigning space to Board Array
	 */
	static void startGame() {
		for(int i = 1; i<= 9; i++) {
			board[i]= ' ';		
			}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Simulation");
		
		startGame();
		
	}

}
