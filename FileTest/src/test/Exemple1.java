package test;

import java.io.File;
import java.io.FileFilter;

public class Exemple1 {
	
	public static void main(String[] args) {
	// r�pertoire de recherche

	String rep = "C:\\Users\\Pierre\\Documents\\eclipseWorkspaceSimplon\\FileTest\\src\\test" ;

	// construction d'un fichier sur ce r�pertoire

	File repFile = new File(rep);

	// filtrage du contenu de ce r�pertoire

	// on passe en param�tre une instance de classe anonyme

	File [] fichiersJava = repFile.listFiles(new FileFilter() {

	// cette interface n'a qu'une unique m�thode

	public boolean accept(File pathname) {

	// on r�cup�re le nom de ce fichier...

	String fileName = pathname.getName() ;

	// ... et on teste s'il se termine par .java

	return fileName.endsWith(".java") ;
	
	

	}}) ;
	for(File path:fichiersJava) {
		System.out.println(path);
	}
}}
