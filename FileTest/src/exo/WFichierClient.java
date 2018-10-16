package exo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WFichierClient {

	public WFichierClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void ecrire(Client[] myClient, String myFile) throws IOException {

		FileWriter f = new FileWriter(myFile);
		BufferedWriter w = new BufferedWriter(f);

		for (Client client : myClient) {
			w.write(client.toString() + "\n");

		}
		w.close();

	}

	public static void main(String[] args) {
		Client client1 = new Client("Lavoinon", "Hubert", 1);
		Client client2 = new Client("Loisel", "Dominick", 2);
		Client client3 = new Client("Poulouin", "Pierre", 3);

		Client[] tabClient = new Client[3];

		tabClient[0] = client1;
		tabClient[1] = client2;
		tabClient[2] = client3;

		File fichierClients = new File("clients.txt");

		try {
			fichierClients.createNewFile();
			ecrire(tabClient, "clients.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
