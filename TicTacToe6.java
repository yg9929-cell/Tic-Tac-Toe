package com.srm.java;

public class TicTacToe6 {

    // Method to place move on the board
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol; // updating board
    }

    public static void main(String[] args) {

        // Initialize board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        int row = 1;
        int col = 1;
        char symbol = 'X';

        // Place move
        placeMove(board, row, col, symbol);

        // Print updated board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
