package com.bridgelabz.functional;

import java.util.Scanner;

public class TicTacToe {
	public static int row, col;
	public static Scanner sc = new Scanner(System.in);
	public static char [][] board = new char[3][3];
	public static char turn = 'x';
	
	

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					board[i][j] = '_';
					
				
				}
			}
			play();
		}		
			public static void printBoard() {

				for(int i = 0; i < 3; i++) {
					System.out.println();
					for(int j = 0; j < 3; j++) {
						if(j == 0)
						  System.out.print(" | ");
						System.out.print(board[i][j] + " | ");
					}
				}
				System.out.println();
				
			}
			public static void play() {
				
				boolean playing = true;
				printBoard();
				while(playing) {
					System.out.println("Please enter a row and column");
					row = sc.nextInt();
					col = sc.nextInt();
					board[row][col] = turn;
					
					if(GameOver(row, col)) {
						playing = false;
						System.out.println(" GameOver! player " + turn + " Win! ");
						
							
					}
					printBoard();
					
					if(turn == 'x') 
						turn = 'O';
					else 
					
						turn = 'x';
					
				}
			}
			public static boolean GameOver(int rMove, int cMove) {
				// check perpendicular victory
				if(board[0][cMove] == board[1][cMove] && board[0][cMove] == board[2][cMove])
					return true;
				if(board[0][rMove] == board[1][rMove] && board[0][rMove] == board[2][rMove])
					return true;
				// check diagonal victory
				if(board[0][0] == board[1][1] && board[0][0] == board[2][2])
					return true;
				if(board[0][2] == board[1][1] && board[0][2] == board[2][0])
					return true;
				return false;
			}
			

		


	

}
