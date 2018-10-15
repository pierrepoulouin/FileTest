package test;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//J'affiche le chemin relatif de la Classe
		System.out.println(System.getProperty("user.dir"));

		//Je crée un objet test de la classe StringBuffer
		StringBuffer test = new StringBuffer();

		//StringBuffer permet d'éviter la concaténation des chaînes de caractère 
		//separator pour les Strings
		//separatorChar pour les char
		test.append("test").append(File.separator).append("oui");

		System.out.println(test);
		
		Employe toto = new Employe();
		
		Employe toto2 = new Employe("Dom", "Loisel", 20);
		
		toto2.setNumSecu(8989898);
		
		System.out.println(toto2);
		
		//On affiche le chemin des fichiers temporaires 
		System.out.println(System.getProperty("java.io.tmpdir"));
		
		Exemple1 test1 = new Exemple1();
		

	}

	

}
