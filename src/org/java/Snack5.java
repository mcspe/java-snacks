package org.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		// Snack5
		// Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, 
		// quanti numeri e quanti simboli non alfanumerici.
		// Continuare a chiedere una nuova stringa finchè non si inserisce 0.

		Scanner sc = new Scanner(System.in);
		
		String input = "";
		
		do {
			System.out.print("Scrivi qualcosa: ");
			input = sc.nextLine();
			
			int numbers = 0;
			int letters = 0;
			int specials = 0;
			
			for(int i = 0; i < input.length(); i++) {
				if(Character.isDigit(input.charAt(i))) {
					numbers++;
				}
				else if(Character.isLetter(input.charAt(i))) {
					letters++;
				} else {
					specials++;
				}
			}
			System.out.println("\nHai inserito " + numbers + " numeri, " + letters + " lettere e " + specials + " caratteri speciali.\n");
		} while (!input.equals("0"));
		
		sc.close();
		
	}

}
