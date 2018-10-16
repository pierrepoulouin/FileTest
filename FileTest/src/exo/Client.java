package exo;

public class Client {

	String nom;
	String prenom;
	int reference;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", reference=" + reference + "]";
	}

	public Client(String Pnom, String Pprenom, int Preference) {
		nom = Pnom;
		prenom = Pprenom;
		reference = Preference;
	}
}
