package org.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		// Snack1
		// Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println((num % 2 == 0) ? num : num + 1);
	}

}
