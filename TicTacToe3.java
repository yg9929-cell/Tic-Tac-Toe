package com.srm.java;
import java.util.Scanner;
public class TicTacToe3 {

	 public static void main(String[] args) {
	     int slot = getUserSlot();
	     System.out.println("Slot entered: " + slot);
	 }

	 // Reads an integer slot value from the user
	 static int getUserSlot() {
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter slot number (1-9): ");
	     int slot = scanner.nextInt();
	     return slot;
	 }
}