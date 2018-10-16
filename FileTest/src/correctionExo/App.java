package correctionExo;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		Client cl1 = new Client("Bob", "Morane", 12);
		Client cl2 = new Client("Bruce", "Wayne", 3);
		Client cl3 = new Client("Dallas", "Corben", 10);

		Client[] clients = new Client[3];

		clients[0] = cl1;
		clients[1] = cl2;
		clients[2] = cl3;

		WFichierClient test = new WFichierClient();

		String fichier = System.getProperty("user.dir") + "\\clients2.txt";
		try {
			test.ecrire(clients, fichier);
			for (Client clicli : RFichierClient.lire(fichier)) {
				System.out.println(clicli);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
