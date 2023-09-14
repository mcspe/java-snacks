package org.java;

import java.util.Scanner;

public class Snack9 {

	public static void main(String[] args) {
		// Snack 9
		// Chiedere all'utente numeri interi e calcolarene la somma. 
		// Continuare a chiedere numeri, finche' la sommatoria non supera il valore 1000

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		do {
			System.out.print("Inserisci un numero: ");
			sum += sc.nextInt();
			System.out.println("Somma numeri inseriti: " + sum);
		} while (sum <= 1000);
		
		sc.close();
		
	}

}
