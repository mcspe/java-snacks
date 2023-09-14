package org.java;

import java.util.Random;

public class Snack10 {

	public static void main(String[] args) {
		// Snack 10
		// Creare un array di 10 elementi randomici compresi tra 100 e 1000 e stampare:
			// tutti gli elementi pari
			// tutti gli elementi dispari
			// tutti gli elementi in indice pari
			// tutti gli elementi in indice dispari
		
		int[] arr = new int[10];
		int[] evenN = new int[10];
		int[] oddN = new int[10];
		int[] evenIn = new int[10];
		int[] oddIn = new int[10];
		
		Random rnd = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100, 1000);
			
			if (arr[i] % 2 == 0) {
				evenN[i] = arr[i];
			} else {
				oddN[i] = arr[i];
			}
			
			if (i % 2 == 0) {
				evenIn[i] = arr[i];
			} else {
				oddIn[i] = arr[i];
			}
		}
		
		System.out.println("Elementi pari:");
		
		for (int j = 0; j < evenN.length; j++) {
			if (evenN[j] != 0) {
				System.out.println(evenN[j]);
			}
		}
		
		System.out.println("\nElementi dispari:");
		
		for (int j = 0; j < oddN.length; j++) {
			if (oddN[j] != 0) {
				System.out.println(oddN[j]);
			}
		}
		
		System.out.println("\nElementi ad indice pari:");
		
		for (int j = 0; j < evenIn.length; j++) {
			if (evenIn[j] != 0) {
				System.out.println(evenIn[j]);
			}
		}
		
		System.out.println("\nElementi pari:");
		
		for (int j = 0; j < oddIn.length; j++) {
			if (oddIn[j] != 0) {
				System.out.println(oddIn[j]);
			}
		}

	}

}
