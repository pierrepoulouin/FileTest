package test;

import java.io.File;
import java.util.Arrays;

public class Exemple2 {

	public static void main(String[] args) {
		// liste des �l�ments racine du syst�me de fichier courant

		File [] roots = File.listRoots() ;

		// affichage du tableau r�sultat
		System.out.println(Arrays.toString(roots)) ;

	}

}
