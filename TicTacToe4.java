package com.srm.java;

public class TicTacToe4 {
public static void main(String[] args) {
	     int slot = 7;

	     System.out.println("Row: " + getRowFromSlot(slot));
	     System.out.println("Column: " + getColFromSlot(slot));
	 }

	 // Converts slot number into row index (0–2)
	 static int getRowFromSlot(int slot) {
	     return (slot - 1) / 3;
	 }

	 // Converts slot number into column index (0–2)
	 static int getColFromSlot(int slot) {
	     return (slot - 1) % 3;
	 }
}