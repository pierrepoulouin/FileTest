package test;

import java.io.File;

public class CreationFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("Monfic.txt");

		//Crée un repertoire
		File rep = new File("MonRep");
		rep.mkdir();
		
		//Lire l'ensemble du repertoire
		if (rep.isDirectory()) {
			String[] contenuRep = rep.list();
			for (int i =0; i < contenuRep.length; i++) {
				System.out.println(contenuRep[i]);
			}
		}
		
		//Obtenir le chemin absolu d'un fichier ou repertoire
		System.out.println(rep.getAbsolutePath());
		
		//Supprimer un fichier
		boolean supprime = f.delete();


	}

}
