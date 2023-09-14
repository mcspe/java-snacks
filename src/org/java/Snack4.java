package org.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		// Snack4
		// Data in input una stringa verificare se è palindroma

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il testo: ");
		String input = sc.nextLine().trim().toLowerCase();
		
		sc.close();
		
		input = input.replaceAll("[^a-zA-Z0-9]", "");
		
		String reversedStr = "";
		char ch;
		
		for (int i = 0; i < input.length(); i++)
	    {
	      ch = input.charAt(i);
	      reversedStr = ch + reversedStr;
	    }
		System.out.println("\nTesto inserito: " + input);
		System.out.println("Testo invertito " + reversedStr + "\n");
		System.out.println((input.equals(reversedStr)) ? "Il testo è palindromo" : "Il testo non è palindromo");
	}

}
