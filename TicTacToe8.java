package com.srm.java;

import java.util.Random;

public class TicTacToe8 {

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Computer random move
    public static void computerMove(char[][] board) {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1;
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            if (board[row][col] == ' ') {
                placeMove(board, row, col, 'O');
                System.out.println("Computer placed at: " + slot);
                break;
            }
        }
    }

    // Check winner
    public static boolean checkWin(char[][] b, char s) {
        // rows, columns, diagonals
        return (b[0][0]==s && b[0][1]==s && b[0][2]==s) ||
               (b[1][0]==s && b[1][1]==s && b[1][2]==s) ||
               (b[2][0]==s && b[2][1]==s && b[2][2]==s) ||
               (b[0][0]==s && b[1][0]==s && b[2][0]==s) ||
               (b[0][1]==s && b[1][1]==s && b[2][1]==s) ||
               (b[0][2]==s && b[1][2]==s && b[2][2]==s) ||
               (b[0][0]==s && b[1][1]==s && b[2][2]==s) ||
               (b[0][2]==s && b[1][1]==s && b[2][0]==s);
    }

    // Check draw
    public static boolean isDraw(char[][] b) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Print board
    public static void printBoard(char[][] b) {
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i][0] + " | " + b[i][1] + " | " + b[i][2]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        boolean gameOver = false;
        char currentPlayer = 'X';

        while (!gameOver) {

            if (currentPlayer == 'X') {
                // For demo: fixed move
                placeMove(board, 0, 0, 'X');
                System.out.println("Player X moved");
            } else {
                computerMove(board);
            }

            printBoard(board);

            // Check win
            if (checkWin(board, currentPlayer)) {
                System.out.println(currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (isDraw(board)) {
                System.out.println("It's a draw!");
                gameOver = true;
            }

            // Switch turn
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}