package org.java;

import java.util.Scanner;

public class Snack6 {

	public static void main(String[] args) {
		// Snack 6
		// Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
		// Possibile usare solo :
		// cicli
		// chartAt
		// if / switch
		// Es. “25” come stringa deve essere convertito in intero 25.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		String input = sc.nextLine();
		
		sc.close();
		
		boolean isNegative = false;
		int i = 0, number = 0;
		
		if (input.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
		
		while( i < input.length() ){
			number *= 10;
            number += ( input.charAt(i++) - '0' );
		}
		
		number = isNegative ? -number : number;
		
		System.out.println("Hai inserito \"" + input + "\", convertito in " + number);
		
	}

}
