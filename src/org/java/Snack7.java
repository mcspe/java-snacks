package org.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {
		// Snack 7
		// Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi
		// e mostri a video la stringa generata (secondi → “hh:mm:ss”)

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci i secondi da formattare: ");
		int input = sc.nextInt();
		
		sc.close();
		
		int ss = 0, mm = 0, hh = 0, remainder = 0;
		
		hh = input / 3600;
		remainder = input % 3600;
		mm = remainder / 60;
		remainder = remainder % 60;
		ss = (remainder < 60) ? remainder : remainder / 60;

		
		System.out.println(input + " secondi sono " + String.format("%02d:%02d:%02d", hh, mm, ss));
		
	}

}
