package com.tictactoa;

import java.util.*;

public class TicTacToe {

	int i;
	static char[] board = new char[10];// taking array
	static char player, computer;
	Scanner scan = new Scanner(System.in);// creating object

	public void initialize() {
		for (i = 1; i < 10; i++) { // initialize
			board[i] = ' ';
		}
	}

	public void check() { // creating method to select x & O
		System.out.println("Please Select Your Choice Letter : 'X' or 'O' ");
		char choice = scan.next().charAt(0);
		if (choice == 'X') {
			player = 'X';
			computer = 'O';
		} else if (choice == 'Y') {
			player = 'O';
			computer = 'X';
		}
	}

	public void showboard() {      // creating board
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]); 
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}

	public static void main(String[] args) {
		 TicTacToe obj = new TicTacToe();
	        obj.initialize();
	        obj.showboard();

	}
}