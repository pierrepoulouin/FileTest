package exo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice1 {

	public static ArrayList<Integer> moyenne(Scanner s) {
		// On crée un tableau de note
		ArrayList<Integer> tabNote = new ArrayList<Integer>();
		// On initialise la variable note
		int note = 0;
		// On initialise la variable Line
		String line = "";
		Scanner sc = new Scanner(System.in);

		// On peut récupérer la ligne entrée par l'utilisateur
		do {
			System.out.println("Veuillez entrer la note: ");
			line = sc.nextLine();
			try {
				// On fait la conversion en entier
				note = Integer.parseInt(line);

				if (note >= 0 && note <= 20) {
					tabNote.add(note);
				} else {
					System.out.println("La note est incorrecte");
				}
			} catch (NumberFormatException e) {
				if (!line.equalsIgnoreCase("fini"))
					System.out.println("Le nombre n'est pas entier");
			}
		} while (!line.equalsIgnoreCase("fini"));

		return tabNote;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ouverture de l'entrée clavier
		Scanner s = new Scanner(System.in);
		// Recuperation de la liste des notes
		ArrayList<Integer> tabNote = moyenne(s);

		// Calcul du total
		Integer totalNotes = 0;
		for (Integer note : tabNote) {
			totalNotes += note;
		}
		// Calcul de la moyenne
		if (tabNote.size() > 0) {
			System.out.println("La moyenne est de " + (totalNotes / tabNote.size()));
		} else {
			System.out.println("Aucune note ");
		}
		// Fermeture de l'entrée clavier
		s.close();
	}

}
