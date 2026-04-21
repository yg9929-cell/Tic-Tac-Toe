package com.srm.java;
import java.util.Random;
public class TicTacToe2 {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Performs random toss and assigns symbols
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Displays result
    static void displayTossResult() {
        System.out.println("Toss Result: " + (isHumanTurn ? 0 : 1));

        if (isHumanTurn) {
            System.out.println("First Player: Human");
        } else {
            System.out.println("First Player: Computer");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}