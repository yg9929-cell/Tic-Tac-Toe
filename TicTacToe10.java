package com.srm.java;

public class TicTacToe10 {

    // Method to check draw condition
    public static boolean isDraw(char[][] board) {

        // Traverse entire board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any empty cell exists → not a draw
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'O'}
        };

        if (isDraw(board)) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Game not finished.");
        }
    }
}