package org.java;

import java.util.Random;

public class Snack8 {

	public static void main(String[] args) {
		// Snack 8
		// Creare un array di 10 interi randomici compresi tra 100 e 150. 
		// Stampare tutti i valori contenuti nell'array (dopo averli inseriti). 
		// Stampare inoltre il valore minimo, massimo e la media

		Random rnd = new Random();
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100, 150);
			System.out.println("Valore inserito: " + arr[i]);
		}
		
		int minV = arr[0], maxV = arr[0], avg = 0;
		
		for (int j = 0; j < arr.length; j++) {
			avg += arr[j];
			minV = (minV < arr[j]) ? minV : arr[j];
			maxV = (maxV > arr[j]) ? maxV : arr[j];
		}
		
		avg = avg / arr.length;
		System.out.println(
				"\n"
				+ "Il valore minimo è: " + minV
				+ "\n"
				+ "Il valore massimo è: " + maxV
				+ "\n"
				+ "La media è: " + avg);
	}

}
