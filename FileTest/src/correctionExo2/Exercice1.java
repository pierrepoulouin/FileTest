package correctionExo2;

import java.util.Scanner;

/* Le but de cet exercice est de calculer la moyenne de notes donn�es au clavier.
 *  Le syst�me demande des notes jusqu'� ce que le mot cl� "fini� soit donn�.
 *   A ce moment l� le syst�me s'arr�te et affiche la moyenne.
 *    Il faudra faire attention � ce que chaque note soit comprise entre 0 et 20
 *     et soit bien num�rique. Pour ceci nous allons utiliser System.in qui est un InputStream.
 *      Il est alors possible d'utiliser la classe Scanner permettant la lecture de l'entr�e avec
 *       Scanner scanner = new Scanner(System.in).
 *        La lecture du clavier se fait alors avec String line = scanner.nextLine().
 */

public class Exercice1 {

	public static int readNumber(String line) {

		int note = 0;
		// On transforme la chaine de caract�re en int
		try {
			note = Integer.parseInt(line);
			return note;
		} catch (NumberFormatException e) {
			System.out.println("Entrer un nombre");
			return -1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String line = null;
		double total = 0;
		int nbNote = 0;
		int statusNumber = 0;

		System.out.println("Start...");

		// Tant que l'input de l'utilisateur n'est pas �gal � fini la boucle continue
		while (!(line = scan.nextLine()).equals("fini")) {
			statusNumber = readNumber(line);
			if (statusNumber != -1) {
				// Equivaut � total = total + readNumber(line)
				total += statusNumber;
				nbNote++;
			}
		}
		//TODO gerer la division par 0
		System.out.println("la moyenne est de " + (total / nbNote));

	}

}
