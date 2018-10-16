package test;

import java.io.File;
import java.io.IOException;

public class CreationFichier {

	public static void main(String[] args) throws IOException {

		//Crée un fichier et affiche son chemin relatif
		File f = new File(System.getProperty("user.dir") + "\\Monfic.txt");

		/*verifier si le fichier existe
		if (f.exists()) {
			System.out.println("Le fichier existe déjà !");
		} */

		//Ou autre méthode
		boolean check = false;
		check = f.createNewFile();
		System.out.println("\""+ check + "\" " +" Le fichier " + f + "est crée");

		//Crée un repertoire
		File rep = new File("MonRep");
		rep.mkdir();

		//On bouge notre fichier f dans le repertoire rep
		f.renameTo(new File(System.getProperty("user.dir") + "\\MonRep\\Monfic.txt"));

		//Lire l'ensemble du repertoire
		if (rep.isDirectory()) {
			String[] contenuRep = rep.list();
			
			//Pour chaque contenu de mon tableau contenuRep
			for (String contenu : contenuRep) {
				//J'imprime
				System.out.println("Voici le contenu du repertoire " + rep + " :" + contenu);
			}
		}



		//Obtenir le chemin absolu d'un fichier ou repertoire
		System.out.println(rep.getAbsolutePath());

		//Supprimer un fichier (le fichier f dans cet exemple)
		boolean supprime = f.delete();
		System.out.println(supprime);


	}

}
