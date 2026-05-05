package com.srm.java;

import java.util.Random;

public class TicTacToe7 {

    // Method to place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method for computer random move
    public static void computerMove(char[][] board) {
        Random rand = new Random();
        int row, col;

        // Loop until valid move is found
        while (true) {
            int slot = rand.nextInt(9) + 1; // 1–9

            // Convert slot to row & column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if empty
            if (board[row][col] == ' ') {
                placeMove(board, row, col, 'O');
                System.out.println("Computer placed 'O' at position: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        // Initialize board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        // Computer move
        computerMove(board);

        // Print board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
