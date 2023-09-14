package org.java;

import java.util.Random;

public class Snack3 {

	public static void main(String[] args) {
		// Snack3
		// Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

		Random rnd = new Random();
		int[] numArr = new int[rnd.nextInt(10, 20)];
		int sum = 0;
		for (int i = 0; i < numArr.length; i++) {
			int newNum = rnd.nextInt(100);
			numArr[i] = newNum;
			if (i % 2 != 0) {
				sum += newNum;
			}
		}
		
		System.out.println("La somma è: " + sum);
	}

}
