package correctionExo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WFichierClient {

	public WFichierClient() {
		// TODO Auto-generated constructor stub
		super();
	}

	public void ecrire(Client[] clients, String fichier) throws IOException {

		FileWriter fw = new FileWriter(fichier);
		BufferedWriter bw = new BufferedWriter(fw);

		for (Client objectClient : clients) {
			bw.write(objectClient.toString());
		}
		bw.close();
	}

}
