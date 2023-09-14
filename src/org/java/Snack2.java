package org.java;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		// Snack2
		// Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, 
		// da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
		
		String[] names = {
				"Marco",
				"Matteo",
				"Luca",
				"Giovanni",
				"Paolo",
				"Piero",
				"Andrea"
		};
		
		String[] lastnames = {
				"Rossi",
				"Bianchi",
				"Verdi",
				"Molteni",
				"Marrazzo",
				"Giuli"
		};
		
		String[] invitedPeople = new String[10];
		
		for (int i = 0; i < invitedPeople.length; i++) {
			
			Random rnd = new Random();
			
			int nameIndex = rnd.nextInt(0, names.length - 1);
			int lastnameIndex = rnd.nextInt(0, lastnames.length - 1);
			
			invitedPeople[i] = names[nameIndex] + " " + lastnames[lastnameIndex];
			
			System.out.println(names[nameIndex] + " " + lastnames[lastnameIndex]);
		}
	}

}
