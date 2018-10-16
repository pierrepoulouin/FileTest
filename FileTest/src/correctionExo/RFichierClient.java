package correctionExo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RFichierClient {

	public static int compterLignes(BufferedReader br) throws IOException {
		// permet de stocker le contenu de chaque ligne
		String line;
		// permet de stocker le nombre de ligne
		int nbLines = 0;
		// On parcourt le fichier pour conna�tre le nombre de ligne
		// afin de d�finir la taille du tableau
		while ((line = br.readLine()) != null) {
			nbLines++;

		}
		br.close();
		return nbLines;
	}

	public static Client[] lire(String myFile) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File(myFile)));

		//Je d�clare mon tableau de client avec pour taille le retour de la methode compterLignes
		//
		Client[] clients = new Client[compterLignes(br)];
		
		br = new BufferedReader(new FileReader(new File(myFile)));
		
		int i = 0;
		String line;
		while ((line = br.readLine()) != null) {
			//On d�coupe la ligne en substring gr�ce au caract�re ":"
			//Chaque substring est utlis�e en argument du constructeur de la classe client
			clients[i] = new Client
					//Argument1: Le nom
					(line.substring(line.lastIndexOf(":"), line.length()),
							//Argument2: Le pr�nom
							line.substring(line.indexOf(":"), line.lastIndexOf(":")),
							//Argument3: La reference
							Integer.parseInt(line.substring(0,line.indexOf(":"))));

			i++;


		}
		return clients;
	}

}
