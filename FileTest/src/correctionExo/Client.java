package correctionExo;

public class Client {

	int reference;
	String prenom;
	String nom;

	// Constructeur avec 3 param�tres
	public Client( String prenom, String nom, int reference) {
		super();
		
		this.nom = prenom;
		this.prenom = nom;
		this.reference = reference;
	}

	// La m�thode toString
	@Override
	public String toString() {
		return reference + ":" + prenom + ":" + nom + "\n";
	}

	// G�n�ration des getters (car juste lecture) ou ACCESSEUR

	public int getReference() {
		return reference;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

}
