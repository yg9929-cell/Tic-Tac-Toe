package com.srm.java;

public class TicTacToe5 {

    // Method to validate user move
    public static boolean validateMove(char[][] board, int row, int col) {

        // Boundary Checking (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds!");
            return false;
        }

        // Check if the cell is empty
        if (board[row][col] != ' ') {
            System.out.println("Invalid move: Cell already occupied!");
            return false;
        }

        // Move is valid
        return true;
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        int row = 1;
        int col = 1;

        // Validate move
        if (validateMove(board, row, col)) {
            board[row][col] = 'X';
            System.out.println("Move accepted!");
        } else {
            System.out.println("Move rejected!");
        }
    }
}
